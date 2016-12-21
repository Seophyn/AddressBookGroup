package Jimmy.AddressBookGroup.core;

import java.util.List;

public class QuitCommand implements Command {


    List<String> parameters;

    public QuitCommand(List<String> parameters){

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
