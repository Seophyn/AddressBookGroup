package Jimmy.AddressBookGroup.core;

import java.util.List;

public class CommandLine implements  InputHandler{

    String command;
    List<String> parameters;

    public static CommandLine parse(String string){
        CommandLine commandLine  = CommandLine.parse(string);
        return commandLine;
    }
}
