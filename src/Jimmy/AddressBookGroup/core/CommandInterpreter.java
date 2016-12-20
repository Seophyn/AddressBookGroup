package Jimmy.AddressBookGroup.core;

public class CommandInterpreter{

    public void interpret(CommandLine commandLine) throws InvalidCommandException {
        switch(commandLine.command){
            case("add"):
                new AddContactCommand(commandLine.parameters, registry);

            case("delete"):
                new DeleteContactCommand(commandLine.parameters, registry);

            case("list"):
                new ListCommand();

            case("search"):
                new SearchCommand(commandLine.parameters, registry);

            case("quit"):
                Application.quit(); //todo INTE STATIC APPARENTLY, BULLSHIT.
                break;
            default:
                System.out.println("Invalid command.");
                break;


        }
    }
}
