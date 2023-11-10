package GUI;

/**
 *
 * @author brayan
 */
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import promedianainterfaz.Nota;
import promedianainterfaz.Materia;
import promedianainterfaz.Semestre;

public class VentanaNuevaNota extends javax.swing.JFrame {

    private DefaultListModel<Nota> notas = new DefaultListModel<>();
    private Materia materia = new Materia("", 0, notas);
    //se crea una materia vacia para despues modificarla
    
    private Semestre semestre = new Semestre(); 
    //semetre vacio para llenarlo apartir del parametro del constructor
    
    private int index; 
    // me dira con que indice de la lista de materias estoy tabajando

    public VentanaNuevaNota(Semestre semestre, int index) {
        initComponents();
        
        this.index = index; 
        
        //se cambian los valores de la materia vacia a los de la materia seleccionada
        this.materia = semestre.getMaterias().getElementAt(index);
        
        //se cambia el semestre vacio por el semestre que pase por parametro
        this.semestre = semestre; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSiguienteNuevaNota = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCalificacionNuevaNota = new javax.swing.JTextField();
        txtNombreNuevaNota = new javax.swing.JTextField();
        txtPorcentajeNuevaNota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(148, 112, 112));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSiguienteNuevaNota.setBackground(new java.awt.Color(231, 200, 200));
        btnSiguienteNuevaNota.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        btnSiguienteNuevaNota.setText("Siguente");
        btnSiguienteNuevaNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteNuevaNotaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguienteNuevaNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel1.setText("calificacion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel2.setText("Nombre de la nueva nota");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 20));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel3.setText("porcentaje de la nueva nota");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtCalificacionNuevaNota.setBackground(new java.awt.Color(68, 68, 68));
        txtCalificacionNuevaNota.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtCalificacionNuevaNota.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtCalificacionNuevaNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 230, -1));

        txtNombreNuevaNota.setBackground(new java.awt.Color(68, 68, 68));
        txtNombreNuevaNota.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtNombreNuevaNota.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtNombreNuevaNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 230, -1));

        txtPorcentajeNuevaNota.setBackground(new java.awt.Color(68, 68, 68));
        txtPorcentajeNuevaNota.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtPorcentajeNuevaNota.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtPorcentajeNuevaNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteNuevaNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteNuevaNotaActionPerformed
        // boton para agregar la nueva nota a la materia 
        
        // se condiciona que los huecos de texto no esten vacios 
        if (txtCalificacionNuevaNota.getText().equals("") || txtNombreNuevaNota.getText().equals("") || txtPorcentajeNuevaNota.getText().equals("")) {
            //se controla las exepciones de tipo argumento ilegal
            try {
                String nombre = txtNombreNuevaNota.getText(); 
                double porcentaje = Double.parseDouble(txtPorcentajeNuevaNota.getText()); 
                double calificacion = Double.parseDouble(txtCalificacionNuevaNota.getText()); 
                
                //creacion de la nueva nota 
                Nota nuevaNota = new Nota(nombre, porcentaje, calificacion); 

                //se ingresa la nueva nota al semestre 
                semestre.getMaterias().getElementAt(index).getNotas().addElement(nuevaNota);
                
                // se pasa el nuevos semestre con la nueva nota a la ventana materia y se hace visible; 
                VentanaMateria ventanaMateria = new VentanaMateria(semestre, index); 
                ventanaMateria.setVisible(true);
                ventanaMateria.setLocationRelativeTo(null);
                
                this.dispose();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Ups! Ingresaste un dato invalido");
            }
            JOptionPane.showMessageDialog(rootPane, "Ups! Se te olvido ingresar algo");
        }
    }//GEN-LAST:event_btnSiguienteNuevaNotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguienteNuevaNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCalificacionNuevaNota;
    private javax.swing.JTextField txtNombreNuevaNota;
    private javax.swing.JTextField txtPorcentajeNuevaNota;
    // End of variables declaration//GEN-END:variables
}
