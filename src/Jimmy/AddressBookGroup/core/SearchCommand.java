package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.Contact;
import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.ContactListSorter;
import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.Registry;
import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.RemoteRegistry;

import java.util.ArrayList;
import java.util.List;

public class SearchCommand implements Command {


    private final static String NAME = "search";
    private final static String DESCRIPTION = "search contacts";
    private List<String> parameters;
    private ConsolePrinter consolePrinter;
    private List<Contact> tempList = new ArrayList<>();

    public SearchCommand() {
    }

    public SearchCommand(List<String> parameters) {
        consolePrinter = new Console();
        this.parameters = parameters;
        tempList.addAll(Registry.getInstance().getContacts());
        tempList.addAll(RemoteRegistry.getInstance().getContacts());
        validate();
    }


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void execute() {
boolean found = false;
        tempList = ContactListSorter.sort(tempList);
        for (Contact contact : tempList
                ) {
            if (contact.getFirstName().startsWith(parameters.get(0))
                    || contact.getLastName().startsWith(parameters.get(0))) {

                consolePrinter.print("ID: " + contact.getId() + '\n' +
                        "Firstname: " + contact.getFirstName() + '\n' +
                        "Lastname: " + contact.getLastName() + '\n' +
                        "E-mail address: " + contact.getEmailAddress() + '\n');
                found = true;
            }

        }
       if(!found){
        consolePrinter.print("Contact not found");
       }
    }

    @Override
    public void validate() {

        if (parameters.size() != 1) {
            try {
                throw new InvalidCommandParameterException();
            } catch (InvalidCommandParameterException e) {
                e.printStackTrace();
                consolePrinter.print("Invalid amount of parameters");
            }
        }
        execute();

    }
}

