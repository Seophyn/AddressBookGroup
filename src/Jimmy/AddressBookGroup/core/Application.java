package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.codeCommands.CommandLineInterface;
import Jimmy.AddressBookGroup.core.remote.CatalogueLoader;
import Jimmy.AddressBookGroup.core.save.RegistryPersister;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    public static void quit(){
        System.out.println("Exiting program, goodbye!");
        System.exit(0);
    }

    public void start(){
        new RegistryPersister().load();
        CatalogueLoader cl = new CatalogueLoader();
        Thread thread = new Thread(cl);
        thread.start();

        CommandLineInterface commandLineInterface = new CommandLineInterface();
        commandLineInterface.console.registerInputHandler(commandLineInterface);
    }
}
