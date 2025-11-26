package Principal;

import Clinica.Consultorio;
import Clinica.Empleado;
import Clinica.Medico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GESTIONCONSULTORIOSPANEL extends javax.swing.JPanel {
    private Sistema sistema;
    private int indiceSeleccionado = -1;

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

        for (int i = 0; i < sistema.getGestionConsultorios().getCantidad(); i++) {
            Consultorio c = lista[i];
            if (c == null) continue;

            String medicoNombre = "Sin asignar";

            if (c.getMedicoAsignado() != null) {
                medicoNombre = c.getMedicoAsignado().getNombres() + " " + c.getMedicoAsignado().getApellidos();
            }

            model.addRow(new Object[]{
                c.getCodigo(),
                c.getEspecialidad(),
                c.getEstado(),
                "Horarios disponibles", 
                medicoNombre
            });
        }
    }

    private void cargarComboMedicos() {
        comboMedicos.removeAllItems();
        comboMedicos.addItem("Seleccione..."); // Item por defecto
        
        Empleado[] lista = sistema.getGestionEmpleados().getEmpleados();

        for (int i = 0; i < sistema.getGestionEmpleados().getCantidad(); i++) {
            Empleado emp = lista[i];

            if (emp instanceof Medico) {
                Medico m = (Medico) emp;
                comboMedicos.addItem(m.getNombres() + " " + m.getApellidos());
            }
        }
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dos = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        especialidadINGRESARTEXTO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GuardarCambios = new javax.swing.JButton();
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

        especialidadINGRESARTEXTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadINGRESARTEXTOActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel4.setText("Horarios:");

        GuardarCambios.setText("Guardar Cambios");
        GuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCambiosActionPerformed(evt);
            }
        });

        comboMedicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selccione..." }));
        comboMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicosActionPerformed(evt);
            }
        });

        Volverbt.setText("Volver");
        Volverbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverbtActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("CONSULTORIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Eliminar)
                        .addGap(124, 124, 124)))
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GuardarCambios)
                                .addComponent(Volverbt))
                            .addComponent(doce)))
                    .addComponent(Agregar))
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(538, 538, 538))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Eliminar)
                            .addComponent(Modificar))
                        .addGap(555, 555, 555))
                    .addGroup(layout.createSequentialGroup()
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
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Agregar)
                                    .addComponent(GuardarCambios))))
                        .addGap(18, 18, 18)
                        .addComponent(Volverbt)
                        .addGap(546, 546, 546))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosActionPerformed

    private void especialidadINGRESARTEXTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadINGRESARTEXTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadINGRESARTEXTOActionPerformed

    private void GuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCambiosActionPerformed
        if (indiceSeleccionado == -1) {
            JOptionPane.showMessageDialog(this, "Primero seleccione un consultorio para modificar usando el botón 'Modificar'.");
            return;
        }

        String codigo = INGRESARTEXTOCODIGO.getText().trim();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El código no puede estar vacío.");
            return;
        }

        String especialidad = especialidadINGRESARTEXTO.getText().trim();
        if (especialidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una especialidad.");
            return;
        }

        String estado = Disponibilidad.getSelectedItem().toString();

        // Obtener médico seleccionado
        Medico medicoSeleccionado = null;
        int indexMed = comboMedicos.getSelectedIndex();
        if (indexMed > 0) { // Mayor que 0 porque el índice 0 es "Seleccione..."
            Empleado[] empleados = sistema.getGestionEmpleados().getEmpleados();
            int contadorMedicos = 0;

            for (int i = 0; i < sistema.getGestionEmpleados().getCantidad(); i++) {
                if (empleados[i] instanceof Medico) {
                    contadorMedicos++;
                    if (contadorMedicos == indexMed) { // Ajustar por el item "Seleccione..."
                        medicoSeleccionado = (Medico) empleados[i];
                        break;
                    }
                }
            }
        }

        Consultorio consultorioActualizado = new Consultorio(codigo, especialidad, estado);
        consultorioActualizado.setMedicoAsignado(medicoSeleccionado);

        boolean exito = sistema.getGestionConsultorios().modificar(codigo, consultorioActualizado);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Consultorio modificado correctamente.");
            cargarTabla();
            limpiarCampos();
            indiceSeleccionado = -1; // Resetear después de guardar
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar el consultorio.");
        }
    }//GEN-LAST:event_GuardarCambiosActionPerformed

    private void DisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisponibilidadActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String codigo = INGRESARTEXTOCODIGO.getText().trim();

        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un código.");
            return;
        }

        String especialidad = especialidadINGRESARTEXTO.getText().trim();

        if (especialidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una especialidad.");
            return;
        }

        String estado = Disponibilidad.getSelectedItem().toString();

        Consultorio nuevo = new Consultorio(codigo, especialidad, estado);

        boolean ok = sistema.getGestionConsultorios().agregar(nuevo);

        if (ok) {
            cargarTabla();
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Consultorio agregado.");
        } else {
            JOptionPane.showMessageDialog(this, "No hay espacio para más consultorios.");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void diezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diezActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
         int filaSeleccionada = tablaConsultorios.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione un consultorio de la tabla para modificar.");
                return;
            }

            // Obtener código del consultorio seleccionado
            Object codigoObj = tablaConsultorios.getValueAt(filaSeleccionada, 0);
            if (codigoObj == null) {
                JOptionPane.showMessageDialog(this, "Error: No se pudo obtener el código del consultorio.");
                return;
            }

            String codigo = codigoObj.toString();

            // Buscar el consultorio en el sistema
            Consultorio consultorioSeleccionado = null;
            Consultorio[] consultorios = sistema.getGestionConsultorios().getConsultorios();
            for (int i = 0; i < sistema.getGestionConsultorios().getCantidad(); i++) {
                if (consultorios[i] != null && consultorios[i].getCodigo().equals(codigo)) {
                    consultorioSeleccionado = consultorios[i];
                    indiceSeleccionado = i; // Guardar el índice para referencia
                    break;
                }
            }

            if (consultorioSeleccionado == null) {
                JOptionPane.showMessageDialog(this, "Consultorio no encontrado.");
                return;
            }

            // Cargar datos en el formulario
            INGRESARTEXTOCODIGO.setText(consultorioSeleccionado.getCodigo());
            especialidadINGRESARTEXTO.setText(consultorioSeleccionado.getEspecialidad());
            Disponibilidad.setSelectedItem(consultorioSeleccionado.getEstado());

            // Cargar médico asignado si existe
            if (consultorioSeleccionado.getMedicoAsignado() != null) {
                String nombreMedico = consultorioSeleccionado.getMedicoAsignado().getNombres() + " " + 
                                     consultorioSeleccionado.getMedicoAsignado().getApellidos();

                // Buscar el índice en el comboBox
                for (int i = 0; i < comboMedicos.getItemCount(); i++) {
                    if (comboMedicos.getItemAt(i).equals(nombreMedico)) {
                        comboMedicos.setSelectedIndex(i);
                        break;
                    }
                }
            } else {
                comboMedicos.setSelectedIndex(0); // "Seleccione..."
            }

            JOptionPane.showMessageDialog(this, "Modifique los datos y haga clic en 'Guardar Cambios'");
    }//GEN-LAST:event_ModificarActionPerformed

    private void onceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onceActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int filaSeleccionada = tablaConsultorios.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un consultorio de la tabla para eliminar.");
            return;
        }
        Object codigoObj = tablaConsultorios.getValueAt(filaSeleccionada, 0);
        if (codigoObj == null) {
            JOptionPane.showMessageDialog(this, "Error: No se pudo obtener el código del consultorio.");
            return;
        }
        String codigo = codigoObj.toString();

        int confirmacion = JOptionPane.showConfirmDialog(
            this, 
            "¿Está seguro de que desea eliminar el consultorio con código: " + codigo + "?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean ok = sistema.getGestionConsultorios().eliminar(codigo);

            if (ok) {
                JOptionPane.showMessageDialog(this, "Consultorio eliminado correctamente.");
                cargarTabla();
                limpiarCampos();
                indiceSeleccionado = -1; 
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el consultorio.");
            }
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

    private void VolverbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverbtActionPerformed
        MenudeOpciones menu = new MenudeOpciones(this.sistema.getUsuarioActual(), this.sistema);
        menu.setVisible(true);
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_VolverbtActionPerformed

    private void limpiarCampos() {
        INGRESARTEXTOCODIGO.setText("");
        especialidadINGRESARTEXTO.setText("");
        Disponibilidad.setSelectedIndex(0);
        comboMedicos.setSelectedIndex(0);

        diez.setSelected(false);
        once.setSelected(false);
        doce.setSelected(false);
        una.setSelected(false);
        dos.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> Disponibilidad;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton GuardarCambios;
    private javax.swing.JTextField INGRESARTEXTOCODIGO;
    private javax.swing.JButton Modificar;
    private javax.swing.JToggleButton Volverbt;
    private javax.swing.JComboBox<String> comboMedicos;
    private javax.swing.JCheckBox diez;
    private javax.swing.JCheckBox doce;
    private javax.swing.JCheckBox dos;
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
