package Jimmy.AddressBookGroup.core.save;

import Jimmy.AddressBookGroup.core.contactRegistry.Contact;
import Jimmy.AddressBookGroup.core.contactRegistry.Registry;

import java.io.*;
import java.util.List;

public class RegistryPersister {
    private Registry registry = Registry.getInstance();
    private File file = new File("registry");

    public synchronized void save (){
        {
            try (ObjectOutputStream saveTo = new ObjectOutputStream(new FileOutputStream("registry"))) {
                saveTo.writeObject(registry.getContacts());
            } catch (IOException e) {
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
                System.out.println("An error occurred when trying to read from file.");
            }
        }
    }

}
