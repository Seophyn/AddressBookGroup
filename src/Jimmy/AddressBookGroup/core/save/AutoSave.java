package Jimmy.AddressBookGroup.core.save;

public class AutoSave implements Runnable {

    private RegistryPersister registryPersister = new RegistryPersister();

    public void run(){
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            registryPersister.save();
        }
    }
}
