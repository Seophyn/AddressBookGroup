package Jimmy.AddressBookGroup.core;

import java.util.List;

public class ListCommand implements Command {


    List<String> parameters;

    public ListCommand(List<String> parameters){

        this.parameters = parameters;
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
    public void execute() throws InvalidCommandParameterException {

    }

    @Override
    public boolean isValidParameterCount() {
        return false;
    }
}
