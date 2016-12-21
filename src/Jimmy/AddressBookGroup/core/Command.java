package Jimmy.AddressBookGroup.core;

public interface Command {

    String getname();
    String getDescription();
    void execute();
    void validate()throws InvalidCommandParameterException;

}
