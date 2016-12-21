package Jimmy.AddressBookGroup.core.remote;

import java.io.*;
import java.net.Socket;

public class CatalogueClient {

    private String host;
    private int port;
    final static String REQUEST = "getall";
    final static String EXIT = "exit";
    Socket socket;

    public CatalogueClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect(){

        try {
            socket = new Socket(host, port);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void sendRequest(String string){
        try {
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(REQUEST);


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

               if(splitLine.length > 1) {
                   RemoteRegistry.getInstance().add(splitLine[0], splitLine[1], splitLine[2], splitLine[3]);
               }
           }





        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void disconnect(){}
}
