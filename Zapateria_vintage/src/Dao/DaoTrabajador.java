
package Dao;

import conexion.Conexion;

import java.sql.ResultSet;
import BaseDatos.Trabajador;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// throws = en caso que venga una excepcion 


// se hereda 
public class DaoTrabajador extends Conexion {
    
    
    
    
    public DaoTrabajador() {
    }
    
    public void insertar(Object obj) throws SQLException{
        Trabajador trabajador =(Trabajador)obj;
        this.query = "INSERT INTO trabajador Values (null,?,?)"; // consulta preparada -- falta el sha2
        conect(); // conecta
     
        ps.setString(1, trabajador.getNombre() );  // recibe informacion 
        ps.setString(2, trabajador.getContraseña());
        
        this.filas=ps.executeUpdate(); // ejecuta y affecta las filas
        
        if (this.filas > 0){
            JOptionPane.showMessageDialog(null, "trabajador registrado");
      
        }else{
            JOptionPane.showMessageDialog(null, "Complete todo los campos");
        
        
        }
        
    
    
    
    }
    
    public boolean buscar(Object Trabaja) throws SQLException{
        Trabajador trabajador =  (Trabajador) Trabaja;
        //this.query = "SELECT * FROM trabajador WHERE nombre = ? && contraseña = ?";  
        this.query = "SELECT * FROM trabajador WHERE nombre = ? AND contraseña = ? ";
        
        conect();
      
        
        
      
        ps.setString(1, trabajador.getNombre());
        ps.setString(2, trabajador.getContraseña());
        this.rs= ps.executeQuery();
        
        
        if(this.rs.next()){
            return true;
        
        }else{
            return false;
        }
        
        
        


        

   
        
        
        
    }
    

    
     
    
    
    
    
    
    
    
    
    
}
