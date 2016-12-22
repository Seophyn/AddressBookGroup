package Jimmy.AddressBookGroup.core.remote;

public class RemoteCatalogueFactory {
    private String host;
    private int port;

    public RemoteCatalogueFactory(String host, int port){
        this.host = host;
        this.port = port;
    }

    public void create(){

        RemoteCatalogueProxy proxy1 = new AtomicRemoteCatalogueProxy(host, port);

    }

}
