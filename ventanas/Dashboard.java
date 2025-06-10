package ventanas;

import java.awt.BorderLayout;
import javax.swing.*;
import datos.Pacientes;
import javax.swing.table.DefaultTableModel;

import paneles.MenuLateralPanel;

public class Dashboard {

    private JFrame ventanaNueva;

    public Dashboard() {
        ventanaNueva = new JFrame("Vistas Doc");
        ventanaNueva.setSize(1000, 800);
        ventanaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaNueva.setLayout(new BorderLayout());

        ventanaNueva.add(new MenuLateralPanel(), BorderLayout.WEST);
        ventanaNueva.add(new Tabla());

        ventanaNueva.setVisible(true);  // Mostrar ventana
    }

    public static void main(String[] args) {
        new Dashboard(); 
    }
}
