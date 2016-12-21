package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

import java.util.ArrayList;

/**
 * Created by Thomas on 2016-12-21.
 */
public class ContactFormatter {

    private String format(ArrayList<Contact> contacts) {

    StringBuilder stringbuilder = new StringBuilder();

        for (Contact contact : contacts) {

        stringbuilder.append("ID: " + contact.getId() + '\n' +
                "Firstname: " + contact.getFirstName() + '\n' +
                "Lastname: " + contact.getLastName() + '\n' +
                "E-mail address: " + contact.getEmailAddress() + '\n');
        stringbuilder.append("\n");
    }
        return stringbuilder.toString();
}}
