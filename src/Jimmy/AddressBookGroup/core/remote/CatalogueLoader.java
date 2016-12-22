package Jimmy.AddressBookGroup.core.remote;

import Jimmy.AddressBookGroup.core.contactRegistry.RemoteRegistry;

public class CatalogueLoader implements Runnable{


    @Override
    public void run() {

        RemoteCatalogueFactory client1 = new RemoteCatalogueFactory("localhost",61616);
        RemoteCatalogueProxy remoteCatalogueProxy1 = client1.create();

        for (String s: remoteCatalogueProxy1.getContacts()
             ) {

            String [] arg = s.split(" ");
            RemoteRegistry.getInstance().add(arg[0], arg[1], arg[2], arg[3]);
        }


    }





}
