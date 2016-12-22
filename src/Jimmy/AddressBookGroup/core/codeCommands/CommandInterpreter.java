package Jimmy.AddressBookGroup.core.codeCommands;

import Jimmy.AddressBookGroup.core.Console;
import Jimmy.AddressBookGroup.core.formatPrinting.ConsolePrinter;
import Jimmy.AddressBookGroup.core.userCommands.*;


public class CommandInterpreter{

    private ConsolePrinter consolePrinter;

    public CommandInterpreter() {
        consolePrinter = new Console();
    }

    public void interpret(CommandLine commandLine) {

        try {
            switch(commandLine.command) {
                case ("add"):
                    new AddContactCommand(commandLine.parameters);
                    break;

                case ("delete"):
                    new DeleteContactCommand(commandLine.parameters);
                    break;

                case ("list"):
                    new ListCommand(commandLine.parameters);
                    break;

                case ("search"):
                    new SearchCommand(commandLine.parameters);
                    break;

                case ("quit"):
                    new QuitCommand(commandLine.parameters);
                    break;

                case ("help"):
                    new HelpCommand(commandLine.parameters);
                    break;
                default:
                    throw new InvalidCommandException();
            }
        } catch (InvalidCommandException e) {
            consolePrinter.print("Invalid command");
        }
    }
}
