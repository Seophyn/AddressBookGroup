package Jimmy.AddressBookGroup.core.userCommands;

import Jimmy.AddressBookGroup.core.Console;
import Jimmy.AddressBookGroup.core.formatPrinting.ConsolePrinter;
import Jimmy.AddressBookGroup.core.contactRegistry.Registry;

import java.util.List;

public class AddContactCommand implements Command {


    private final static String NAME = "add";
    private final static String DESCRIPTION = "adds a new contact";
    private List<String> parameters;
    private ConsolePrinter consolePrinter;


    public AddContactCommand(List<String> parameters) {
        this.parameters = parameters;
        consolePrinter = new Console();
        validate();
    }

    public AddContactCommand() {
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
        Registry.getInstance().addContact(parameters.get(0), parameters.get(1), parameters.get(2));
        consolePrinter.print("Contact successfully added");
    }

    public void validate() {
        if (parameters.size() != 3) {

            try {
                throw new InvalidCommandParameterException();
            } catch (InvalidCommandParameterException e) {
                consolePrinter.print("Invalid amount of parameters");
            }

        } else {
            execute();
        }

        //
    }
}
