package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.Registry;
import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.RemoteRegistry;

import java.util.List;

public class DeleteContactCommand implements Command {

    //TODO testa delete funktion

    private final static String NAME = "delete";
    private final static String DESCRIPTION = "delete contact";
    private List<String> parameters;
    private ConsolePrinter consolePrinter;

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
                return;
            }
        }

        for (int i = 0; i < RemoteRegistry.getInstance().getContacts().size(); i++){
            if (RemoteRegistry.getInstance().getContacts().get(i).getId().equals(parameters.get(0))) {
                consolePrinter.print("Cannot delete remote contact");
                return;
            }
        }

        consolePrinter.print("Contact not found");

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
