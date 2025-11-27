/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;
import Clinica.Cita;
import Clinica.Medico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CitasPendientes extends javax.swing.JFrame {
    private Sistema sistema;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CitasPendientes.class.getName());

    /**
     * Creates new form NewJFrame
     */
    public CitasPendientes(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        cargarCitasPendientes();
    }

    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            cargarCitasPendientes(); 
        }
        super.setVisible(visible);
    }
    
    private void cargarCitasPendientes() {
        DefaultTableModel model = (DefaultTableModel) tablaCITAS.getModel();
        model.setRowCount(0);

        Medico medicoLogueado = null;
        if (sistema.getUsuarioActual() instanceof Medico) {
            medicoLogueado = (Medico) sistema.getUsuarioActual();
        }

        if (medicoLogueado == null) {
            JOptionPane.showMessageDialog(this, "Solo los médicos pueden acceder a esta función.");
            return;
        }

        Cita[] citas = sistema.getGestionCitas().getCitas();

        for (int i = 0; i < sistema.getGestionCitas().getCantidad(); i++) {
            Cita cita = citas[i];

            if (cita != null && 
                cita.getMedico() != null && 
                cita.getMedico().equals(medicoLogueado) &&
                "Pendiente".equals(cita.getEstado())) {

                String pacienteInfo = cita.getPaciente().getNombres() + " " + cita.getPaciente().getApellidos();
                String consultorioInfo = cita.getConsultorio() != null ? cita.getConsultorio().getCodigo() : "No asignado";
                String medicoInfo = cita.getMedico().getNombres() + " " + cita.getMedico().getApellidos();

                // ORDEN CORREGIDO - debe coincidir con las columnas del modelo
                model.addRow(new Object[]{
                    cita.getFechaHora(),      // Columna 0: Fecha y Hora
                    cita.getModalidad(),      // Columna 1: Modalidad  
                    cita.getEstado(),         // Columna 2: Estado
                    pacienteInfo,             // Columna 3: Paciente
                    medicoInfo,               // Columna 4: Medico
                    consultorioInfo           // Columna 5: Consultorio
                });
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Atender = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCITAS = new javax.swing.JTable();
        bVolver = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Atender.setText("Atender");
        Atender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtenderActionPerformed(evt);
            }
        });

        tablaCITAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha y Hora", "Modalidad", "Estado", "Paciente", "Medico", "Consultorio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaCITAS);

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Atender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Atender)
                .addGap(29, 29, 29)
                .addComponent(bVolver)
                .addGap(176, 176, 176))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        MenudeOpciones menu = new MenudeOpciones(this.sistema.getUsuarioActual(), this.sistema);
        menu.setVisible(true);
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    private void AtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtenderActionPerformed
        int filaSeleccionada = tablaCITAS.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una cita para atender.");
            return;
        }

        String fechaHoraSeleccionada = tablaCITAS.getValueAt(filaSeleccionada, 0).toString(); 
        String pacienteSeleccionado = tablaCITAS.getValueAt(filaSeleccionada, 3).toString();  

        Medico medicoLogueado = (Medico) sistema.getUsuarioActual();
        Cita[] citas = sistema.getGestionCitas().getCitas();
        Cita citaEncontrada = null;
        int indiceCita = -1;

        for (int i = 0; i < sistema.getGestionCitas().getCantidad(); i++) {
            Cita cita = citas[i];
            if (cita != null && 
                cita.getMedico() != null && 
                cita.getMedico().equals(medicoLogueado) &&
                "Pendiente".equals(cita.getEstado()) &&
                cita.getFechaHora().equals(fechaHoraSeleccionada) &&
                (cita.getPaciente().getNombres() + " " + cita.getPaciente().getApellidos()).equals(pacienteSeleccionado)) {

                citaEncontrada = cita;
                indiceCita = i;
                break;
            }
        }

        if (citaEncontrada != null) {
            citaEncontrada.setEstado("En consulta");
            sistema.getGestionCitas().modificar(indiceCita, citaEncontrada);

            abrirGestionConsulta(citaEncontrada);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo encontrar la cita seleccionada.");
        }
    }//GEN-LAST:event_AtenderActionPerformed

    private void abrirGestionConsulta(Cita cita) {
        GESTIONCONSULTAPANEL panelConsulta = new GESTIONCONSULTAPANEL(sistema, cita);
        
        javax.swing.JFrame ventana = new javax.swing.JFrame("Gestión de Consulta - " + 
            cita.getPaciente().getNombres() + " " + cita.getPaciente().getApellidos());
        
        ventana.setContentPane(panelConsulta);
        ventana.setSize(1200, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        // Cerrar esta ventana
        this.dispose();
    }

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atender;
    private javax.swing.JToggleButton bVolver;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaCITAS;
    // End of variables declaration//GEN-END:variables
}
