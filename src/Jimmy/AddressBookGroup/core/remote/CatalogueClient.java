package Jimmy.AddressBookGroup.core.remote;

import Jimmy.AddressBookGroup.core.contactRegistry.RemoteRegistry;

import java.io.*;
import java.net.Socket;

public class CatalogueClient implements Runnable {

    private String host;
    private int port;
    final static String REQUEST = "getall" + "\n";
    final static String EXIT = "exit" + "\n";
    Socket socket;

    public CatalogueClient() {
        this.host = host;
        this.port = port;
    }

    public void connect(){

        try {
            socket = new Socket("172.20.200.185", 61616);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendRequest(String string){
        try {
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(REQUEST);
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String waitForResponse(){
        try {
           InputStream is = socket.getInputStream();
           InputStreamReader isr = new InputStreamReader(is);
           BufferedReader reader = new BufferedReader(isr);

           for (String line = reader.readLine(); line != null; line = reader.readLine()) {
               String[] splitLine = line.split(" ");

               if (splitLine.length > 1) {
                   RemoteRegistry.getInstance().add(splitLine[0], splitLine[1], splitLine[2], splitLine[3]);
               }
           }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void disconnect(){}

    @Override
    public void run() {
        connect();
        sendRequest("");
        waitForResponse();
    }
}
