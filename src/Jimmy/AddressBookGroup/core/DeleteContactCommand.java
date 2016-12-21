package Jimmy.AddressBookGroup.core;

import java.util.List;

public class DeleteContactCommand implements Command {


    final static String NAME = "delete";
    final static String DESCRIPTION = "delete contact";
    List<String> parameters;
    ConsolePrinter consolePrinter;

    public DeleteContactCommand() {
    }

    public DeleteContactCommand(List<String> parameters){

        this.parameters = parameters;
        consolePrinter = new Console();
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
