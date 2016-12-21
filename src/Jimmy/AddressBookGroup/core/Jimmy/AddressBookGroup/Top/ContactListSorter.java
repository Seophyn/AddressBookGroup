package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

import java.util.List;

public class ContactListSorter {

    public static List<Contact> sort(List<Contact> contacts){

        contacts.sort((contactOne, contactTwo) -> contactOne.getFirstName().compareToIgnoreCase(contactTwo.getFirstName()));

        return contacts;
    }

}