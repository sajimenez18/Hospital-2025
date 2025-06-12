package ventanas;

import java.awt.BorderLayout;
import javax.swing.*;

import paneles.MenuLateralPanel;
import paneles.header;

public class Dashboard {

    private JFrame ventanaNueva;

    public Dashboard() {
        ventanaNueva = new JFrame("Vistas Doc");
        ventanaNueva.setSize(1000, 800);
        ventanaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaNueva.setLayout(new BorderLayout());

        ventanaNueva.add(new MenuLateralPanel(), BorderLayout.WEST);
        ventanaNueva.add(new header(), BorderLayout.NORTH); 
        ventanaNueva.add(new Tabla(), BorderLayout.CENTER); 

        ventanaNueva.setVisible(true);  // Mostrar ventana
    }

    public static void main(String[] args) {
        new Dashboard(); 
    }
}
