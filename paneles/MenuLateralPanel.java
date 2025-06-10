package paneles;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MenuLateralPanel extends JPanel{

    public MenuLateralPanel() {
        this.setPreferredSize(new Dimension (400, 800));
        this.setOpaque(true);
        this.setBackground(Color.RED);
    }
    public JPanel getPanel(){
        return this;
    }
}
