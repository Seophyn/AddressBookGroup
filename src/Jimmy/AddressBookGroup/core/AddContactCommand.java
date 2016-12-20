package Jimmy.AddressBookGroup.core;

import java.util.List;

public class AddContactCommand implements Command {

    //Registry registry;
    List<String> parameters;



    @Override
    public String getname() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void execute() throws InvalidCommandParameterException {

    }

    public void validate() {
        //
    }
}
