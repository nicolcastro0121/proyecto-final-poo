package Principal;

import Clinica.Cita;
import Clinica.Consultorio;
import Clinica.Empleado;
import Clinica.Medico;
import Clinica.Paciente;
import javax.swing.JOptionPane;
import GestionClinica.GestionCita;
import javax.swing.table.DefaultTableModel;

public class GESTIONCITASPANEL extends javax.swing.JPanel {
    private int indiceSeleccionado = -1;
    private Sistema sistema;

    public GESTIONCITASPANEL(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        cargarCombos();
        cargarTabla();
    }

    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaCITAS.getModel();
        modelo.setRowCount(0);

        Cita[] lista = sistema.getGestionCitas().getCitas();
        int total = sistema.getGestionCitas().getCantidad();

        for (int i = 0; i < total; i++) {
            Cita c = lista[i];
            modelo.addRow(new Object[]{
                c.getFechaHora(),
                c.getModalidad(),
                c.getEstado(),
                c.getPaciente().getNombres(),
                c.getMedico().getNombres(),
                c.getConsultorio().getCodigo()
            });
        }
    }

    private void actualizarTablaCitas() {
        DefaultTableModel modelo = (DefaultTableModel) tablaCITAS.getModel();
        modelo.setRowCount(0);

        Cita[] lista = sistema.getGestionCitas().getCitas();
        int total = sistema.getGestionCitas().getCantidad();

        for (int i = 0; i < total; i++) {
            Cita c = lista[i];
            modelo.addRow(new Object[]{
                c.getFechaHora(),
                c.getModalidad(),
                c.getEstado(),
                c.getPaciente().getNombres(),
                c.getMedico().getNombres(),
                c.getConsultorio().getCodigo()
            });
        }
    }
    
    private void cargarCombos() {

    comboPACIENTE.removeAllItems();
    comboMEDICO.removeAllItems();
    COMOBconultorios.removeAllItems();

    // Pacientes
    for (Paciente p : sistema.getGestionPacientes().getPacientes()) {
        if (p != null) {
            comboPACIENTE.addItem(p.getNombres() + " - " + p.getDni());
        }
    }

    // Médicos
    for (Empleado e : sistema.getGestionEmpleados().getEmpleados()) {
        if (e instanceof Medico m) {
            comboMEDICO.addItem(m.getNombres() + " - " + m.getDni());
        }
    }

    // Consultorios
    for (Consultorio c : sistema.getGestionConsultorios().getConsultorios()) {
        if (c != null) {
            COMOBconultorios.addItem(c.getCodigo()); // solo código
        }
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        textMedicos = new javax.swing.JLabel();
        textPacientes = new javax.swing.JLabel();
        bModificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        comboPACIENTE = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        bVolver = new javax.swing.JToggleButton();
        COMOBconultorios = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCITAS = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        FechayhoraIngresar = new javax.swing.JTextField();
        modalidadCOMBOBOX = new javax.swing.JComboBox<>();
        estadoCOMBOBOX = new javax.swing.JComboBox<>();
        comboMEDICO = new javax.swing.JComboBox<>();

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("CITAS");

        textMedicos.setText("Medicos");

        textPacientes.setText("Pacientes");

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        comboPACIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPACIENTEActionPerformed(evt);
            }
        });

        jLabel3.setText("Consultorios");

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        COMOBconultorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMOBconultoriosActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Datos Citas");

        jLabel5.setText("Modalidad:");

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
        if (tablaCITAS.getColumnModel().getColumnCount() > 0) {
            tablaCITAS.getColumnModel().getColumn(0).setResizable(false);
            tablaCITAS.getColumnModel().getColumn(1).setResizable(false);
            tablaCITAS.getColumnModel().getColumn(2).setResizable(false);
            tablaCITAS.getColumnModel().getColumn(3).setResizable(false);
            tablaCITAS.getColumnModel().getColumn(4).setResizable(false);
            tablaCITAS.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setText("Fecha y hora:");

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        modalidadCOMBOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presencial", "Teleconsulta" }));

        estadoCOMBOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confirmada", "Cancelada", "En sala", "Pendiente" }));

        comboMEDICO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bModificar)
                        .addGap(186, 186, 186)
                        .addComponent(bEliminar)
                        .addGap(237, 237, 237)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMedicos)
                                    .addComponent(textPacientes)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FechayhoraIngresar)
                                    .addComponent(modalidadCOMBOBOX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estadoCOMBOBOX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(COMOBconultorios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboPACIENTE, 0, 146, Short.MAX_VALUE)
                                    .addComponent(comboMEDICO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bVolver))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(Agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(Guardar)))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FechayhoraIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(modalidadCOMBOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(estadoCOMBOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPacientes)
                            .addComponent(comboPACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textMedicos)
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(COMOBconultorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboMEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Guardar)
                            .addComponent(Agregar))
                        .addGap(18, 18, 18)
                        .addComponent(bVolver)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bModificar)
                            .addComponent(bEliminar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        int fila = tablaCITAS.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una cita para modificar.");
            return;
        }
        String seleccionadoPaciente = (String) comboPACIENTE.getSelectedItem();
        Paciente paciente = null;
        for (Paciente p : sistema.getGestionPacientes().getPacientes()) {
             if (p != null && (p.getNombres() + " - " + p.getDni()).equals(seleccionadoPaciente)) {
             paciente = p;
                break;
    }
}

