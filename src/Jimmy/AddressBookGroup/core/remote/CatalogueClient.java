package Jimmy.AddressBookGroup.core.remote;
import java.io.*;
import java.net.Socket;


public class CatalogueClient {

    private String host;
    private int port;
    private Socket socket;
    private OutputStream outputStream;
    private InputStream is;



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

    public void sendRequest(String request){
        try {
            outputStream = socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(request);
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String waitForResponse(){
        String response = "";
        try {
            is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);

            String line;

            while ((line = reader.readLine()) != null) {

               if(line.equals("")){
                   break;
               }
               else {
                   response += line + "\n";
               }
            }

            return response;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }


    public void disconnect(){

        sendRequest("exit" + "\n");

    }


  public void closeStreams(){

        try {
            is.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
