package Jimmy.AddressBookGroup.core;

public class Console implements ConsolePrinter {

    public void registerInputHandler(InputHandler handler){

    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
