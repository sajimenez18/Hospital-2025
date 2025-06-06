package ventanas;

import java.awt.BorderLayout;
import javax.swing.*;

public class Dashboard {

    private JFrame ventanaNueva;

    public Dashboard() {
        ventanaNueva = new JFrame("Vistas Doc");
        ventanaNueva.setSize(1000, 800);
        ventanaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaNueva.setLayout(new BorderLayout());

        Tabla tabla = new Tabla();
        ventanaNueva.add(tabla, BorderLayout.CENTER);  // Agregar tabla a la ventana

        ventanaNueva.setVisible(true);  // Mostrar ventana
    }

    public static void main(String[] args) {
        new Dashboard();  // Llamada directa sin invokeLater
    }
}
