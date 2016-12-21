package Jimmy.AddressBookGroup.core;

import java.util.List;

public class QuitCommand implements Command {


    final static String name = "quit";
    final static String description = "quit application";
    List<String> parameters;

    public QuitCommand(List<String> parameters){

        this.parameters = parameters;
    }

    public QuitCommand() {
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

    @Override
    public void validate() throws InvalidCommandParameterException{

    }
}
