package Jimmy.AddressBookGroup.core;

public class Application {
    CommandLineInterface commandLineInterface;

    public static void main(String[] args) {

    }

    public void quit(){
        System.exit(0);
    }

    public void start(){
        commandLineInterface = new CommandLineInterface();
    }
}