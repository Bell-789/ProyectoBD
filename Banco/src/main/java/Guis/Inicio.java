
package Guis;
import javax.swing.JScrollPane;

public class Inicio extends javax.swing.JFrame {
 
    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Nombre = new javax.swing.JTextPane();
        InicioSesionTxt = new javax.swing.JButton();
        RegistarTxt = new javax.swing.JToggleButton();
        retiroSinCuentaTxt = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nombre.setEditable(false);
        Nombre.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Nombre.setText("Banco BV");
        jScrollPane1.setViewportView(Nombre);

        InicioSesionTxt.setText("Iniciar Sesion");
        InicioSesionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioSesionTxtActionPerformed(evt);
            }
        });

        RegistarTxt.setText("Registrar Usuario");
        RegistarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarTxtActionPerformed(evt);
            }
        });

        retiroSinCuentaTxt.setText("Retiro sin cuenta");
        retiroSinCuentaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiroSinCuentaTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(retiroSinCuentaTxt)
                            .addComponent(RegistarTxt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InicioSesionTxt)
                                .addGap(12, 12, 12)))
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(InicioSesionTxt)
                .addGap(28, 28, 28)
                .addComponent(RegistarTxt)
                .addGap(26, 26, 26)
                .addComponent(retiroSinCuentaTxt)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioSesionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioSesionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioSesionTxtActionPerformed

    private void RegistarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarTxtActionPerformed
        Registroo v1 = new Registroo();
        v1.setVisible(true);
    }//GEN-LAST:event_RegistarTxtActionPerformed

    private void retiroSinCuentaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retiroSinCuentaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retiroSinCuentaTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InicioSesionTxt;
    private javax.swing.JTextPane Nombre;
    private javax.swing.JToggleButton RegistarTxt;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JToggleButton retiroSinCuentaTxt;
    // End of variables declaration//GEN-END:variables
}
