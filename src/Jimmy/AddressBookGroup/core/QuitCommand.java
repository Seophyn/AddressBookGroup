package Jimmy.AddressBookGroup.core;

import java.util.List;

public class QuitCommand implements Command {


    final static String NAME = "quit";
    final static String DESCRIPTION = "quit application";
    List<String> parameters;

    public QuitCommand(List<String> parameters){

        this.parameters = parameters;
    }

    public QuitCommand() {
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

    @Override
    public void validate() throws InvalidCommandParameterException{

    }
}
