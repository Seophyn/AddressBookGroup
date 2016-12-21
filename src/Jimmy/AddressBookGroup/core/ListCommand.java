package Jimmy.AddressBookGroup.core;

import java.util.List;

public class ListCommand implements Command {



    final static String name = "list";
    final static String description = "list contact";
    List<String> parameters;

    public ListCommand(List<String> parameters){

        this.parameters = parameters;
    }

    public ListCommand() {
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
    public void execute() {

    }

    @Override
    public void validate() throws InvalidCommandParameterException {

    }
}
