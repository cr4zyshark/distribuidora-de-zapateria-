
package Dao;


import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;


public class DaoRegistro extends Conexion {
    
    
     public DefaultTableModel CargarRegistro() throws SQLException {
        DefaultTableModel Cargarregistro = new DefaultTableModel();
        
        this.query = "select * from traslado_historial";
        conect();

        this.rs = ps.executeQuery(); // ejecuta y affecta las filas
        Cargarregistro.addColumn("id traslado");
        Cargarregistro.addColumn("id producto");
        Cargarregistro.addColumn("tipo");
        Cargarregistro.addColumn("marca");
        Cargarregistro.addColumn("talla");
        Cargarregistro.addColumn("tienda asociada");
        Cargarregistro.addColumn("fecha de traslado");
        
        while (this.rs.next()) {  // linea 70: se lee algo y se ejecuta en la tablaç
            // arrays
            Object[] fila = new Object[7];
            for (int i = 0; i < 7; i++) {
                fila[i] = rs.getObject(i + 1);

            }
            Cargarregistro.addRow(fila);

        }
        return Cargarregistro;
    }

















    
    
    
    
    
    
    
}
