package Jimmy.AddressBookGroup.core.remote;

import Jimmy.AddressBookGroup.core.contactRegistry.Contact;

import java.util.List;

public class AtomicRemoteCatalogueProxy implements RemoteCatalogueProxy {

    final static String REQUEST = "getall";
    final static String EXIT = "exit";
    private CatalogueClient catalogueClient;

    public AtomicRemoteCatalogueProxy(String host, int port){
        catalogueClient = new CatalogueClient(host, port);
        catalogueClient.connect();
        catalogueClient.sendRequest(REQUEST);
        catalogueClient.waitForResponse();
        catalogueClient.disconnect(EXIT);
    }


    @Override
    public List<String> getContacts() {
        return null;
    }
}
