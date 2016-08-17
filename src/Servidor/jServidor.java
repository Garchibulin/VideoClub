
package Servidor;

import Cliente.frmListaClientes;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author intel i7
 */
public class jServidor implements Runnable{
     private ServerSocket ss;
    private Socket s;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private frmServer mw;
   
    
    public jServidor(frmServer mw) {
        this.mw = mw;
    }

    public void run() {
        try {
            ss = new ServerSocket(5000);
            s = ss.accept();
            oos = new ObjectOutputStream(s.getOutputStream());
            ois = new ObjectInputStream(s.getInputStream());
            mw.getjTxtMensajes().setText("Conexion Exitosa...");
            this.readLine();
        } catch (Exception ex) {
            this.closeServer();
            ex.printStackTrace();
        }

    }

    public void writeLine(String linea) {
        try {
            oos.writeObject(linea);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readLine() {
        try {
            while (true) {
                Object aux = ois.readObject();
                if (aux != null && aux instanceof String) {
                    mw.getjTxtMensajes().setText("\n-> Cliente dice: "+ aux); //capturamos el mensaje enviado por el cliente
                }
                Thread.sleep(15);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void closeServer(){
        try{
            oos.close();
            ois.close();
            s.close();
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
