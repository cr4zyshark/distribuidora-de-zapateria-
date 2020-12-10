
package conexion;

import java.sql.Connection; // connexion con base

import java.sql.ResultSet;  // almacena la informacion de lo que se ejecute una consulta

import java.sql.PreparedStatement; // tiene acceso a resultset

import java.sql.DriverManager;
import javax.swing.JOptionPane;


// query = guarda las consultas,select,update,delete

// driver = atributo
// driver manager = clase

public class Conexion {
    
    protected String query,
            url = "jdbc:mysql://localhost:3306/distribuidora?zeroDateTimeBehavior=CONVERT_TO_NULL",
            usuario = "root",
            password = "",
            driver = "com.mysql.cj.jdbc.Driver";
    
    protected Connection con;
    protected PreparedStatement ps; 
    protected ResultSet rs;
    protected int filas;
    
    public Conexion(){}
    
    public void conect(){
        
        
        
        
        
        try{
            
            Class.forName(this.driver);
            con = (Connection)DriverManager.getConnection(this.url, this.usuario, this.password);
            ps = con.prepareStatement(this.query); // prepara la consulta
            //JOptionPane.showMessageDialog(null, "hola"); mensaje 
            
        
        }catch(Exception e){   // agarra los errores 
            
            JOptionPane.showMessageDialog(null, e.getMessage());  // mostrar donde esta el error
            
            
            
            
            
            
            
            
            
            
        
        
        }
    
    }
    
           
    
}