// Medico
        String seleccionadoMedico = (String) comboMEDICO.getSelectedItem();
        Medico medico = null;
        for (Empleado e : sistema.getGestionEmpleados().getEmpleados()) {
            if (e instanceof Medico m && (m.getNombres() + " - " + m.getDni()).equals(seleccionadoMedico)) {
            medico = m;
            break;
    }
}

// Consultorio
        String seleccionadoConsultorio = (String) COMOBconultorios.getSelectedItem();
        Consultorio consultorio = null;
        for (Consultorio c : sistema.getGestionConsultorios().getConsultorios()) {
            if (c != null && c.getCodigo().equals(seleccionadoConsultorio)) {
            consultorio = c;
            break;
    }
}
        if (paciente == null || medico == null || consultorio == null) {
        JOptionPane.showMessageDialog(this, "Seleccione paciente, médico y consultorio válidos.");
        return;
}
        
        String fechaHora = FechayhoraIngresar.getText().trim();
        String modalidad = modalidadCOMBOBOX.getSelectedItem().toString();
        String estado = estadoCOMBOBOX.getSelectedItem().toString();


        Cita nueva = new Cita(
                fechaHora,
                modalidad,
                estado,
                paciente,
                medico,
                consultorio
        );

        boolean ok = sistema.getGestionCitas().modificar(fila, nueva);

        if (ok) {
            actualizarTablaCitas();
            JOptionPane.showMessageDialog(this, "Cita modificada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo modificar la cita.");
        }

    }//GEN-LAST:event_bModificarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        int fila = tablaCITAS.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una cita para eliminar.");
            return;
        }

        boolean ok = sistema.getGestionCitas().eliminar(fila);

        if (ok) {
            actualizarTablaCitas();
            JOptionPane.showMessageDialog(this, "Cita eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar la cita.");
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed

        MenudeOpciones menu = new MenudeOpciones(this.sistema.getUsuarioActual(), this.sistema);
        menu.setVisible(true);
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        String seleccionadoPaciente = (String) comboPACIENTE.getSelectedItem();
        Paciente paciente = null;
        for (Paciente p : sistema.getGestionPacientes().getPacientes()) {
            if (p != null && (p.getNombres() + " - " + p.getDni()).equals(seleccionadoPaciente)) {
            paciente = p;
            break;
    }
}

// Obtener el médico
        String seleccionadoMedico = (String) comboMEDICO.getSelectedItem();
        Medico medico = null;
        for (Empleado e : sistema.getGestionEmpleados().getEmpleados()) {
            if (e instanceof Medico m && (m.getNombres() + " - " + m.getDni()).equals(seleccionadoMedico)) {
            medico = m;
            break;
    }
}

// Obtener consultorio
        String seleccionadoConsultorio = (String) COMOBconultorios.getSelectedItem();
        Consultorio consultorio = null;
        for (Consultorio c : sistema.getGestionConsultorios().getConsultorios()) {
            if (c != null && c.getCodigo().equals(seleccionadoConsultorio)) {
                consultorio = c;
                break;
    }
}
        String fechaHora = FechayhoraIngresar.getText().trim();
        String modalidad = modalidadCOMBOBOX.getSelectedItem().toString();
        String estado = estadoCOMBOBOX.getSelectedItem().toString();
        
        Cita nueva = new Cita(fechaHora, modalidad, estado, paciente, medico, consultorio);

        boolean ok = sistema.getGestionCitas().agregar(nueva);

        if (ok) {
        actualizarTablaCitas();
        JOptionPane.showMessageDialog(this, "Cita agregada correctamente.");
        } else {
    JOptionPane.showMessageDialog(this, "No hay espacio para más citas.");
}
    }//GEN-LAST:event_AgregarActionPerformed

    private void comboPACIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPACIENTEActionPerformed
        // TODO add your handling code here:
                                                   
        String seleccionado = (String) comboPACIENTE.getSelectedItem();
          
    

    }//GEN-LAST:event_comboPACIENTEActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        if (indiceSeleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No hay cita seleccionada para guardar.");
            return;
        }
        String fechaHora = FechayhoraIngresar.getText().trim();
        String modalidad = modalidadCOMBOBOX.getSelectedItem().toString();
        String estado = estadoCOMBOBOX.getSelectedItem().toString();

        Paciente paciente = (Paciente) comboPACIENTE.getSelectedItem();
        Medico medico = (Medico) comboMEDICO.getSelectedItem();
        Consultorio consultorio = (Consultorio) COMOBconultorios.getSelectedItem();
        
        Cita citas = sistema.getGestionCitas().buscar(indiceSeleccionado);
        Cita nueva = new Cita(
                fechaHora,
                modalidad,
                estado,
                paciente,
                medico,
                consultorio
        );
         boolean exito = sistema.getGestionCitas().modificar(indiceSeleccionado, nueva);

            if (exito) {
                actualizarTabla();
                limpiarCampos();
                indiceSeleccionado = -1;
                JOptionPane.showMessageDialog(this, "Cita modificada correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar la cita.");
            }
    }//GEN-LAST:event_GuardarActionPerformed

    private void COMOBconultoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMOBconultoriosActionPerformed
        // TODO add your handling code here:
        String codigo = (String) COMOBconultorios.getSelectedItem();
    }//GEN-LAST:event_COMOBconultoriosActionPerformed
        private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaCITAS.getModel();
        model.setRowCount(0);
        
        GestionCita gestor = sistema.getGestionCitas();
        
        for (int i = 0; i < gestor.getCantidad(); i++) {
            Cita c = gestor.getCitas()[i];
            model.addRow(new Object[]{
                c.getEstado(),
                c.getFechaHora(),
                c.getMedico(),
                c.getModalidad(),
                c.getPaciente(),
                c.getConsultorio(),
            });
        }
    }
    
    private void limpiarCampos() {
        FechayhoraIngresar.setText("");
        modalidadCOMBOBOX.setSelectedIndex(-1);
        estadoCOMBOBOX.setSelectedIndex(-1);
        comboPACIENTE.setSelectedIndex(-1);
        comboMEDICO.setSelectedIndex(-1);
        COMOBconultorios.setSelectedIndex(-1);        
        indiceSeleccionado = -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> COMOBconultorios;
    private javax.swing.JTextField FechayhoraIngresar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bModificar;
    private javax.swing.JToggleButton bVolver;
    private javax.swing.JComboBox<String> comboMEDICO;
    private javax.swing.JComboBox<String> comboPACIENTE;
    private javax.swing.JComboBox<String> estadoCOMBOBOX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> modalidadCOMBOBOX;
    private javax.swing.JTable tablaCITAS;
    private javax.swing.JLabel textMedicos;
    private javax.swing.JLabel textPacientes;
    // End of variables declaration//GEN-END:variables
}
