package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

public class Registry {

    private static Registry instance = null;

    private Registry(){}

    public static Registry getInstance(){
        if(instance == null){
            instance = new Registry();
        }
        return instance;
    }

    public void addContact(String firstName, String lastName, String email){}

    public void deleteContact(String id){}
}
