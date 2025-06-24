package ventanas;

import java.awt.*;
import javax.swing.*;

import paneles.*;

public class Dashboard {

    private JFrame ventanaNueva;

    public Dashboard() {
        ventanaNueva = new JFrame("Vistas Doc");
        ventanaNueva.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventanaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaNueva.setLayout(new BorderLayout());

        ventanaNueva.add(new MenuLateralPanel(), BorderLayout.WEST);
        ventanaNueva.add(new Header(), BorderLayout.NORTH); 
        ventanaNueva.add(new Tabla(), BorderLayout.CENTER); 

        ventanaNueva.setVisible(true);  // Mostrar ventana
    }

    public static void main(String[] args) {
        new Dashboard(); 
    }
}
