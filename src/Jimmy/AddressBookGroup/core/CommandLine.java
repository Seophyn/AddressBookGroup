package Jimmy.AddressBookGroup.core;

import java.util.Arrays;
import java.util.List;

public class CommandLine{

    private String command;
    private List<String> parameters;

    public static CommandLine parse(String string){
        CommandLine commandLine = new CommandLine();
        commandLine.parameters = Arrays.asList(string.split(" "));
        commandLine.command = commandLine.parameters.get(0);
        commandLine.parameters.remove(0);
        return commandLine;
    }
}
