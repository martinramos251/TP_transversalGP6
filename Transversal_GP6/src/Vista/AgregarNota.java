package Vista;

import Entidades.Alumno;
import Entidades.Cursada;
import Entidades.Materia;
import Persistencia.AlumnoData;
import Persistencia.MateriaData;
import java.awt.Image;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarNota extends javax.swing.JInternalFrame {
    //Crea el modelo por default de la tabla y sobrescribe el metodo de la clase para hacer que las celdas no sean editabes.
    private DefaultTableModel modeloCursada = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    //Creacion de un objeto AlumnoData, MateriaData y los ArrayList donde estaran todas las materias y alumnos traidos de la base de datos.
    AlumnoData ad;
    MateriaData md;
    List<Alumno> allAlumnos;
    List<Materia> allMaterias;
    
    public AgregarNota() {
        initComponents();
        UtilidadesGenerales.ocultarMenu(this);
        
        //Inicializa el objeto de tipo AlumnoData y MateriaData, carga los respectivos ArrayList.
        try {
            ad = new AlumnoData();
            md = new MateriaData();
            allAlumnos = ad.listarAlumnos();
            allMaterias = md.listarMaterias();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        cargarCabeceras();
        cargarComboBox();
        
        //Redimensionar iconos con el metodo.
        JBactualizar.setIcon(redimensionIcon("/Imagen/actualizar.png", 35, 35));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLnotas = new javax.swing.JLabel();
        JCBalumnos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTcursadas = new javax.swing.JTable();
        JLalumnos = new javax.swing.JLabel();
        JTFnota = new javax.swing.JTextField();
        JLcalificacion = new javax.swing.JLabel();
        JBactualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Nota");

        JLnotas.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        JLnotas.setText("Notas");

        JCBalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBalumnosActionPerformed(evt);
            }
        });

        JTcursadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(JTcursadas);

        JLalumnos.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JLalumnos.setText("Alumnos:");

        JLcalificacion.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JLcalificacion.setText("Calificacion:");

        JBactualizar.setText("ACTUALIZAR");
        JBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(JLnotas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(JLalumnos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(JLcalificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFnota, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLnotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLalumnos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLcalificacion)
                    .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Muestra todas las cursadas que tiene el alumno seleccionado.
    private void JCBalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBalumnosActionPerformed
        if (JCBalumnos.getSelectedIndex() != -1) {
            borrarFilasC();
            try {
                AlumnoString as = (AlumnoString) JCBalumnos.getSelectedItem();
                if (as != null) {
                    Alumno a = as.getAlumno();
                    for (Cursada c : Menu.cd.inscripcionesAlumno(a.getNombre())) {
                        modeloCursada.addRow(new Object[]{c.getIdCursada(), c.getMateria().getNombre(), c.getNota()});
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_JCBalumnosActionPerformed
    
    //Permite actualizar la nota de una materia correspondiente a un alumno.
    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        int filaS = JTcursadas.getSelectedRow();
        try {
            if (filaS != -1) {
                int idCursada = (int) JTcursadas.getValueAt(filaS, 0);
                for (Cursada c : Menu.allCursadas) {
                    if (idCursada == c.getIdCursada()) {
                        float nota = Float.parseFloat(JTFnota.getText());
                        if (nota >= 1 && nota <= 10) {
                            c.setNota(nota);
                            Menu.cd.actualizarNota(idCursada, nota);
                            modeloCursada.setValueAt(nota, filaS, 2);
                            JOptionPane.showMessageDialog(this, "Nota actualizada con éxito!");
                            break;
                        }else{
                            JOptionPane.showMessageDialog(this, "Debe ingresar una nota entre 1 y 10", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para actualizar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "No se admiten comas, letras y espacios.\nSolo se admiten puntos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBactualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBactualizar;
    private javax.swing.JComboBox<AlumnoString> JCBalumnos;
    private javax.swing.JLabel JLalumnos;
    private javax.swing.JLabel JLcalificacion;
    private javax.swing.JLabel JLnotas;
    private javax.swing.JTextField JTFnota;
    private javax.swing.JTable JTcursadas;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    /**
    * Permite borrar las filas de la tabla alumnos segun la materia que se seleccione.
    */
    private void borrarFilasC() {
        int filas = JTcursadas.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloCursada.removeRow(f);
        }
    }
    
    /**
    * Agrega las cabeceras a las tablas.
    */
    private void cargarCabeceras() {
        modeloCursada.addColumn("idCursada");
        modeloCursada.addColumn("Materia");
        modeloCursada.addColumn("Nota");
        JTcursadas.setModel(modeloCursada);
    }
    
    /**
    * Carga los respectivos ComboBox de materias y cursadas.
    */
    private void cargarComboBox(){
        for (Alumno a : allAlumnos) {
            JCBalumnos.addItem(new AlumnoString(a));
        }
    }
    
    /**
    * Permite redimensionar a gusto las imagenes.
    *
    * @param ruta
    * @param ancho
    * @param alto
    * @return
    */
    private ImageIcon redimensionIcon(String ruta, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(getClass().getResource(ruta));
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);

        return new ImageIcon(imagenRedimensionada);
    }
}
