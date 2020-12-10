/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        producto = new javax.swing.JButton();
        tienda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        traslado = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        button_mostrarTienda = new javax.swing.JButton();
        button_mostrarProducto = new javax.swing.JButton();
        button_registro = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        producto.setBackground(new java.awt.Color(204, 102, 255));
        producto.setText("Agregar Producto");
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        getContentPane().add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 50));

        tienda.setBackground(new java.awt.Color(204, 102, 255));
        tienda.setText("Agregar Tienda");
        tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiendaActionPerformed(evt);
            }
        });
        getContentPane().add(tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, 40));

        traslado.setBackground(new java.awt.Color(204, 102, 255));
        traslado.setText("Realizar Envio");
        traslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trasladoActionPerformed(evt);
            }
        });
        getContentPane().add(traslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 50));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, 30));

        button_mostrarTienda.setBackground(new java.awt.Color(204, 255, 51));
        button_mostrarTienda.setText("Mostrar Tiendas");
        button_mostrarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_mostrarTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(button_mostrarTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 140, 50));

        button_mostrarProducto.setBackground(new java.awt.Color(204, 255, 51));
        button_mostrarProducto.setText("Mostrar Productos");
        button_mostrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_mostrarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(button_mostrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 140, 50));

        button_registro.setBackground(new java.awt.Color(204, 255, 0));
        button_registro.setText("Registro De Envios");
        button_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registroActionPerformed(evt);
            }
        });
        getContentPane().add(button_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 140, 50));

        imagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose\\Downloads\\zapatillas-deporte-femeninas-rayadas-azules-opinion-superior-fondo-colorido-fondo-plano-laico-minimo_77190-1824.jpg")); // NOI18N
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        this.setVisible(false);
        AgregarProducto agregar = new AgregarProducto();
        agregar.setVisible(true);
                             
    }//GEN-LAST:event_productoActionPerformed

    private void tiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiendaActionPerformed
        this.setVisible(false);
        AgregarTienda agregar = new AgregarTienda();
        agregar.setVisible(true);
    }//GEN-LAST:event_tiendaActionPerformed

    private void trasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trasladoActionPerformed
        this.setVisible(false);
        Traslado traslado = new Traslado();
        traslado.setVisible(true);
    }//GEN-LAST:event_trasladoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_mostrarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_mostrarTiendaActionPerformed
        this.setVisible(false);
        MostrarTienda mostrar = null;
        try {
            mostrar = new MostrarTienda();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrar.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_button_mostrarTiendaActionPerformed

    private void button_mostrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_mostrarProductoActionPerformed
        this.setVisible(false);
        MostrarProducto producto = null;
        try {
            producto = new MostrarProducto();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        producto.setVisible(true);
    }//GEN-LAST:event_button_mostrarProductoActionPerformed

    private void button_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registroActionPerformed
        this.setVisible(false);
        Registro registro = null;
        try {
            registro = new Registro();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        registro.setVisible(true);
    }//GEN-LAST:event_button_registroActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_mostrarProducto;
    private javax.swing.JButton button_mostrarTienda;
    private javax.swing.JButton button_registro;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton producto;
    private javax.swing.JButton tienda;
    private javax.swing.JButton traslado;
    // End of variables declaration//GEN-END:variables
}
