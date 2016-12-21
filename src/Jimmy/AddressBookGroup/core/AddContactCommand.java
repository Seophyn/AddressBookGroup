package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.Registry;

import java.util.ArrayList;
import java.util.List;

public class AddContactCommand implements Command {


    final static String NAME = "add";
    final static String DESCRIPTION = "adds a new contact";
    List<String> parameters = new ArrayList<>();
    ConsolePrinter consolePrinter;


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
                e.printStackTrace();

            }

        } else {
            execute();
        }

        //
    }
}
