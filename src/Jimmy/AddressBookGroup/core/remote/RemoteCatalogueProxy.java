package Jimmy.AddressBookGroup.core.remote;

import Jimmy.AddressBookGroup.core.contactRegistry.Contact;

import java.util.List;

/**
 * Created by Jimmy on 20/12/2016.
 */
public interface RemoteCatalogueProxy {

    public List<Contact> getContacts();
}
