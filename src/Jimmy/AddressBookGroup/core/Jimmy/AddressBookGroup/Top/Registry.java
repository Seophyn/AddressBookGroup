package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Registry {

    RegistryPersister registryPersister = new RegistryPersister();

    List<Contact> contacts = new ArrayList<>();

    private static Registry instance = null;

    private Registry(){}

    public static Registry getInstance(){
        if(instance == null){
            instance = new Registry();
        }
        return instance;
    }

    public void addContact(String firstName, String lastName, String email){
        contacts.add(new LocalContact(UniqueIdGenerator.id(), firstName, lastName, email));


    }

    public void deleteContact(int index){
        contacts.remove(index);
    }

    public List<Contact> getContacts (){
        return contacts;
    }

    public List<Contact> search(String term){
        ArrayList<Contact> tmpList = new ArrayList<>();

        tmpList.addAll(contacts.stream().filter(contact -> contact.getId().equals(term)).collect(Collectors.toList()));

        return tmpList;
    }

    public void load(){}

    public void setContacts(List<Contact> contacts){
        this.contacts = contacts;
    }
}
