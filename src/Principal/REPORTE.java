
package Principal;
import Clinica.Cita;
import Clinica.Consultorio;
import javax.swing.table.DefaultTableModel;


public class REPORTE extends javax.swing.JPanel {

    private Sistema sistema;

    public REPORTE(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        generarReportes();
    }
    
    
    private void generarReportes() {
        try {
            if (sistema == null
                || sistema.getGestionPacientes() == null
                || sistema.getGestionCitas() == null
                || sistema.getGestionConsultorios() == null) {

                jtTotalPacientes1.setText("0");
                jtCitasAtendidas1.setText("0");
                jtConsultoriosOcupados1.setText("0");
                return;
        }

        int totalPacientes = sistema.getGestionPacientes().getCantidad();
        jtTotalPacientes1.setText(String.valueOf(totalPacientes));

        int totalCitas = sistema.getGestionCitas().getCantidad();
        jtCitasAtendidas1.setText(String.valueOf(totalCitas));

        int ocupados = 0;
        Consultorio[] consultorios = sistema.getGestionConsultorios().getConsultorios();
        int maxCons = Math.min(consultorios.length, sistema.getGestionConsultorios().getCantidad());
        for (int i = 0; i < maxCons; i++) {
            Consultorio cs = consultorios[i];
            if (cs != null && "Ocupado".equalsIgnoreCase(cs.getEstado())) {
                ocupados++;
            }
        }
        jtConsultoriosOcupados1.setText(String.valueOf(ocupados));

    }  catch (Exception e) {
        e.printStackTrace();
        jtTotalPacientes1.setText("Error");
        jtCitasAtendidas1.setText("Error");
        jtConsultoriosOcupados1.setText("Error");
    }
}   private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); 

        if (sistema == null || sistema.getGestionCitas() == null) return;

        Cita[] citas = sistema.getGestionCitas().getCitas();
        int cantidad = sistema.getGestionCitas().getCantidad();

        for (int i = 0; i < cantidad; i++) {
            Cita c = citas[i];
            if (c == null) continue;

            String fecha = c.getFechaHora() != null ? c.getFechaHora() : "";
            String paciente = (c.getPaciente() != null && c.getPaciente().getNombres() != null)
                            ? c.getPaciente().getNombres() : "Sin paciente";
            String medico = (c.getMedico() != null && c.getMedico().getNombres() != null)
                            ? c.getMedico().getNombres() : "Sin medico";
            String consultorio = (c.getConsultorio() != null && c.getConsultorio().getCodigo() != null)
                            ? c.getConsultorio().getCodigo() : "Sin consultorio";
            String estado = c.getEstado() != null ? c.getEstado() : "";

            modelo.addRow(new Object[]{ fecha, paciente, medico, consultorio, estado });
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtTotalPacientes = new javax.swing.JTextField();
        jtCitasAtendidas = new javax.swing.JTextField();
        jtConsultoriosOcupados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        jtTotalPacientes1 = new javax.swing.JTextField();
        jtCitasAtendidas1 = new javax.swing.JTextField();
        jtConsultoriosOcupados1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jtTotalPacientes.setEnabled(false);
        jtTotalPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTotalPacientesActionPerformed(evt);
            }
        });

        jtCitasAtendidas.setEnabled(false);

        jtConsultoriosOcupados.setEnabled(false);

        jLabel2.setText("Total de Pacientes Registrados");

        jLabel3.setText("Total de Citas Atendidas");

        jLabel4.setText("Total de Consultorios Ocupados");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha y Hora", "Paciente", "Medico", "Consultorio", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Registro");

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        jtTotalPacientes1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtTotalPacientes1.setDoubleBuffered(true);
        jtTotalPacientes1.setEnabled(false);
        jtTotalPacientes1.setOpaque(true);
        jtTotalPacientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTotalPacientes1ActionPerformed(evt);
            }
        });

        jtCitasAtendidas1.setBackground(new java.awt.Color(242, 242, 242));
        jtCitasAtendidas1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtCitasAtendidas1.setEnabled(false);
        jtCitasAtendidas1.setOpaque(true);

        jtConsultoriosOcupados1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtConsultoriosOcupados1.setEnabled(false);
        jtConsultoriosOcupados1.setOpaque(true);

        jLabel5.setText("Total de Pacientes Registrados");

        jLabel7.setText("Total de Citas Atendidas");

        jLabel8.setText("Total de Consultorios Ocupados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(Actualizar)
                        .addGap(154, 154, 154)
                        .addComponent(Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel6)))
                .addContainerGap(560, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtTotalPacientes1)
                    .addComponent(jtCitasAtendidas1)
                    .addComponent(jtConsultoriosOcupados1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtTotalPacientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtCitasAtendidas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtConsultoriosOcupados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar)
                    .addComponent(Volver))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        cargarTabla();
        generarReportes();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        MenudeOpciones menu = new MenudeOpciones(this.sistema.getUsuarioActual(), this.sistema);
        menu.setVisible(true);
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();    }//GEN-LAST:event_VolverActionPerformed

    private void jtTotalPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTotalPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTotalPacientesActionPerformed

    private void jtTotalPacientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTotalPacientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTotalPacientes1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtCitasAtendidas;
    private javax.swing.JTextField jtCitasAtendidas1;
    private javax.swing.JTextField jtConsultoriosOcupados;
    private javax.swing.JTextField jtConsultoriosOcupados1;
    private javax.swing.JTextField jtTotalPacientes;
    private javax.swing.JTextField jtTotalPacientes1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
