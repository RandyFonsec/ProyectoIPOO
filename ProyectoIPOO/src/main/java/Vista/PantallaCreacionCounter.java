/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.AdmAplicacion;
import javax.swing.JOptionPane;

/**
 *
 * @author kendall c
 */
public class PantallaCreacionCounter extends javax.swing.JFrame {
    private PantallaPrincipal pantallaPrincipal;
    private AdmAplicacion admAplicacion = new AdmAplicacion();
    
    public PantallaCreacionCounter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txfNombre = new javax.swing.JTextField();
        txfCantidadCasilleros = new javax.swing.JTextField();
        txfCedula = new javax.swing.JTextField();
        txfPaquetesNivel = new javax.swing.JTextField();
        btnCrearCounter = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblPaquetesNivel = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblCantidadCasilleros = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txfDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Creación de counter");
        setPreferredSize(new java.awt.Dimension(500, 500));

        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });

        txfCantidadCasilleros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCantidadCasillerosActionPerformed(evt);
            }
        });

        txfCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCedulaActionPerformed(evt);
            }
        });

        txfPaquetesNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPaquetesNivelActionPerformed(evt);
            }
        });

        btnCrearCounter.setText("Crear counter");
        btnCrearCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCounterActionPerformed(evt);
            }
        });

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Ingrese el nombre del counter:");
        lblNombre.setToolTipText("");

        lblPaquetesNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPaquetesNivel.setText("Ingrese la cantidad de paquetes necesarios para subir de nivel:");
        lblPaquetesNivel.setToolTipText("");

        lblCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula.setText("Ingrese la cédula jurídica del  counter:");
        lblCedula.setToolTipText("");

        lblCantidadCasilleros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadCasilleros.setText("Ingrese la cantidad de casilleros del counter:");
        lblCantidadCasilleros.setToolTipText("");

        lblDireccion.setText("Ingrese la direccion del counter");

        txfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btnCrearCounter))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCantidadCasilleros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPaquetesNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblDireccion)))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfNombre)
                            .addComponent(txfCantidadCasilleros)
                            .addComponent(txfPaquetesNivel)
                            .addComponent(txfCedula)
                            .addComponent(txfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion)
                    .addComponent(txfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadCasilleros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCantidadCasilleros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaquetesNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPaquetesNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btnCrearCounter)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreActionPerformed

    private void btnCrearCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCounterActionPerformed
        try {   
            String nombre = txfNombre.getText();
            String cedulaJuridica = txfCedula.getText();
            int cantidadCasilleros = Integer.parseInt(txfCantidadCasilleros.getText());
            int paquetesNivel = Integer.parseInt(txfPaquetesNivel.getText());
            String direccion = this.txfDireccion.getText();
            boolean respuesta = admAplicacion.getAdmCounter().crearCounter(nombre, cedulaJuridica, direccion, cantidadCasilleros, paquetesNivel);
            admAplicacion.getAdmCounter().ocuparCasilleros();
            if(respuesta) {
                System.out.println(admAplicacion.getAdmCounter().getCounter().toString());
                admAplicacion.getAdmCounter().mostrarCasilleros();
                System.out.println("Hola, felicidades, lo hiciste muy bien");
                this.pantallaPrincipal = new PantallaPrincipal(this.admAplicacion);
                this.pantallaPrincipal.setVisible(true);
                this.setVisible(false);
                //conexion entre ventana principal (JFrame) y ventana secundaria (JDialog)
//                PantallaMenu ventanaMenu = new PantallaMenu(this, true, admAplicacion);
//                ventanaMenu.setVisible(true);
                
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Hubo un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
            // siguiente pantalla
        // else
            // mensaje y algun dato mal
    }//GEN-LAST:event_btnCrearCounterActionPerformed

    private void txfCantidadCasillerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCantidadCasillerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCantidadCasillerosActionPerformed

    private void txfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaActionPerformed

    private void txfPaquetesNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPaquetesNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPaquetesNivelActionPerformed

    private void txfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDireccionActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaCreacionCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCreacionCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCreacionCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCreacionCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCreacionCounter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCounter;
    private javax.swing.JLabel lblCantidadCasilleros;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaquetesNivel;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txfCantidadCasilleros;
    private javax.swing.JTextField txfCedula;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfPaquetesNivel;
    // End of variables declaration//GEN-END:variables
}