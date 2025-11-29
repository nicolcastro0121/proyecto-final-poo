
package Principal;
import Clinica.Cita;
import Clinica.Medico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CitasPendientes extends javax.swing.JFrame {
    private Sistema sistema;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CitasPendientes.class.getName());

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

        String rolActual = sistema.getUsuarioActual().getRol();
        boolean esAdmin = "Administrador".equals(rolActual);
        boolean esMedico = "Médico".equals(rolActual);
        boolean esEnfermero = "Enfermero".equals(rolActual);

        if (!esAdmin && !esMedico && !esEnfermero) {
            JOptionPane.showMessageDialog(this, "Solo Administradores, Médicos y Enfermeros pueden acceder a esta función.");
            // this.dispose(); 
            return;
        }

        Medico medicoLogueado = null;
        if (esMedico) {
            if (sistema.getUsuarioActual() instanceof Medico) {
                medicoLogueado = (Medico) sistema.getUsuarioActual();
            } else {
                JOptionPane.showMessageDialog(this, "Error de sistema: Usuario con rol Médico no es instancia de Medico.");
                return;
            }
        }


        Cita[] citas = sistema.getGestionCitas().getCitas();

        for (int i = 0; i < sistema.getGestionCitas().getCantidad(); i++) {
            Cita cita = citas[i];

            boolean esPendiente = "Pendiente".equals(cita.getEstado());
            boolean esCitaValida = (cita != null && cita.getMedico() != null);

            if (esCitaValida && esPendiente) {

                boolean mostrarCita = false;

                if (esAdmin || esEnfermero) {
                    mostrarCita = true;
                } else if (esMedico) {
                    mostrarCita = cita.getMedico().equals(medicoLogueado);
                }

                if (mostrarCita) {
                    String pacienteInfo = cita.getPaciente().getNombres() + " " + cita.getPaciente().getApellidos();
                    String consultorioInfo = cita.getConsultorio() != null ? cita.getConsultorio().getCodigo() : "No asignado";
                    String medicoInfo = cita.getMedico().getNombres() + " " + cita.getMedico().getApellidos();

                    model.addRow(new Object[]{
                        cita.getFechaHora(),      
                        cita.getModalidad(),      
                        cita.getEstado(),         
                        pacienteInfo,             
                        medicoInfo,              
                        consultorioInfo          
                    });
                }
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
        this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    private void AtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtenderActionPerformed
        int filaSeleccionada = tablaCITAS.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una cita para atender.");
            return;
        }

        Object fechaHoraObj = tablaCITAS.getValueAt(filaSeleccionada, 0);
        String fechaHoraSeleccionada = String.valueOf(fechaHoraObj); 

        Object pacienteObj = tablaCITAS.getValueAt(filaSeleccionada, 3);
        String pacienteSeleccionado = String.valueOf(pacienteObj); 

        Object medicoObj = tablaCITAS.getValueAt(filaSeleccionada, 4);
        String medicoSeleccionado = String.valueOf(medicoObj);

        String rolActual = sistema.getUsuarioActual().getRol();
        boolean esAdminOEnfermero = "Administrador".equals(rolActual) || "Enfermero".equals(rolActual);
        boolean esMedico = "Médico".equals(rolActual);
        Medico medicoLogueado = esMedico && (sistema.getUsuarioActual() instanceof Clinica.Medico) 
                                 ? (Clinica.Medico) sistema.getUsuarioActual() : null;

        Cita[] citas = sistema.getGestionCitas().getCitas();
        Cita citaEncontrada = null;
        int indiceCita = -1;

        for (int i = 0; i < sistema.getGestionCitas().getCantidad(); i++) {
            Cita cita = citas[i];
            if (cita != null && 
                cita.getMedico() != null && 
                "Pendiente".equals(cita.getEstado()) &&
                cita.getFechaHora().equals(fechaHoraSeleccionada)) {

                String nombreCompletoPaciente = cita.getPaciente().getNombres() + " " + cita.getPaciente().getApellidos();
                String nombreCompletoMedico = cita.getMedico().getNombres() + " " + cita.getMedico().getApellidos();

                if (nombreCompletoPaciente.equals(pacienteSeleccionado) && 
                    nombreCompletoMedico.equals(medicoSeleccionado)) {

                    if (esAdminOEnfermero || (esMedico && cita.getMedico().equals(medicoLogueado))) {
                        citaEncontrada = cita;
                        indiceCita = i;
                        break;
                    }
                }
            }
        } 

        if (citaEncontrada != null) {
            citaEncontrada.setEstado("En consulta"); 

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
