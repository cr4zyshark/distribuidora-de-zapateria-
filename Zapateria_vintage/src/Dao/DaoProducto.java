
package Dao;

import BaseDatos.Productos;
import BaseDatos.Tienda;
import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class DaoProducto extends Conexion {

    public DaoProducto() {   
    }
    
    public void insertarProducto(Object obj) throws SQLException {
        Productos productos = (Productos) obj;
        this.query = "INSERT INTO producto Values (null,?,?,?,0,null)"; // consulta preparada -- tienda 
        conect(); // conecta
        ps.setString(1, productos.getTipo());
        ps.setString(2, productos.getMarca());
        ps.setInt(3, productos.getTalla());
        //ps.setInt(4, productos.getTienda_asociada());

        this.filas = ps.executeUpdate(); // ejecuta y affecta las filas

        if (this.filas > 0) {
            JOptionPane.showMessageDialog(null, "Producto ingresado correctamente");

        } else {
            JOptionPane.showMessageDialog(null, "Complete todo los campos");

        }

    }
    
    
    
    public void eliminar(Object delete) throws SQLException{
            Productos producto = (Productos) delete;
            this.query = "DELETE FROM producto WHERE marca = ? ";
            conect();
            
            ps.setString(1, producto.getMarca());
          
            this.filas=ps.executeUpdate();
            
            if (this.filas > 0) {
                JOptionPane.showMessageDialog(null, "Tienda eliminada correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Complete todo los campos");

            }
            
            
        
        
        }
    
    
    
    
    
    
    
    public void actualizar(Object actualizar) throws SQLException {
        Productos producto = (Productos) actualizar;
        this.query = "UPDATE producto SET tipo = ? ,marca = ? , talla = ? WHERE id_producto = ? ";
        conect();

        ps.setString(1, producto.getTipo());
        ps.setString(2, producto.getMarca());
        ps.setInt(3, producto.getTalla());
        ps.setInt(4, producto.getId_producto());

        

        this.filas = ps.executeUpdate();

        if (this.filas > 0) {
            JOptionPane.showMessageDialog(null, "Tienda actualizada correctamente");

        } else {
            JOptionPane.showMessageDialog(null, "Complete todo los campos");

        }

    }
    
    
    public void envio(Object pro) throws SQLException {
        Productos productos = (Productos) pro;
        this.query = "UPDATE producto SET traslado = ?, tienda_asociada_id_fk = ? WHERE id_producto = ? ";
        conect();
        
       
        ps.setInt(1, productos.getTraslado());
        ps.setInt(2, productos.getTienda_asociada());
        ps.setInt(3, productos.getId_producto());
  
        
        
        
        this.filas = ps.executeUpdate(); // ejecuta y affecta las filas

        if (this.filas > 0) {
            JOptionPane.showMessageDialog(null, "traslado ingresado correctamente");

        } else {
            JOptionPane.showMessageDialog(null, "Complete todo los campos");

        }
       
    }
    
        public  DefaultTableModel Cargarproducto() throws SQLException {
            DefaultTableModel  Cargarproducto = new DefaultTableModel();
            this.query = "select * from producto";
            conect();

       
        this.rs = ps.executeQuery(); // ejecuta y affecta las filas
        Cargarproducto.addColumn("id");
        Cargarproducto.addColumn("tipo");
        Cargarproducto.addColumn("marca");
        Cargarproducto.addColumn("talla");
        while (this.rs.next() ) {  // linea 70: se lee algo y se ejecuta en la tablaç
            // arrays
            Object[] fila = new Object[4];
            for (int i = 0; i <4; i++){
                fila[i] = rs.getObject(i+1);
                
                
            }
            Cargarproducto.addRow(fila);
            
            
            

        }
        return Cargarproducto;
        }
}
       
            
            
        
        
        

    
    

