package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Lista {

    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista crearLista() {
        int x;
        primero = null;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato para "
                    + "el nodo"));
            if (x != -1) {
                primero = new Nodo(x, primero);
            }
        } while (x != -1);
        return this;
    }

    public void imprimir() {

        Nodo n;
        n = primero;
        String acu="";
        while (n != null) {
            acu += n.dato + "  ";
            n = n.enlace;  
        }
        JOptionPane.showMessageDialog(null, acu);
    }

    }
