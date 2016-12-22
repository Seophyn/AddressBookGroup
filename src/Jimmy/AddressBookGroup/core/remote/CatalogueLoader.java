package Jimmy.AddressBookGroup.core.remote;

public class CatalogueLoader implements Runnable{
RemoteCatalogueProxy client1;

    @Override
    public void run() {

    RemoteCatalogueFactory client1 = new RemoteCatalogueFactory("localhost",61616);
        client1.create();



    }
}
