package paneles;

import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

import opciones.*;


public class MenuLateralPanel extends JPanel {

    private JButton botonCitas;  // Botón como variable de clase para poder asignarle eventos
    private JButton botonRecetas;
    private JButton botonAsignar;
    private JButton botonChequeo;
    private JButton botonAlta;
    private JButton botonInfo;

    public MenuLateralPanel() {
        // Configuración básica del panel
        this.setPreferredSize(new Dimension(400, 800));
        this.setOpaque(true);
        this.setBackground(new Color(207, 230, 225));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Crear botones
        //Citar
        botonCitas = crearBoton("Citar");  // Inicializamos el botón de citas
        botonCitas.addActionListener(e -> abrirVentanaCitas());

        //Recetas
        botonRecetas = crearBoton("Recetas");
        botonRecetas.addActionListener(e -> abrirVentanaRecetar());

        //Signar
        botonAsignar = crearBoton("Signar Camilla");
        botonAsignar.addActionListener(e -> abrirVentanaAsignar());
        
        //Chequeo
        botonChequeo = crearBoton("Chequeo");
        botonChequeo.addActionListener(e -> abrirVentanaChequeo());

        //Alta
        botonAlta = crearBoton("Dar de Alta");
        botonAlta.addActionListener(e -> abrirVentanaAlta());

        //Info
        botonInfo = crearBoton("Informacion");
        botonInfo.addActionListener(e -> abrirVentanaInfo());
        
        // Agregar componentes con espaciado
        this.add(Box.createRigidArea(new Dimension(0, 100)));  // Espacio inicial
        this.add(botonCitas);
        this.add(botonRecetas);
        this.add(botonAsignar);
        this.add(botonChequeo);
        this.add(botonAlta);
        this.add(botonInfo);
        this.add(Box.createRigidArea(new Dimension(0, 15)));
    }

    //Abrir ventanas

    private void abrirVentanaCitas() {
        // Crea y muestra la ventana de citas
        Citar ventanaCitas = new Citar();
        ventanaCitas.setVisible(true);
        
        // Abrir ventana
        ventanaCitas.setLocationRelativeTo(null);
    }

    private void abrirVentanaRecetar() {
        // Crea y muestra la ventana de Recetas
        Recetar ventanaRecetar = new Recetar();
        ventanaRecetar.setVisible(true);
        
        // Abrir ventana
        ventanaRecetar.setLocationRelativeTo(null);
    }

    private void abrirVentanaAsignar() {
        // Crea y muestra la ventana de Asignacion
        Asignar ventanaAsignar = new Asignar();
        ventanaAsignar.setVisible(true);
        
        // Abrir ventana
        ventanaAsignar.setLocationRelativeTo(null);
    }

    private void abrirVentanaChequeo() {
        // Crea y muestra la ventana de Chequeos
        Chequeo ventanaChequeo = new Chequeo();
        ventanaChequeo.setVisible(true);
        
        // Abrir ventana
        ventanaChequeo.setLocationRelativeTo(null);
    }

    private void abrirVentanaAlta() {
        // Crea y muestra la ventana de Alta
        Alta ventanaAlta = new Alta();
        ventanaAlta.setVisible(true);
        
        // Abrir ventana
        ventanaAlta.setLocationRelativeTo(null);
    }

    private void abrirVentanaInfo() {
        // Crea y muestra la ventana de citas
        Info ventanaInfo = new Info();
        
        //Espacio
        this.add(Box.createRigidArea(new Dimension(0, 20)));
        this.add(botonInfo);

        //Ventana visible
        ventanaInfo.setVisible(true);
        
        // Abrir ventana
        ventanaInfo.setLocationRelativeTo(null);
    }

    // Método auxiliar para agregar componentes con espaciado
    private void agregarConEspacio(Component componente) {
        this.add(Box.createRigidArea(new Dimension(0, 20)));
        this.add(componente);
    }

    // Método para crear botones estilizados
    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setPreferredSize(new Dimension(200, 50));
        boton.setMaximumSize(new Dimension(200, 50));
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Estilo opcional para los botones
        boton.setBackground(new Color(154, 199, 188));
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
        boton.setFocusPainted(false);

        boton.setMargin(new Insets(10, 20, 10, 20));
    
        boton.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createEmptyBorder(5, 5, 5, 5),
        boton.getBorder()
    ));
        
        return boton;
    }

    // Método para asignar ActionListener al botón de citas
    public void setCitasListener(ActionListener listener) {
        botonCitas.addActionListener(listener);
    }

    // Método opcional para asignar listeners a otros botones
    public void setBotonListener(String textoBoton, ActionListener listener) {
        for (Component comp : this.getComponents()) {
            if (comp instanceof JButton && ((JButton)comp).getText().equals(textoBoton)) {
                ((JButton)comp).addActionListener(listener);
                break;
            }
        }
    }
}