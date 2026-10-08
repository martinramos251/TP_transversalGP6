package Vista;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPescritorio = new javax.swing.JDesktopPane();
        JMenuBarra = new javax.swing.JMenuBar();
        JMarchivo = new javax.swing.JMenu();
        JMIsalir = new javax.swing.JMenuItem();
        JMalumnos = new javax.swing.JMenu();
        JMI_formulario = new javax.swing.JMenuItem();
        JMI_inscribir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión (SGULP)");

        javax.swing.GroupLayout JDPescritorioLayout = new javax.swing.GroupLayout(JDPescritorio);
        JDPescritorio.setLayout(JDPescritorioLayout);
        JDPescritorioLayout.setHorizontalGroup(
            JDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        JDPescritorioLayout.setVerticalGroup(
            JDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        JMarchivo.setText("Archivo");

        JMIsalir.setText("Salir");
        JMIsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIsalirActionPerformed(evt);
            }
        });
        JMarchivo.add(JMIsalir);

        JMenuBarra.add(JMarchivo);

        JMalumnos.setText("Alumnos");
        JMalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMalumnosActionPerformed(evt);
            }
        });

        JMI_formulario.setText("Formulario de Alumnos");
        JMI_formulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_formularioActionPerformed(evt);
            }
        });
        JMalumnos.add(JMI_formulario);

        JMI_inscribir.setText("Inscribir a materia");
        JMI_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_inscribirActionPerformed(evt);
            }
        });
        JMalumnos.add(JMI_inscribir);

        JMenuBarra.add(JMalumnos);

        setJMenuBar(JMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPescritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPescritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMIsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JMIsalirActionPerformed

    private void JMalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMalumnosActionPerformed

    }//GEN-LAST:event_JMalumnosActionPerformed

    private void JMI_formularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_formularioActionPerformed
        JDPescritorio.removeAll();
        JDPescritorio.repaint();
        FormularioAlumnos ventana = new FormularioAlumnos();
        ventana.setVisible(true);
        JDPescritorio.add(ventana);
        JDPescritorio.moveToFront(ventana);
    }//GEN-LAST:event_JMI_formularioActionPerformed

    private void JMI_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_inscribirActionPerformed
        JDPescritorio.removeAll();
        JDPescritorio.repaint();
        InscribirMateria ventana = new InscribirMateria();
        ventana.setVisible(true);
        JDPescritorio.add(ventana);
        JDPescritorio.moveToFront(ventana);
    }//GEN-LAST:event_JMI_inscribirActionPerformed

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
    private javax.swing.JDesktopPane JDPescritorio;
    private javax.swing.JMenuItem JMI_formulario;
    private javax.swing.JMenuItem JMI_inscribir;
    private javax.swing.JMenuItem JMIsalir;
    private javax.swing.JMenu JMalumnos;
    private javax.swing.JMenu JMarchivo;
    private javax.swing.JMenuBar JMenuBarra;
    // End of variables declaration//GEN-END:variables


}
