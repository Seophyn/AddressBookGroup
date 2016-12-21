package Jimmy.AddressBookGroup.core.userCommands;

import Jimmy.AddressBookGroup.core.*;
import Jimmy.AddressBookGroup.core.formatPrinting.ConsolePrinter;
import Jimmy.AddressBookGroup.core.save.RegistryPersister;

import java.util.List;

public class QuitCommand implements Command {


    private final static String NAME = "quit";
    private final static String DESCRIPTION = "quit application";
    private List<String> parameters;
    private ConsolePrinter consolePrinter;
    public QuitCommand(List<String> parameters){

        this.parameters = parameters;
        consolePrinter = new Console();
        execute();

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
        new RegistryPersister().save();
        Application.quit();

    }

    @Override
    public void validate() throws InvalidCommandParameterException {

    }
}
