package ngo.dean.elimugo.services.hotspot_server.sender;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;

import android.os.Bundle;
import android.os.Environment;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContainer;

import ngo.dean.elimugo.R;

public class FileSender extends AppCompatActivity {

    String ip ;
    String port ;

    public FileSender(String ip, String port){
        
        this.ip = ip;
        
        this.port = port;
    }

    ServerSocketThread serverSocketThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        serverSocketThread = new ServerSocketThread();
        serverSocketThread.start();
    }




    public class ServerSocketThread extends Thread {

        @Override
        public void run() {
            Socket socket = null;

            try {
              ServerSocket serverSocket = new ServerSocket(Integer.parseInt(port));
              FileSender.this.runOnUiThread(new Runnable() {

                  @Override
                  public void run() {

                  }
              });

                while (true) {
                    socket = serverSocket.accept();
                    FileTxThread fileTxThread = new FileTxThread(socket);
                    fileTxThread.start();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public class FileTxThread extends Thread {
        Socket socket;

        FileTxThread(Socket socket){
            this.socket= socket;
        }

        @Override
        public void run() {
            File file = new File(
                    Environment.getExternalStorageDirectory(),
                    "test.txt");

            byte[] bytes = new byte[(int) file.length()];
            BufferedInputStream bis;
            try {
                bis = new BufferedInputStream(new FileInputStream(file));
                bis.read(bytes, 0, bytes.length);
                OutputStream os = socket.getOutputStream();
                os.write(bytes, 0, bytes.length);
                os.flush();
                socket.close();

                final String sentMsg = "File sent to: " + socket.getInetAddress();
                FileSender.this.runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(FileSender.this,
                                sentMsg,
                                Toast.LENGTH_LONG).show();
                    }});

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
    }
}
