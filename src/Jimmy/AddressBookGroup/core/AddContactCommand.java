package Jimmy.AddressBookGroup.core;

import java.util.List;

public class AddContactCommand implements Command {


    final static String NAME = "add";
    final static String DESCRIPTION = "adds a new contact";
    List<String> parameters;

    public AddContactCommand(List<String> parameters){

        this.parameters = parameters;
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
    public void execute()  {

    }

    public void validate() throws InvalidCommandParameterException {
        //
    }
}
