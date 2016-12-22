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
        lineSeparator(catalogueClient.waitForResponse());
        catalogueClient.sendRequest(EXIT);
    }


    private void lineSeparator(String line){
        //System.out.println(line);
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
