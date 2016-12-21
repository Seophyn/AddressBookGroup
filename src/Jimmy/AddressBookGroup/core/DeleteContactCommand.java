package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.Contact;
import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.Registry;

import java.util.List;

public class DeleteContactCommand implements Command {


    final static String NAME = "delete";
    final static String DESCRIPTION = "delete contact";
    List<String> parameters;
    List<Contact> tempList;



    ConsolePrinter consolePrinter;

    public DeleteContactCommand() {
    }

    public DeleteContactCommand(List<String> parameters){
        this.parameters = parameters;
        consolePrinter = new Console();
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
        for (int i = 0; i < Registry.getInstance().getContacts().size(); i++) {
            if (Registry.getInstance().getContacts().get(i).getId().equals(parameters.get(0))) {
                Registry.getInstance().deleteContact(i);
                consolePrinter.print("Contact was deleted");
            } else {
                consolePrinter.print("Contact was not deleted successfully");
            }
        }



    }

    @Override
    public void validate()  {
        if (parameters.size() != 1) {
            try {
                throw new InvalidCommandParameterException();
            } catch (InvalidCommandParameterException e) {
                e.printStackTrace();
            }
        } else {
            execute();
        }

    }

}
