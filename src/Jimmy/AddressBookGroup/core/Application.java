package Jimmy.AddressBookGroup.core;

public class Application {
    CommandLineInterface commandLineInterface;

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    public static void quit(){
        System.exit(0);
    }

    public void start(){
        commandLineInterface = new CommandLineInterface();
        commandLineInterface.fuckshit();
    }
}