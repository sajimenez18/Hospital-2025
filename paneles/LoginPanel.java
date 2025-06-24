package paneles;
import javax.swing.*;

import ventanas.Dashboard;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.LoginControler;

public class LoginPanel {

    private JPanel panelLogin;

    public LoginPanel(){ 
        panelLogin = new JPanel();
        panelLogin.setSize(500, 500);
        panelLogin.setLayout(new GridBagLayout());

        //Admin Diseno
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 80);
        gbc.fill = GridBagConstraints. HORIZONTAL;
        gbc.weightx = 1.0;

        //titulo
        JLabel titulo = new JLabel("Login");
        titulo.setOpaque(true);
        gbc.gridy=0;
        gbc.gridx=0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelLogin.add(titulo, gbc);

        //Usuario
        JTextField entradaCorreo = new JTextField("");
        entradaCorreo.setSize(new Dimension(100,50));
        gbc.gridx = 1;
        gbc.gridy =1;
        panelLogin.add(entradaCorreo,gbc);

        //Contraseña
        JTextField entradaContraseña = new JTextField("");
        entradaContraseña.setSize(new Dimension(100,50));
        gbc.gridx = 1;
        gbc.gridy =2;
        panelLogin.add(entradaContraseña,gbc);
    
        //Inicio
        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setPreferredSize(new Dimension(100,50));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panelLogin.add(btnIngresar,gbc);

        btnIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Boton presionado");

                //
                String entradaUsuario = entradaCorreo.getText();
                String entradaContra = entradaContraseña.getText();

                if(new LoginControler().validacionDatos(entradaUsuario, entradaContra)){
                Component comp = (Component) e.getSource();
                JFrame ventanaPapa = (JFrame) SwingUtilities.getWindowAncestor(comp);
                ventanaPapa.dispose();;

                
                new Dashboard();
                }
            }
        });

    }
    public JPanel getJPanel(){
        return panelLogin;
    }
}
