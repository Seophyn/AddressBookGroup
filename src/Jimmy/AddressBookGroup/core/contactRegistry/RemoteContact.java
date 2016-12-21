package Jimmy.AddressBookGroup.core.contactRegistry;

public class RemoteContact implements Contact, Comparable<RemoteContact> {
    private String id;
    private ContactDetails contactDetails;

    @Override
    public String getId() {
        return this.id;
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
    public int compareTo(RemoteContact remoteContact) {
        return this.getFirstName().compareToIgnoreCase((remoteContact.getFirstName()));
    }
}
