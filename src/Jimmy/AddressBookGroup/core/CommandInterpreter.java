package Jimmy.AddressBookGroup.core;

public class CommandInterpreter{

    public void interpret(CommandLine commandLine) throws InvalidCommandException {
        switch(commandLine.command){
            case("add"):
                System.out.println(commandLine.parameters);

        }
    }
}
