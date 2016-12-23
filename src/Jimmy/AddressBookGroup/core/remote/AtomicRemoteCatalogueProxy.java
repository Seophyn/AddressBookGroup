package Jimmy.AddressBookGroup.core.remote;

import java.util.ArrayList;
import java.util.List;

public class AtomicRemoteCatalogueProxy implements RemoteCatalogueProxy {

    private final static String REQUEST = "getall" + "\n";
    private List<String> contacts;

    public AtomicRemoteCatalogueProxy(String host, int port) {
        contacts = new ArrayList<>();
        CatalogueClient catalogueClient = new CatalogueClient(host, port);
        catalogueClient.connect();
        catalogueClient.sendRequest(REQUEST);
        catalogueClient.disconnect();
        lineSeparator(catalogueClient.waitForResponse());
        catalogueClient.closeStreams();
    }


    private void lineSeparator(String line) {
        String[] splitLine = line.split("\n");

        for (String s : splitLine
                ) {
            contacts.add(s);
        }
    }

    @Override
    public List<String> getContacts() {
        return contacts;
    }
}
