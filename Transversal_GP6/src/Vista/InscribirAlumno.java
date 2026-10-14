package Vista;

import javax.swing.table.DefaultTableModel;

public class InscribirAlumno extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public InscribirAlumno() {
        initComponents();
        UtilidadesGenerales.ocultarMenu(this);
        
        BGinscripto.add(JRBinscriptas);
        BGinscripto.add(JRBnoInscriptas);
        
        cargarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGinscripto = new javax.swing.ButtonGroup();
        JLinscripciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTvista = new javax.swing.JTable();
        JBanular = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        JLinscripciones1 = new javax.swing.JLabel();
        JRBinscriptas = new javax.swing.JRadioButton();
        JRBnoInscriptas = new javax.swing.JRadioButton();
        JBinscribir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Inscribir a Materia");

        JLinscripciones.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        JLinscripciones.setText("Inscripciones");

        JTvista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JTvista);

        JBanular.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JBanular.setText("Anular inscripcion");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JLinscripciones1.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLinscripciones1.setText("Seleccione un alumno");

        JRBinscriptas.setText("Materias Inscriptas");

        JRBnoInscriptas.setText("Materias no inscriptas");
        JRBnoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnoInscriptasActionPerformed(evt);
            }
        });

        JBinscribir.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JBinscribir.setText("Inscribir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JRBinscriptas)
                                        .addGap(40, 40, 40)
                                        .addComponent(JRBnoInscriptas))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLinscripciones1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(JBinscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBanular, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(JLinscripciones)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JLinscripciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLinscripciones1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBinscriptas)
                    .addComponent(JRBnoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBanular, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBinscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JRBnoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnoInscriptasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBnoInscriptasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGinscripto;
    private javax.swing.JButton JBanular;
    private javax.swing.JButton JBinscribir;
    private javax.swing.JLabel JLinscripciones;
    private javax.swing.JLabel JLinscripciones1;
    private javax.swing.JRadioButton JRBinscriptas;
    private javax.swing.JRadioButton JRBnoInscriptas;
    private javax.swing.JTable JTvista;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    //Agrega las cabeceras a la tabla.
    private void cargarCabecera() {
        modelo.addColumn("idMateria");
        modelo.addColumn("Materia");

        JTvista.setModel(modelo);
    }
}
