package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

import java.util.List;

public class Registry {

    LocalContact localContact;

    private static Registry instance = null;

    private Registry(){}

    public static Registry getInstance(){
        if(instance == null){
            instance = new Registry();
        }
        return instance;
    }

    public void addContact(String firstName, String lastName, String email){

    }

    public void deleteContact(String id){}

    public List<Contact> getContacts (){}

    public List<Contact> search(String term){}

    public void load()
}
