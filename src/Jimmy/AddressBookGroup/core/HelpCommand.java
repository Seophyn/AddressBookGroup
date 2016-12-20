package Jimmy.AddressBookGroup.core;

import java.util.List;

/**
 * Created by daniellindkarlberg on 2016-12-20.
 */
public class HelpCommand implements Command {
HelpMenu helpMenu = new HelpMenu();
    ConsolePrinter cp = new Console();

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


    public String format(){
        String s = "";

        for (Command command: helpMenu.getCommands())
           s+= command.getname() + "\t" + command.getDescription() + "\n"; {



        }
return s;

    }




}
