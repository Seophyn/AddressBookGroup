package Jimmy.AddressBookGroup.core.formatPrinting;

import Jimmy.AddressBookGroup.core.contactRegistry.Contact;

import java.util.List;

public class ContactListSorter {

    public static List<Contact> sort(List<Contact> contacts){

        contacts.sort((contactOne, contactTwo) -> contactOne.getFirstName().compareToIgnoreCase(contactTwo.getFirstName()));

        return contacts;
    }

}