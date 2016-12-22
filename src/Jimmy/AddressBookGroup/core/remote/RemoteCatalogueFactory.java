package Jimmy.AddressBookGroup.core.remote;

public class RemoteCatalogueFactory {
    private String host;
    private int port;

    public RemoteCatalogueFactory(String host, int port){
        this.host = host;
        this.port = port;
    }

    public RemoteCatalogueProxy create(){

        return new AtomicRemoteCatalogueProxy(host, port);
    }

}
