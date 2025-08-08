package opciones;

import javax.swing.*;
import java.awt.*;
import paneles.*;
import ventanas.*;

public class Chequeo extends JFrame {
    public Chequeo() {
        this.setTitle("Chequeo view");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.add(new MenuLateralPanel(), BorderLayout.WEST);
        this.add(new Header(), BorderLayout.NORTH);
        this.add(new Tabla(), BorderLayout.CENTER);

        this.setVisible(true);
    }
}