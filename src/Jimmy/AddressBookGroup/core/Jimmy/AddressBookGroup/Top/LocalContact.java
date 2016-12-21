package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

import java.util.UUID;

public class LocalContact implements Contact, Comparable<LocalContact> {

    ContactDetails contactDetails;
    UUID id;

    public LocalContact (UUID id, String firstName, String lastName, String email) {
        this.id = id;
        contactDetails = new ContactDetails();
        contactDetails.firstName = firstName;
        contactDetails.lastName = lastName;
        contactDetails.email = email;
    }

    @Override
    public String getId() {
        return id.toString();
    }

    @Override
    public String getFirstName() {
        return contactDetails.firstName;

    }

    @Override
    public String getLastName() {
        return contactDetails.lastName;
    }

    @Override
    public String getEmailAddress() {
        return contactDetails.email;

    }

    @Override
    public int compareTo(LocalContact localContact) {
        return this.getFirstName().compareToIgnoreCase((localContact.getFirstName()));
    }
}
