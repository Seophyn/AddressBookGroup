package Jimmy.AddressBookGroup.core;

public class CommandInterpreter{

    public void interpret(CommandLine commandLine) throws InvalidCommandException {
        switch(commandLine.command){
            case("add"):
                new AddContactCommand();

            case("delete"):
                new DeleteContactCommand();

            case("list"):
                new ListCommand();

            case("search"):
                new SearchCommand();

            case("quit"):
                new QuitCommand(); //todo INTE STATIC APPARENTLY, BULLSHIT.
                break;
            case ("help"):
                new HelpCommand();
            default:
                System.out.println("Invalid command.");
                break;


        }
    }
}
