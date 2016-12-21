package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;


import java.util.List;


public class ContactFormatter {

    public static String format(List<Contact> contacts) {

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
