package Jimmy.AddressBookGroup.core;

public class Console implements ConsolePrinter {
    InputHandler inputHandler = new InputHandler() {
        @Override
        public void handle(CommandLine commandLine) {

        }
    };

    public void registerInputHandler(InputHandler handler){

    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
