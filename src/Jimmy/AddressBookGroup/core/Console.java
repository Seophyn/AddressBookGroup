package Jimmy.AddressBookGroup.core;

import java.util.Scanner;

public class Console implements ConsolePrinter {
    InputHandler inputHandler = commandLine -> {

    };

    public void registerInputHandler(CommandLineInterface handler){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("write");
            String scanString = scanner.nextLine();
            handler.handle(CommandLine.parse(scanString));

        }

    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
