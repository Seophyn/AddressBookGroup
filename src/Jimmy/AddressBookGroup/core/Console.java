package Jimmy.AddressBookGroup.core;

import java.util.Scanner;

public class Console implements ConsolePrinter {
    InputHandler handler;

    public void registerInputHandler(InputHandler handler){
        while (true){
            Scanner scanner = new Scanner(System.in);
            String scanString = scanner.toString();
            handler.handle(CommandLine.parse(scanString));


        }

    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
