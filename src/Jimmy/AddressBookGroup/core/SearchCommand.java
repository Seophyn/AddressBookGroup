package Jimmy.AddressBookGroup.core;

import java.util.List;

public class SearchCommand implements Command {


    final static String name = "search";
    final static String description = "search contacts";
    List<String> parameters;

    public SearchCommand() {
    }

    public SearchCommand(List<String> parameters){

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
    public void execute()  {

    }

    @Override
    public void validate() throws InvalidCommandParameterException {
    }
}

