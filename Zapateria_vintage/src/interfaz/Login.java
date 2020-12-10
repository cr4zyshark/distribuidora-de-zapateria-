
package interfaz;

import BaseDatos.Trabajador;
import Dao.DaoTrabajador;
import conexion.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    // enlazamiento
    
    Trabajador trabajador = new Trabajador();
    DaoTrabajador dao = new DaoTrabajador();
   
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nombreLogin = new javax.swing.JLabel();
        label_contraseñaLogin = new javax.swing.JLabel();
        txt_nombreLogin = new javax.swing.JTextField();
        txt_contraseñaLogin = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_nombreLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_nombreLogin.setText("Nombre: ");
        getContentPane().add(label_nombreLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 26));

        label_contraseñaLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_contraseñaLogin.setText("Contraseña: ");
        getContentPane().add(label_contraseñaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 25));

        txt_nombreLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_nombreLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 84, 150, 20));

        txt_contraseñaLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_contraseñaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txt_contraseñaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 150, 20));

        Ingresar.setBackground(new java.awt.Color(255, 102, 102));
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        titulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        titulo.setText("   INICIO DE SESION");
        titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 144, 35));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose\\Downloads\\zapatillas-rojas-sobre-fondo-azul-ilustracion_193606-45.jpg")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 460, 300));

        imagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose\\Downloads\\a737e1a3422af26b58da3099cc3baccf.jpg")); // NOI18N
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        trabajador.setNombre(txt_nombreLogin.getText());
        trabajador.setContraseña (String.valueOf(txt_contraseñaLogin.getPassword()));
        
        try {
            if(dao.buscar(trabajador) ){
                this.setVisible(false);
                Menu menu = new Menu();
                menu.setVisible(true);
            
            }else{
                JOptionPane.showMessageDialog(null,"Usuario incorrecto o campos no rellenados");
            
            
            }
      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                            
    }//GEN-LAST:event_IngresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        trabajador.setNombre(txt_nombreLogin.getText());
        trabajador.setContraseña(txt_contraseñaLogin.getText());
        try {
            dao.insertar(trabajador);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_contraseñaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseñaLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_contraseñaLogin;
    private javax.swing.JLabel label_nombreLogin;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField txt_contraseñaLogin;
    private javax.swing.JTextField txt_nombreLogin;
    // End of variables declaration//GEN-END:variables
}
