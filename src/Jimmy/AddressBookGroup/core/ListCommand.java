package Jimmy.AddressBookGroup.core;

import java.util.List;

public class ListCommand implements Command {



    final static String NAME = "list";
    final static String DESCRIPTION = "list contact";
    List<String> parameters;

    public ListCommand(List<String> parameters){

        this.parameters = parameters;
    }

    public ListCommand() {
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

    }

    @Override
    public void validate() throws InvalidCommandParameterException {

    }
}
