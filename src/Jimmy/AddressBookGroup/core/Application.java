package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.Registry;
import Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top.RegistryPersister;

public class Application {
    CommandLineInterface commandLineInterface;

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

        commandLineInterface = new CommandLineInterface();
        commandLineInterface.console.registerInputHandler(commandLineInterface);
    }
}



/*
//todo CHANGES:
//todo Application start method.
//todo QuitCommand execute and constructor
//todo Not closing scanner in console.

 */