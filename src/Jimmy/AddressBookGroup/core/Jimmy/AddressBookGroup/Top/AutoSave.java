package Jimmy.AddressBookGroup.core.Jimmy.AddressBookGroup.Top;

import java.util.logging.Level;

public class AutoSave implements Runnable {

    public void run(){
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, "InterruptedException", e);
            }

            fileManager.writeFile(register.getRegister());
        }
        }
    }
}
