package paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class header extends JPanel {

    public header() {
        this.setPreferredSize(new Dimension(1000, 100)); // Aumenta el ancho si es necesario
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setLayout(new BorderLayout()); // Para posicionar izquierda/derecha

        // Crear textos
        JLabel textoIzquierda = new JLabel("hospital");
        JLabel textoDerecha = new JLabel("Sajimenez y Mr-afk23");

        // Margen (opcional)
        textoIzquierda.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
        textoDerecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 20));

        // Agregar textos al panel
        this.add(textoIzquierda, BorderLayout.WEST);
        this.add(textoDerecha, BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return this;
    }
}
