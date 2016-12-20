package Jimmy.AddressBookGroup.core;

import java.util.List;

public class HelpCommand implements Command {
//TODO fixa namn variabler

    List<String> parameters;
    HelpMenu helpMenu;
    ConsolePrinter consolePrinter;

    public HelpCommand(List<String> parameters) {
        helpMenu = new HelpMenu();
        consolePrinter = new Console();
        this.parameters = parameters;
    }

    public HelpCommand() {

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

        if (isValidParameterCount()){
            consolePrinter.print(format());
        } else {
            try {
                throw new InvalidCommandParameterException();
            } catch (InvalidCommandParameterException e) {
                //TODO remove stacktrace
                e.printStackTrace();
                consolePrinter.print("Invalid amount of parameters");
            }
        }

    }

    @Override
    public boolean isValidParameterCount() {
        if (parameters.size() > 0) {
            return false;
        }
        return true;
    }

    public String format(){
        String s = "";

        for (Command command: helpMenu.getCommands())
           s+= command.getname() + "\t" + command.getDescription() + "\n"; {

        }
        return s;

    }




}
