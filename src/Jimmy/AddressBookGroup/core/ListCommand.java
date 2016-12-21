package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.*;

import java.util.ArrayList;
import java.util.List;

public class ListCommand implements Command {


    private final static String NAME = "list";
    private final static String DESCRIPTION = "list contact";
    private List<String> parameters;
    private ConsolePrinter consolePrinter;
    private List<Contact> tempList = new ArrayList<>();

    public ListCommand(List<String> parameters) {

        this.parameters = parameters;
        consolePrinter = new Console();
        tempList.addAll(Registry.getInstance().getContacts());
        tempList.addAll(RemoteRegistry.getInstance().getContacts());
        validate();
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

        if (tempList.isEmpty()) {
            consolePrinter.print("No contacts yet");
        }
        tempList = ContactListSorter.sort(tempList);
        consolePrinter.print(ContactFormatter.format(tempList));


    }

    @Override
    public void validate() {

        if (parameters.size() != 0) {
            try {
                throw new InvalidCommandParameterException();
            } catch (InvalidCommandParameterException e) {
                e.printStackTrace();
                consolePrinter.print("Invalid amount of parameters");

            }
        } else {
            execute();
        }
    }
}
