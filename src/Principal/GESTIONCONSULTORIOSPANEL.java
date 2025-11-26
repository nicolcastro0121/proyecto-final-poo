package Principal;

import Clinica.Consultorio;
import Clinica.Empleado;
import Clinica.Medico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GESTIONCONSULTORIOSPANEL extends javax.swing.JPanel {

    private Sistema sistema;

    public GESTIONCONSULTORIOSPANEL(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        cargarTabla();
        cargarComboMedicos();
    }

    private void cargarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaConsultorios.getModel();
        model.setRowCount(0);

        Consultorio[] lista = sistema.getGestionConsultorios().getConsultorios();

        for (Consultorio c : lista) {
            if (c == null) {
                continue;
            }

            String medicoNombre = "Sin asignar";

            if (c.getMedicoAsignado() != null) {
                medicoNombre = c.getMedicoAsignado().getNombres()
                        + " "
                        + c.getMedicoAsignado().getApellidos();
            }

            model.addRow(new Object[]{
                c.getCodigo(),
                c.getEspecialidad(),
                medicoNombre,
                c.getEstado()
            });
        }
    }

    private void cargarComboMedicos() {

        comboMedicos.removeAllItems();

        Empleado[] lista = sistema.getGestionEmpleados().getEmpleados();

        for (int i = 0; i < sistema.getGestionEmpleados().getCantidad(); i++) {
            Empleado emp = lista[i];

            // Solo médicos
            if (emp instanceof Medico) {
                Medico m = (Medico) emp;
                comboMedicos.addItem(m.getNombres() + " " + m.getApellidos());
            }
        }
    }

    private boolean esNumero(String t) {
        if (t == null || t.isEmpty()) {
            return false;
        }
        for (char c : t.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dos = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        especialidadINGRESARTEXTO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        comboMedicos = new javax.swing.JComboBox<>();
        Volverbt = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultorios = new javax.swing.JTable();
        Disponibilidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        diez = new javax.swing.JCheckBox();
        Modificar = new javax.swing.JButton();
        once = new javax.swing.JCheckBox();
        Eliminar = new javax.swing.JButton();
        doce = new javax.swing.JCheckBox();
        una = new javax.swing.JCheckBox();
        INGRESARTEXTOCODIGO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        dos.setText("2:00 - 3:00 PM");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado:");

        agregar.setText("Aceptar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        especialidadINGRESARTEXTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadINGRESARTEXTOActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel4.setText("Horarios:");

        eliminar.setText("Cancelar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        comboMedicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selccione..." }));
        comboMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicosActionPerformed(evt);
            }
        });

        Volverbt.setText("Volver");

        jLabel2.setText("Especialidad:");

        tablaConsultorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Especialidad", "Estado", "Horarios", "Médico Asignado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaConsultorios);

        Disponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado" }));
        Disponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponibilidadActionPerformed(evt);
            }
        });

        jLabel5.setText("Médico asignado");

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        diez.setText("10:00 - 11:00 AM");
        diez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diezActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        once.setText("11:00 - 12:00 AM");
        once.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onceActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        doce.setText("12:00 - 1:00 PM");
        doce.setToolTipText("");
        doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doceActionPerformed(evt);
            }
        });

        una.setText("1:00 - 2:00 PM");
        una.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unaActionPerformed(evt);
            }
        });

        INGRESARTEXTOCODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARTEXTOCODIGOActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 48)); // NOI18N
        jLabel6.setText("CONSULTORIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Agregar)
                        .addGap(72, 72, 72)
                        .addComponent(Modificar)
                        .addGap(79, 79, 79)
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Volverbt)
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Disponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dos)
                            .addComponent(una)
                            .addComponent(once)
                            .addComponent(diez)
                            .addComponent(INGRESARTEXTOCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(especialidadINGRESARTEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboMedicos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(doce, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregar)
                        .addGap(69, 69, 69)
                        .addComponent(eliminar)))
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Eliminar)
                            .addComponent(Modificar)
                            .addComponent(Agregar)
                            .addComponent(Volverbt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(INGRESARTEXTOCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(especialidadINGRESARTEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Disponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(diez))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(once)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doce)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(una)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dos)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(agregar)
                                    .addComponent(eliminar))))))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

    }//GEN-LAST:event_agregarActionPerformed

    private void especialidadINGRESARTEXTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadINGRESARTEXTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadINGRESARTEXTOActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

    }//GEN-LAST:event_eliminarActionPerformed

    private void DisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisponibilidadActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String codigo = INGRESARTEXTOCODIGO.getText().trim();

        if (!esNumero(codigo)) {
            JOptionPane.showMessageDialog(this, "Código inválido.");
            return;
        }

        String[] horarios = new String[5];
        int idx = 0;
        if (diez.isSelected()) {
            horarios[idx++] = "10:00";
        }
        if (once.isSelected()) {
            horarios[idx++] = "11:00";
        }
        if (doce.isSelected()) {
            horarios[idx++] = "12:00";
        }
        if (una.isSelected()) {
            horarios[idx++] = "13:00";
        }
        if (dos.isSelected()) {
            horarios[idx++] = "14:00";
        }

        String especialidad = especialidadINGRESARTEXTO.getText().trim();

        if (especialidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una especialidad.");
            return;
        }

        String estado = Disponibilidad.getSelectedItem().toString();
        Medico medico = (Medico) comboMedicos.getSelectedItem();

        Consultorio nuevo = new Consultorio(
                codigo,
                especialidad,
                estado);

        boolean ok = sistema.getGestionConsultorios().agregar(nuevo);

        if (ok) {
            cargarTabla();
            JOptionPane.showMessageDialog(this, "Consultorio agregado.");
        } else {
            JOptionPane.showMessageDialog(this, "No hay espacio para más consultorios.");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void diezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diezActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        String codigo = INGRESARTEXTOCODIGO.getText().trim();
        String especialidad = especialidadINGRESARTEXTO.getText().trim();
        String estado = Disponibilidad.getSelectedItem().toString();

        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código para modificar.");
            return;
        }

        Consultorio nuevo = new Consultorio(codigo, especialidad, estado);

        int indexMed = comboMedicos.getSelectedIndex();
        if (indexMed >= 0 && !comboMedicos.getSelectedItem().equals("Seleccione...")) {
            Empleado emp = sistema.getGestionEmpleados().getEmpleados()[indexMed];
            if (emp instanceof Medico) {
                nuevo.setMedicoAsignado((Medico) emp);
            }
        }

        boolean ok = sistema.getGestionConsultorios().modificar(codigo, nuevo);

        if (ok) {
            JOptionPane.showMessageDialog(this, "Consultorio modificado correctamente.");
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un consultorio con ese código.");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void onceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onceActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        String codigo = INGRESARTEXTOCODIGO.getText().trim();

        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el código a eliminar.");
            return;
        }

        boolean ok = sistema.getGestionConsultorios().eliminar(codigo);

        if (ok) {
            JOptionPane.showMessageDialog(this, "Consultorio eliminado correctamente.");
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un consultorio con ese código.");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void doceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doceActionPerformed

    private void unaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unaActionPerformed

    private void INGRESARTEXTOCODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARTEXTOCODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INGRESARTEXTOCODIGOActionPerformed

    private void comboMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMedicosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> Disponibilidad;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField INGRESARTEXTOCODIGO;
    private javax.swing.JButton Modificar;
    private javax.swing.JToggleButton Volverbt;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> comboMedicos;
    private javax.swing.JCheckBox diez;
    private javax.swing.JCheckBox doce;
    private javax.swing.JCheckBox dos;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField especialidadINGRESARTEXTO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox once;
    private javax.swing.JTable tablaConsultorios;
    private javax.swing.JCheckBox una;
    // End of variables declaration//GEN-END:variables
}
