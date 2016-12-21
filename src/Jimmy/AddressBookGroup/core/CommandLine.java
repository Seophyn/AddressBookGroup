package Jimmy.AddressBookGroup.core;

import java.util.ArrayList;
import java.util.List;

public class CommandLine{

    String command;
    List<String> parameters = new ArrayList<>();

    private CommandLine (){

    }

    public static CommandLine parse(String string){
        CommandLine commandLine = new CommandLine();
        String[] tmpArray = string.split(" ");
        commandLine.command = tmpArray[0];
        tmpArray[0] = null;
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] != null){
                commandLine.parameters.add(tmpArray[i]);
            }
        }
        return commandLine;
    }
}
