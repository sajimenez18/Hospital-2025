import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import vistas.LoginPanel;

public class Main {

    public static void main(String[] args) {
        
        //Crear una ventana con JFrame
        JFrame miVentana = new JFrame();  //Se crea una ventana 
        miVentana.setTitle("Hospital SCL");  //Se pone titulo a la ventana
        miVentana.setSize(1000, 800); //Tamaño de la ventana (ancho, alto)
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        //Panel Banner
        JPanel panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,500));
        panelBanner.setBackground(Color .RED);
        panelBanner.setOpaque(true);
        miVentana.add(panelBanner,BorderLayout.WEST);

        LoginPanel panelLogin = new LoginPanel();
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true); //Se muestra la ventana en la pantalla
    }
    
}