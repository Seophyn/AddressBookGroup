public interface Command {

    String getname();
    String getDescription();
    void execute() throws InvalidCommandParameterException;
}
