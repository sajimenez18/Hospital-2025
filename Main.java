import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        
        //Crear una ventana con JFrame
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL"); 
        miVentana.setSize(1000, 700);
        miVentana.setVisible(true);

        //Crear un texto con JLabel
        JLabel texto  = new JLabel();
        texto.setText("Hola mundo");
        miVentana.add(texto);
    }
    
}