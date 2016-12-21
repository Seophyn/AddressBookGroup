package Jimmy.AddressBookGroup.core;

import java.util.ArrayList;
import java.util.List;

public class HelpMenu {
    List<Command> commands;

    public HelpMenu() {
        build();
    }

    public void build() {
        commands = new ArrayList<>();
        commands.add(new AddContactCommand());
        commands.add(new ListCommand());
        commands.add(new SearchCommand());
        commands.add(new DeleteContactCommand());
        commands.add(new QuitCommand());
        commands.add(new HelpCommand());
    }

    public List<Command> getCommands() {
        return commands;
    }
}
