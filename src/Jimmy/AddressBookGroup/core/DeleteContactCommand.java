package Jimmy.AddressBookGroup.core;

import java.util.List;

public class DeleteContactCommand implements Command {


    List<String> parameters;

    public DeleteContactCommand() {
    }

    public DeleteContactCommand(List<String> parameters){

        this.parameters = parameters;
    }


    @Override
    public String getname() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void execute()  {

    }

    @Override
    public void validate() throws InvalidCommandParameterException {

    }

}
