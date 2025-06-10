package paneles;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuLateralPanel extends JPanel {

    public MenuLateralPanel() {
        this.setPreferredSize(new Dimension(400, 800));
        this.setOpaque(true);
        this.setBackground(Color.RED);
        
        // Layout vertical
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Crear botones
        JButton entradaCitar = crearBoton("Citar");
        JButton entradaReceta = crearBoton("Recetar");
        JButton entradaSignar = crearBoton("Signar camilla");
        JButton entradaChequeo = crearBoton("Chequeo");
        JButton entradaAlta = crearBoton("Dar de Alta");
        JButton entradaInfo = crearBoton("Crear informes clínicos");

        // Agregar botones con espacio entre ellos
        this.add(Box.createRigidArea(new Dimension(0, 150)));
        this.add(entradaCitar);
        this.add(Box.createRigidArea(new Dimension(0, 20)));
        this.add(entradaReceta);
        this.add(Box.createRigidArea(new Dimension(0, 20)));
        this.add(entradaSignar);
        this.add(Box.createRigidArea(new Dimension(0, 20)));
        this.add(entradaChequeo);
        this.add(Box.createRigidArea(new Dimension(0, 20)));
        this.add(entradaAlta);
        this.add(Box.createRigidArea(new Dimension(0, 20)));
        this.add(entradaInfo);
    }

    // Método para crear botones con tamaño y alineación
    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setPreferredSize(new Dimension(200, 50));
        boton.setMaximumSize(new Dimension(200, 50));
        boton.setAlignmentX(CENTER_ALIGNMENT);
        return boton;
    }

    public JPanel getPanel() {
        return this;
    }
}
