package Jimmy.AddressBookGroup.core.remote;

import Jimmy.AddressBookGroup.core.contactRegistry.Contact;

import java.util.List;

public class AtomicRemoteCatalogueProxy implements RemoteCatalogueProxy {

   private CatalogueClient catalogueClient;

    public AtomicRemoteCatalogueProxy(String host, int port){
        catalogueClient = new CatalogueClient();
    }


    @Override
    public List<String> getContacts() {
        return null;
    }
}
