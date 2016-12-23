package Jimmy.AddressBookGroup.core.codeCommands;

import Jimmy.AddressBookGroup.core.Console;
import Jimmy.AddressBookGroup.core.InputHandler;

public class CommandLineInterface implements InputHandler {

    private CommandInterpreter commandInterpreter = new CommandInterpreter();
    public Console console = new Console();

    @Override
    public void handle(CommandLine commandLine) {
        commandInterpreter.interpret(commandLine);
    }
}
