package Jimmy.AddressBookGroup.core.remote;

import Jimmy.AddressBookGroup.core.contactRegistry.Contact;

import java.util.ArrayList;
import java.util.List;

public class AtomicRemoteCatalogueProxy implements RemoteCatalogueProxy {

    final static String REQUEST = "getall" +"\n";
    final static String EXIT = "exit"  + "\n";
    private CatalogueClient catalogueClient;
private List<String> contacts;
    public AtomicRemoteCatalogueProxy(String host, int port){
        contacts = new ArrayList<>();
        catalogueClient = new CatalogueClient(host, port);
        catalogueClient.connect();
        catalogueClient.sendRequest(REQUEST);
        catalogueClient.sendRequest(EXIT);
        lineSeparator(catalogueClient.waitForResponse());

    }


    private void lineSeparator(String line){
        String[] splitLine = line.split("\n");

        for (String s:splitLine
             ) {
            contacts.add(s);
        }
    }





    @Override
    public List<String> getContacts() {
        return contacts;
    }
}
