/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import BaseDatos.Productos;
import Dao.DaoProducto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Jose
 */
public class Traslado extends javax.swing.JFrame {
    
    
    Productos producto = new Productos();
    DaoProducto dao = new DaoProducto();
    
    
    public Traslado() {
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

        label_producto = new javax.swing.JLabel();
        label_tienda = new javax.swing.JLabel();
        txt_producto = new javax.swing.JTextField();
        txt_tienda = new javax.swing.JTextField();
        trasladar = new javax.swing.JButton();
        label_traslado = new javax.swing.JLabel();
        txt_traslado = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_producto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_producto.setText("Id Producto:");
        getContentPane().add(label_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 70, 30));

        label_tienda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_tienda.setText("Id Tienda:");
        getContentPane().add(label_tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 60, 30));
        getContentPane().add(txt_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 130, 30));
        getContentPane().add(txt_tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 130, 30));

        trasladar.setBackground(new java.awt.Color(102, 255, 51));
        trasladar.setText("Trasladar");
        trasladar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trasladarActionPerformed(evt);
            }
        });
        getContentPane().add(trasladar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 120, 60));

        label_traslado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_traslado.setText("Traslado:");
        getContentPane().add(label_traslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 60, 30));

        txt_traslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_trasladoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_traslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 130, 30));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo.setText("    TRASLADO");
        titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 110, 38));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, 20));

        imagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose\\Downloads\\camiones-ecologicos.jpg")); // NOI18N
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trasladarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trasladarActionPerformed
        
        producto.setId_producto(Integer.parseInt(txt_producto.getText()));
        producto.setTraslado(Integer.parseInt(txt_traslado.getText()));
        producto.setTienda_asociada(Integer.parseInt(txt_tienda.getText()));
       
        
        try {
            dao.envio(producto);
        } catch (SQLException ex) {
            Logger.getLogger(Traslado.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    
    }//GEN-LAST:event_trasladarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_trasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_trasladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_trasladoActionPerformed

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
            java.util.logging.Logger.getLogger(Traslado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traslado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traslado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traslado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traslado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label_producto;
    private javax.swing.JLabel label_tienda;
    private javax.swing.JLabel label_traslado;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton trasladar;
    private javax.swing.JTextField txt_producto;
    private javax.swing.JTextField txt_tienda;
    private javax.swing.JTextField txt_traslado;
    // End of variables declaration//GEN-END:variables
}