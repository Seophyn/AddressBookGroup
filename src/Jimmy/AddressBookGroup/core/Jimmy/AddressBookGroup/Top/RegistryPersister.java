package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

import java.io.*;
import java.util.ArrayList;

public class RegistryPersister {

    AutoSave autoSave = new AutoSave();
    File file = new File("registry");

    public synchronized void save (){
        {
            try (ObjectOutputStream saveTo = new ObjectOutputStream(new FileOutputStream("register"))) {
                saveTo.writeObject(register);
                logger.info("Saving to file.");
            } catch (IOException e) {
                logger.severe("Error when trying to write to file." + " " + e);
                System.out.println("An error occurred when trying to write to file.");
            }
        }

    }
    @SuppressWarnings("unchecked")
    public void load(){
        ArrayList<Contact> register = null;
        if (file.isFile()) {
            try (ObjectInputStream read = new ObjectInputStream(new FileInputStream("register"))) {
                register = (ArrayList<Contact>) read.readObject();
            } catch (IOException |
                    ClassNotFoundException e) {
                logger.severe("Error when trying to read from file." + " " + e);
                System.out.println("An error occurred when trying to read from file.");
            }
            return register;
        } else return new Register().getRegister();
    }
}
