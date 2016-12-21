package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

public class Registry {

    private static Registry registry = new Registry();

    private Registry(){}

    public static Registry getInstance(){
        return registry;
    }
}
