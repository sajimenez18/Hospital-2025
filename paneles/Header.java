package paneles;

import java.awt.*;
import javax.swing.*;

public class Header extends JPanel {

    public Header() {
        this.setPreferredSize(new Dimension(1000, 100)); // Aumenta el ancho si es necesario
        this.setOpaque(true);
        this.setBackground(new Color(154, 199, 188));
        this.setLayout(new BorderLayout()); // Para posicionar izquierda/derecha

        // Crear textos
        JLabel textoIzquierda = new JLabel("Hospital");
        JLabel textoDerecha = new JLabel("Sajimenez y Mr-afk23");

        // Margen (opcional)
        textoIzquierda.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
        textoIzquierda.setForeground(Color.WHITE);
        textoIzquierda.setFont(new Font("Arial", Font.BOLD, 25));

        textoDerecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 20));
        textoDerecha.setForeground(Color.WHITE);
        textoDerecha.setFont(new Font("Arial", Font.BOLD, 24));

        // Agregar textos al panel
        this.add(textoIzquierda, BorderLayout.WEST);
        this.add(textoDerecha, BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return this;
    }
}
