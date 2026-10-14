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
        JMalumnos = new javax.swing.JMenu();
        JMIformularioAlumno = new javax.swing.JMenuItem();
        JMIformularioMateria = new javax.swing.JMenuItem();
        JMIinscribir = new javax.swing.JMenuItem();
        JMadministrar = new javax.swing.JMenu();
        JMImateriasAlumno = new javax.swing.JMenuItem();

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

        JMalumnos.setText("Menu");
        JMalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMalumnosActionPerformed(evt);
            }
        });

        JMIformularioAlumno.setText("Formulario de Alumnos");
        JMIformularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIformularioAlumnoActionPerformed(evt);
            }
        });
        JMalumnos.add(JMIformularioAlumno);

        JMIformularioMateria.setText("Formulario de Materias");
        JMIformularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIformularioMateriaActionPerformed(evt);
            }
        });
        JMalumnos.add(JMIformularioMateria);

        JMIinscribir.setText("Inscribir alumno");
        JMIinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIinscribirActionPerformed(evt);
            }
        });
        JMalumnos.add(JMIinscribir);

        JMenuBarra.add(JMalumnos);

        JMadministrar.setText("Administrar");

        JMImateriasAlumno.setText("Ver materias de alumno");
        JMImateriasAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMImateriasAlumnoActionPerformed(evt);
            }
        });
        JMadministrar.add(JMImateriasAlumno);

        JMenuBarra.add(JMadministrar);

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

    private void JMalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMalumnosActionPerformed

    }//GEN-LAST:event_JMalumnosActionPerformed

    private void JMIformularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIformularioAlumnoActionPerformed
        JDPescritorio.removeAll();
        JDPescritorio.revalidate();
        JDPescritorio.repaint();
        FormularioAlumnos ventana = new FormularioAlumnos();
        ventana.setVisible(true);
        JDPescritorio.add(ventana);
        JDPescritorio.moveToFront(ventana);
    }//GEN-LAST:event_JMIformularioAlumnoActionPerformed

    private void JMIinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIinscribirActionPerformed
        JDPescritorio.removeAll();
        JDPescritorio.revalidate();
        JDPescritorio.repaint();
        InscribirAlumno ventana = new InscribirAlumno();
        ventana.setVisible(true);
        JDPescritorio.add(ventana);
        JDPescritorio.moveToFront(ventana);
    }//GEN-LAST:event_JMIinscribirActionPerformed

    private void JMIformularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIformularioMateriaActionPerformed
        JDPescritorio.removeAll();
        JDPescritorio.revalidate();
        JDPescritorio.repaint();
        FormularioMaterias ventana = new FormularioMaterias();
        ventana.setVisible(true);
        JDPescritorio.add(ventana);
        JDPescritorio.moveToFront(ventana);
    }//GEN-LAST:event_JMIformularioMateriaActionPerformed

    private void JMImateriasAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMImateriasAlumnoActionPerformed
        JDPescritorio.removeAll();
        JDPescritorio.revalidate();
        JDPescritorio.repaint();
        MateriasAlumnos ventana = new MateriasAlumnos();
        ventana.setVisible(true);
        JDPescritorio.add(ventana);
        JDPescritorio.moveToFront(ventana);
    }//GEN-LAST:event_JMImateriasAlumnoActionPerformed

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
    private javax.swing.JMenuItem JMIformularioAlumno;
    private javax.swing.JMenuItem JMIformularioMateria;
    private javax.swing.JMenuItem JMIinscribir;
    private javax.swing.JMenuItem JMImateriasAlumno;
    private javax.swing.JMenu JMadministrar;
    private javax.swing.JMenu JMalumnos;
    private javax.swing.JMenuBar JMenuBarra;
    // End of variables declaration//GEN-END:variables
   
}
