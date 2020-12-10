
package Dao;

import BaseDatos.Tienda;
import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public class DaoTienda extends Conexion {

    public DaoTienda() {
    }
    
    
        public void insertarTienda(Object obj) throws SQLException {
        Tienda tienda = (Tienda) obj;
        this.query = "INSERT INTO tienda_asociada Values (null,?,?)"; // consulta preparada -- tienda 
        conect(); // conecta
        ps.setString(1, tienda.getNombre());
        ps.setString(2, tienda.getCiudad());

        this.filas = ps.executeUpdate(); // ejecuta y affecta las filas

        if (this.filas > 0) {
            JOptionPane.showMessageDialog(null, "Tienda ingresada correctamente");

        } else {
            JOptionPane.showMessageDialog(null, "Complete todo los campos");

        }

    }
        
        public void eliminar(Object delete) throws SQLException{
            Tienda tienda = (Tienda) delete;
            this.query = "DELETE FROM tienda_asociada WHERE nombre = ? ";
            conect();
            
            ps.setString(1, tienda.getNombre());
          
            this.filas=ps.executeUpdate();
            
            if (this.filas > 0) {
                JOptionPane.showMessageDialog(null, "Tienda eliminada correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Complete todo los campos");

            }
            
            
        
        
        }
        
       public void actualizar(Object actualizar) throws SQLException {
        Tienda tienda = (Tienda) actualizar;
        this.query = "UPDATE tienda_asociada SET nombre = ? ,ciudad = ? WHERE id_tienda = ? ";
        conect();

        ps.setString(1, tienda.getNombre());
        ps.setString(2, tienda.getCiudad());
        ps.setInt(3, tienda.getId());

        this.filas = ps.executeUpdate();

        if (this.filas > 0) {
            JOptionPane.showMessageDialog(null, "Tienda actualizada correctamente");

        } else {
            JOptionPane.showMessageDialog(null, "Complete todo los campos");

        }

    }
        
        
    public DefaultTableModel CargarTienda() throws SQLException {
        DefaultTableModel Cargartienda = new DefaultTableModel();
        this.query = "select * from tienda_asociada";
        conect();

        this.rs = ps.executeQuery(); // ejecuta y affecta las filas
        Cargartienda.addColumn("id");
        Cargartienda.addColumn("nombre");
        Cargartienda.addColumn("ciudad");
        while (this.rs.next()) {  // linea 70: se lee algo y se ejecuta en la tablaç
            // arrays
            Object[] fila = new Object[3];
            for (int i = 0; i < 3; i++) {
                fila[i] = rs.getObject(i + 1);

            }
            Cargartienda.addRow(fila);

        }
        return Cargartienda;
    }
        
        
        
        
        
        
        
        
        
        
        
    
}
