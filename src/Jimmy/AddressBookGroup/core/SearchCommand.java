package Jimmy.AddressBookGroup.core;

import java.util.List;

public class SearchCommand implements Command {


    final static String NAME = "search";
    final static String DESCRIPTION = "search contacts";
    List<String> parameters;

    public SearchCommand() {
    }

    public SearchCommand(List<String> parameters){

        this.parameters = parameters;
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
    public void validate() throws InvalidCommandParameterException {
    }
}

