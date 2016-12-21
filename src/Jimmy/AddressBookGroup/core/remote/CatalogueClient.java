package Jimmy.AddressBookGroup.core.remote;

public class CatalogueClient {

    private String host;
    private int port;

    public CatalogueClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect(){
    }

    public void sendRequest(String string){}

    public String waitForResponse(){
        return null;
    }

    public void disconnect(){}
}
