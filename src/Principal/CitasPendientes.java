
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

        // Obtener los datos de la fila seleccionada
        String fechaHoraSeleccionada = tablaCITAS.getValueAt(filaSeleccionada, 0).toString(); 
        String pacienteSeleccionado = tablaCITAS.getValueAt(filaSeleccionada, 3).toString();  

        Medico medicoLogueado = (Medico) sistema.getUsuarioActual();
        Cita[] citas = sistema.getGestionCitas().getCitas();
        Cita citaEncontrada = null;
        int indiceCita = -1;

        // Buscar la cita en el sistema
        for (int i = 0; i < sistema.getGestionCitas().getCantidad(); i++) {
            Cita cita = citas[i];
            if (cita != null && 
                cita.getMedico() != null && 
                cita.getMedico().equals(medicoLogueado) &&
                "Pendiente".equals(cita.getEstado()) &&
                cita.getFechaHora().equals(fechaHoraSeleccionada)) {

                // Verificar que el paciente coincida (usando solo el nombre para simplificar)
                String nombreCompletoPaciente = cita.getPaciente().getNombres() + " " + cita.getPaciente().getApellidos();
                if (nombreCompletoPaciente.equals(pacienteSeleccionado)) {
                    citaEncontrada = cita;
                    indiceCita = i;
                    break;
                }
            }
        }

        if (citaEncontrada != null) {
            // ✅ ACTUALIZAR ESTADO DE LA CITA
            citaEncontrada.setEstado("En consulta");
            sistema.getGestionCitas().modificar(indiceCita, citaEncontrada);

            // ✅ ABRIR PANEL DE CONSULTA PASANDO LA CITA
            abrirGestionConsulta(citaEncontrada);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo encontrar la cita seleccionada.");
            // 🔍 DEBUG: Mostrar qué citas hay disponibles
            debugCitasDisponibles(medicoLogueado, fechaHoraSeleccionada, pacienteSeleccionado);
        }                                       
    }//GEN-LAST:event_AtenderActionPerformed

    private void debugCitasDisponibles(Medico medico, String fechaHoraBuscada, String pacienteBuscado) {
        System.out.println("=== DEBUG CITAS DISPONIBLES ===");
        System.out.println("Buscando: " + fechaHoraBuscada + " - " + pacienteBuscado);
        System.out.println("Médico: " + medico.getNombres());

        Cita[] citas = sistema.getGestionCitas().getCitas();
        for (int i = 0; i < sistema.getGestionCitas().getCantidad(); i++) {
            Cita cita = citas[i];
            if (cita != null && cita.getMedico() != null && cita.getMedico().equals(medico)) {
                String pacienteInfo = cita.getPaciente().getNombres() + " " + cita.getPaciente().getApellidos();
                System.out.println("Cita " + i + ": " + 
                    cita.getFechaHora() + " - " + 
                    pacienteInfo + " - " + 
                    cita.getEstado() + " - " +
                    "¿Coincide fecha? " + cita.getFechaHora().equals(fechaHoraBuscada) + " - " +
                    "¿Coincide paciente? " + pacienteInfo.equals(pacienteBuscado));
            }
        }
        System.out.println("===============================");
    }
    
    private void abrirGestionConsulta(Cita cita) {
        try {
            // ✅ CREAR EL PANEL DE CONSULTA PASANDO LA CITA
            GESTIONCONSULTAPANEL panelConsulta = new GESTIONCONSULTAPANEL(sistema, cita);

            // ✅ CREAR UNA NUEVA VENTANA PARA LA CONSULTA
            javax.swing.JFrame ventanaConsulta = new javax.swing.JFrame("Gestión de Consulta - " + 
                cita.getPaciente().getNombres() + " " + cita.getPaciente().getApellidos());

            ventanaConsulta.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            ventanaConsulta.getContentPane().add(panelConsulta);
            ventanaConsulta.pack();
            ventanaConsulta.setSize(1200, 700);
            ventanaConsulta.setLocationRelativeTo(null);
            ventanaConsulta.setVisible(true);

            // ✅ CERRAR ESTA VENTANA DE CITAS PENDIENTES
            this.dispose();

            System.out.println("✅ Cita pasada a consulta: " + cita.getPaciente().getNombres());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Error al abrir la consulta: " + e.getMessage());
            e.printStackTrace();
        }
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
