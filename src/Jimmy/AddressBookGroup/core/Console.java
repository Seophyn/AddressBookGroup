package Jimmy.AddressBookGroup.core;

import Jimmy.AddressBookGroup.core.codeCommands.CommandLine;
import Jimmy.AddressBookGroup.core.codeCommands.CommandLineInterface;
import Jimmy.AddressBookGroup.core.formatPrinting.ConsolePrinter;

import java.util.Scanner;

public class Console implements ConsolePrinter {
    InputHandler inputHandler = commandLine -> {

    };

    public void registerInputHandler(CommandLineInterface handler) {
        System.out.println("Welcome to the Addressbook!");
        Scanner scanner = new Scanner(System.in);
        String scanString = "";

        while (!scanString.equals("quit")) {
            scanString = scanner.nextLine();
            handler.handle(CommandLine.parse(scanString));
        }
        scanner.close();
    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
