package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.codeCommands.CommandLine;
import Jimmy.AddressBookGroup.core.codeCommands.CommandLineInterface;
import Jimmy.AddressBookGroup.core.formatPrinting.ConsolePrinter;

import java.util.Scanner;

public class Console implements ConsolePrinter {
    InputHandler inputHandler = commandLine -> {

    };

    public void registerInputHandler(CommandLineInterface handler){
        System.out.println("Welcome to the Addressbook! Write ");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("write");
            String scanString = scanner.nextLine();
            /*if(scanString.equals("quit")){
                scanner.close();
            }*/
            handler.handle(CommandLine.parse(scanString));

            }
        }

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
