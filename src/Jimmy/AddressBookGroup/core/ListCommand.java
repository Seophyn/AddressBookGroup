package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.Contact;
import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.Registry;
import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.RemoteRegistry;

import java.util.List;

public class ListCommand implements Command {



    final static String NAME = "list";
    final static String DESCRIPTION = "list contact";
    List<String> parameters;
    ConsolePrinter consolePrinter;
    List<Contact> tempList;

    public ListCommand(List<String> parameters){

        this.parameters = parameters;
        consolePrinter = new Console();
        tempList.addAll(Registry.getInstance().getContacts());
        tempList.addAll(RemoteRegistry.getInstance().getContacts());
    }

    public ListCommand() {
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void execute() {

        for (Contact contact: tempList
             ) {

        }

    }

    @Override
    public void validate() throws InvalidCommandParameterException {

    }
}
