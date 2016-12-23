package Jimmy.AddressBookGroup.core.userCommands;

import Jimmy.AddressBookGroup.core.Console;
import Jimmy.AddressBookGroup.core.formatPrinting.ConsolePrinter;
import Jimmy.AddressBookGroup.core.contactRegistry.Contact;
import Jimmy.AddressBookGroup.core.formatPrinting.ContactListSorter;
import Jimmy.AddressBookGroup.core.contactRegistry.Registry;
import Jimmy.AddressBookGroup.core.contactRegistry.RemoteRegistry;

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
            if (contact.getFirstName().toLowerCase().startsWith(parameters.get(0).toLowerCase())
                    || contact.getLastName().toLowerCase().startsWith(parameters.get(0).toLowerCase())) {

                consolePrinter.print("ID: " + contact.getId() + '\n' +
                        "Firstname: " + contact.getFirstName() + '\n' +
                        "Lastname: " + contact.getLastName() + '\n' +
                        "E-mail address: " + contact.getEmailAddress() + '\n');
                found = true;
            }

        }
        if (!found) {
            consolePrinter.print("Contact not found");
        }
    }

    @Override
    public void validate() {

        if (parameters.size() != 1) {
            try {
                throw new InvalidCommandParameterException();
            } catch (InvalidCommandParameterException e) {
                consolePrinter.print("Invalid amount of parameters");
            }
        }
        execute();

    }
}

