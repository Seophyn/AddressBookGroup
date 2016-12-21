package Jimmy.AddressBookGroup.core;

public interface Command {

    String getName();
    String getDescription();
    void execute();
    void validate()throws InvalidCommandParameterException;

}
