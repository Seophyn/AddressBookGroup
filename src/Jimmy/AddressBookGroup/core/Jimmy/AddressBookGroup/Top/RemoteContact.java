package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

public class RemoteContact implements Contact {
    String id;
    ContactDetails contactDetails;

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
}
