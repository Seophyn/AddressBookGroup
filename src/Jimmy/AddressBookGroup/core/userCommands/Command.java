package Jimmy.AddressBookGroup.core.userCommands;

public interface Command {

    String getName();
    String getDescription();
    void execute();
    void validate()throws InvalidCommandParameterException;

}
