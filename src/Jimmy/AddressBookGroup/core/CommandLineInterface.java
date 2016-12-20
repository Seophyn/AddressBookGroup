package Jimmy.AddressBookGroup.core;

public class CommandLineInterface implements InputHandler{

    CommandInterpreter commandInterpreter = new CommandInterpreter();

    @Override
    public void handle(CommandLine commandLine) {
        new Console().registerInputHandler(this);
        try {
            commandInterpreter.interpret(commandLine);
        } catch (InvalidCommandException e) {
            e.printStackTrace();
        }

    }
}
