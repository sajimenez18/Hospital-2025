import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*; //Todas estas son clases (librerias)

import paneles.LoginPanel;

public class Main {

    public static void main(String[] args) {
        
        //Crear una ventana con JFrame
        JFrame miVentana = new JFrame();  //Se crea una ventana  //metodo constructor 
        miVentana.setTitle("Hospital SCL");  //Se pone titulo a la ventana //metodo
        miVentana.setSize(1000, 800); //Tamaño de la ventana (ancho, alto)  //metodo
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //metodo 
        miVentana.setLayout(new BorderLayout());  //metodo constructor
        miVentana.setLocationRelativeTo(null); //metodo

        //Panel Banner
        JPanel panelBanner = new JPanel();  //metodo constructor
        panelBanner.setPreferredSize(new Dimension(500,500));  //metodo constructor
        panelBanner.setBackground(Color .RED);  //metodo constructor
        panelBanner.setOpaque(true);
        miVentana.add(panelBanner,BorderLayout.WEST);  //metodo constructor

        LoginPanel panelLogin = new LoginPanel();  //metodo constructor
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);  //metodo constructor

        miVentana.setVisible(true); //Se muestra la ventana en la pantalla
    }
    
}