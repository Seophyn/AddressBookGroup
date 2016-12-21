package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

import java.io.*;
import java.util.List;

public class RegistryPersister {
    Registry registry = Registry.getInstance();
    File file = new File("registry");

    public synchronized void save (){
        {
            try (ObjectOutputStream saveTo = new ObjectOutputStream(new FileOutputStream("registry"))) {
                saveTo.writeObject(registry.getContacts());
                //logger.info("Saving to file.");
            } catch (IOException e) {
                //logger.severe("Error when trying to write to file." + " " + e);
                e.printStackTrace();
            }
        }

    }
    @SuppressWarnings("unchecked")
    public void load(){
        Runnable autosave = new AutoSave();
        Thread saveThread = new Thread(autosave);
        saveThread.start();
        if (file.isFile()) {
            try (ObjectInputStream read = new ObjectInputStream(new FileInputStream("registry"))) {
                registry.setContacts((List<Contact>) read.readObject());
            } catch (IOException |
                    ClassNotFoundException e) {
                //logger.severe("Error when trying to read from file." + " " + e);
                System.out.println("An error occurred when trying to read from file.");
            }
        }
    }

}
