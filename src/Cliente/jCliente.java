/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author intel i7
 */
public class jCliente implements Runnable {
    private Socket s;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private frmListaClientes mw; //cambiamos jFrmChat por jFrmCliente

    //constructores de cada formulario
    public jCliente(frmListaClientes mw)  {//cambiamos jFrmChat por jFrmCliente

        this.mw = mw;
    }
 
    
    public void run() {
        try {
            s = new Socket("192.168.43.249", 5000); //cambiamos por la dirección IP del nuevo server en caso de trabajar en PC separadas
                                               //si el cliente es a nivel local, se deja el localhost
            oos = new ObjectOutputStream(s.getOutputStream());
            ois = new ObjectInputStream(s.getInputStream());
            mw.getjTxtMensajes().setText("Conexión Exitosa...");
            this.readLine();
        } catch (Exception ex) {
            this.closeCliente();
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
                    mw.getjTxtMensajes().setText("\n-> Servidor dice: " + aux);
                }
                Thread.sleep(15);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void closeCliente() {
        try {
            oos.close();
            ois.close();
            s.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
