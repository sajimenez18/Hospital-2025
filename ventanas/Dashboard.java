package ventanas;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Dashboard {

    private JFrame ventanaNueva;
    
        public Dashboard(){
            ventanaNueva = new JFrame("Vistas Doc");
            ventanaNueva.setSize(1000, 800);
            ventanaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaNueva.setLayout(new BorderLayout());


        ventanaNueva.setVisible(true);
    }
    public JFrame getDashFrame(){
        return ventanaNueva;
    }
}
