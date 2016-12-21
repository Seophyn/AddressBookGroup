package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.codeCommands.CommandLineInterface;
import Jimmy.AddressBookGroup.core.remote.CatalogueClient;
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
        CatalogueClient cc = new CatalogueClient();
        Thread thread = new Thread(cc);
        thread.start();

        CommandLineInterface commandLineInterface = new CommandLineInterface();
        commandLineInterface.console.registerInputHandler(commandLineInterface);
    }
}



/*
//todo CHANGES:
//todo Quit is static, change?
//todo Application start method.
//todo QuitCommand execute and constructor
//todo Not closing scanner in console.

 */