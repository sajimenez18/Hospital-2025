// ===== LIBRERÍAS ===== //
import javax.swing.*;       // Librería para componentes gráficos (JFrame, JPanel, JLabel, JTextArea)
import javax.swing.border.EmptyBorder; // Para márgenes en componentes

// Para manejo de márgenes en GridBagConstraints
import java.awt.*;          // Manejo de colores, layouts y fuentes (Color, BorderLayout, Font, GridBagLayout)

import paneles.LoginPanel;  // Importamos el panel de login personalizado

// ===== CLASE PRINCIPAL ===== //
public class Main {
    // ===== MÉTODO MAIN (punto de entrada del programa) ===== //
    public static void main(String[] args) {
        
        // ===== 1. CONFIGURACIÓN DE LA VENTANA PRINCIPAL (JFrame) ===== //
        JFrame ventana = new JFrame("Hospital SCL"); // Constructor de JFrame (crea la ventana)
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al salir
        ventana.setSize(1000, 800); // Tamaño inicial (combinación de ambos enfoques)
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH); // Ventana maximizada (segundo proyecto)
        ventana.setLayout(new BorderLayout()); // Organiza componentes en zonas
        ventana.setLocationRelativeTo(null); // Centra la ventana inicialmente

        // ===== 2. PANEL IZQUIERDO (Banner azul) - MEJORA DEL CENTRADO ===== //
        JPanel panelIzquierdo = new JPanel(new GridBagLayout()); 
        panelIzquierdo.setBackground(new Color(154, 199, 188)); // Color azul hospital
        panelIzquierdo.setPreferredSize(new Dimension(300, 800)); // Ancho fijo, altura completa

        // ===== 3. TEXTO DEL BANNER - COMBINACIÓN DE AMBOS ENFOQUES ===== //
        // Panel contenedor para el texto (mejor centrado que el primer proyecto)
        JPanel panelTexto = new JPanel();
        panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.Y_AXIS)); // Apilado vertical
        panelTexto.setOpaque(false);
        panelTexto.setBorder(new EmptyBorder(20, 20, 20, 20)); // Márgenes (segundo proyecto)

        // Texto multilínea (del primer proyecto pero con mejor centrado)
        String[] lineas = {
            "Bienvenidos a", 
            "nuestro", 
            "proyecto", 
            "hospital"
        };

        for (String linea : lineas) {
            JLabel etiqueta = new JLabel(linea);
            etiqueta.setForeground(Color.WHITE);
            etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
            etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrado horizontal
            panelTexto.add(etiqueta);
        }

        // ===== 4. CONFIGURACIÓN DE GRIDBAGCONSTRAINTS PARA CENTRADO PERFECTO ===== //
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;

        // ===== 5. PANEL CONTENEDOR PARA MEJOR CENTRADO VERTICAL ===== //
        JPanel contenedorCentral = new JPanel(new BorderLayout());
        contenedorCentral.setOpaque(false);
        contenedorCentral.add(panelTexto, BorderLayout.CENTER);

        // ===== 6. AÑADIR COMPONENTES AL PANEL IZQUIERDO ===== //
        panelIzquierdo.add(contenedorCentral, gbc);
        ventana.add(panelIzquierdo, BorderLayout.WEST);

        // ===== 7. PANEL DE LOGIN (combinación de ambos enfoques) ===== //
        
        LoginPanel panelLogin = new LoginPanel();
        ventana.add(panelLogin.getJPanel(), BorderLayout.CENTER);
            
        // ===== 8. MOSTRAR VENTANA ===== //
        ventana.setVisible(true);
    }
}