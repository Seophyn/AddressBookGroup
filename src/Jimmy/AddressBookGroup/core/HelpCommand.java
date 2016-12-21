package Jimmy.AddressBookGroup.core;

import java.util.List;

public class HelpCommand implements Command {
//TODO fixa namn variabler

    final static String name = "help";
    final static String description = "Display help menu";
    List<String> parameters;
    HelpMenu helpMenu;
    ConsolePrinter consolePrinter;

    public HelpCommand(List<String> parameters) {
        helpMenu = new HelpMenu();
        consolePrinter = new Console();
        this.parameters = parameters;
        validate();
    }

    public HelpCommand() {

    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void execute() {
        consolePrinter.print(format());
    }

    @Override
    public void validate()  {
        if (parameters.size() > 0) {
            try {
                throw new InvalidCommandParameterException();
            } catch (InvalidCommandParameterException e) {
                e.printStackTrace();
            }
        } else {
            execute();
        }
    }

    public String format(){
        String s = "";

        for (Command command: helpMenu.getCommands())
           s+= command.getname() + "\t" + command.getDescription() + "\n"; {

        }
        return s;

    }
}
