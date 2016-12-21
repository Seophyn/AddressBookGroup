package Jimmy.AddressBookGroup.core;

public class CommandInterpreter{

    public void interpret(CommandLine commandLine) throws InvalidCommandException {
        switch(commandLine.command){
            case("add"):
                new AddContactCommand(commandLine.parameters);
                break;

            case("delete"):
                new DeleteContactCommand(commandLine.parameters);
                break;

            case("list"):
                new ListCommand(commandLine.parameters);
                break;

            case("search"):
                new SearchCommand(commandLine.parameters);
                break;

            case("quit"):
                new QuitCommand(commandLine.parameters);
                break;
            case ("help"):
                new HelpCommand(commandLine.parameters);
                break;
            default:
                System.out.println("Invalid command.");
                break;


        }
    }
}
