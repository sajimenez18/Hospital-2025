package ventanas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import datos.Pacientes;

public class Tabla extends JScrollPane {

    public Tabla() {
        String[] columnas = { "ID", "Nombre y apellido", "Edad", "Descripcion","Horario cita"};
        Object[][] datos = new Pacientes().getDatos();

        DefaultTableModel base = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(base);
        this.setViewportView(tabla); // Agregar la tabla al JScrollPane
    }
}
