package Jimmy.AddressBookGroup.core;

import java.util.List;

public class AddContactCommand implements Command {


    final static String name = "add";
    final static String description = "adds a new contact";
    List<String> parameters;

    public AddContactCommand(List<String> parameters){

        this.parameters = parameters;
    }

    public AddContactCommand() {
    }

    @Override
    public String getname() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void execute()  {

    }

    public void validate() throws InvalidCommandParameterException {
        //
    }
}
