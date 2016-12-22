package Jimmy.AddressBookGroup.core.remote;

import Jimmy.AddressBookGroup.core.contactRegistry.RemoteRegistry;

import java.io.*;
import java.net.Socket;

public class CatalogueClient {

    private String host;
    private int port;

    Socket socket;

    public CatalogueClient(String host, int port) {
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
            bufferedWriter.write(string);
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String waitForResponse(){
        String s= "";
        try {
           InputStream is = socket.getInputStream();
           InputStreamReader isr = new InputStreamReader(is);
           BufferedReader reader = new BufferedReader(isr);


            for (String line = reader.readLine(); line != null; line = reader.readLine()) {

               s += line;

           }

            return s;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public void disconnect(String string){}


}
