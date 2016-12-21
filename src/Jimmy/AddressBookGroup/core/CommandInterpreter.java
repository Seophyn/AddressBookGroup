package Jimmy.AddressBookGroup.core;

public class CommandInterpreter{

    public void interpret(CommandLine commandLine) throws InvalidCommandException {
        switch(commandLine.command){
            case("add"):
                new AddContactCommand(commandLine.parameters);

            case("delete"):
                new DeleteContactCommand(commandLine.parameters);

            case("list"):
                new ListCommand(commandLine.parameters);

            case("search"):
                new SearchCommand(commandLine.parameters);

            case("quit"):
                new QuitCommand(commandLine.parameters);
                break;
            case ("help"):
                new HelpCommand();
            default:
                System.out.println("Invalid command.");
                break;


        }
    }
}
