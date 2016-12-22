package Jimmy.AddressBookGroup.core.contactRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoteRegistry {


    private List<Contact> remoteContacts = new ArrayList<>();

    private static RemoteRegistry instance = null;

    private RemoteRegistry(){}

    public static RemoteRegistry getInstance(){
        if(instance == null){
            instance = new RemoteRegistry();
        }
        return instance;
    }

    public List<Contact> getContacts(){
        return remoteContacts;
    }

    public List<Contact> search(String term){
        ArrayList<Contact> tmpList = new ArrayList<>();

        tmpList.addAll(remoteContacts.stream().filter(contact -> contact.getId().equals(term)).collect(Collectors.toList()));

        return tmpList;
    }

    public void add(String id, String firstName, String lastName, String email){
        remoteContacts.add(new RemoteContact(id, firstName, lastName, email));

    }
}
