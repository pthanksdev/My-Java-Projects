import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientside {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
    //constructor to pit ip address and port
    public clientside(String address,int port){

        //establish a connection
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            //take input from terminal#
            input = new DataInputStream(System.in);

            //sends output to the socket
            out = new DataOutputStream(
                    socket.getOutputStream());
        }
        catch (UnknownHostException u){
            System.out.println(u);
        }
        catch(IOException i){
            System.out.println(i);
        }
        //String to read message from input
        String line = "";

        //keep reading until "End" is input
        while(!line.equals("End")){
            try {
                line = input.readLine();

                out.writeUTF(line);
            }
            catch (IOException i){
                System.out.println(i);
            }
        }
        //close the connection
        try {
            input.close();
            out.close();
            socket.close();
        }
        catch (IOException i){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        clientside client = new clientside("127.0.0.1",5000);
    }
}


