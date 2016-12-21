package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

import java.util.logging.Level;

public class AutoSave implements Runnable {

    private RegistryPersister registryPersister = new RegistryPersister();

    public void run(){
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //logger.log(Level.SEVERE, "InterruptedException", e);
            }

            registryPersister.save();
            System.out.println("Autosave Successful");
        }
    }
}
