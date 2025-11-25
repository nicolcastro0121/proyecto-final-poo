package Principal;

import Clinica.Empleado;
import Clinica.Medico;
import javax.swing.table.DefaultTableModel;

public class GESTIONEMPLEADOSPANEL extends javax.swing.JPanel {

    private Sistema sistema;
    private int indiceSeleccionado = -1;

    public GESTIONEMPLEADOSPANEL(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxEspecialidades = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxROL = new javax.swing.JComboBox<>();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EliminarIngresaDNI = new javax.swing.JTextField();
        ModificarIngresarDni = new javax.swing.JTextField();
        GuardarCambiosbt = new javax.swing.JButton();
        Volverbt = new javax.swing.JToggleButton();

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Email:");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("Dni:");

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });

        jLabel8.setText("Especialidad");

        ComboBoxEspecialidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicina general", "Pediatría", "Ginecología y obstetricia", "Cardiología", "Dermatología", "Traumatología y ortopedia" }));
        ComboBoxEspecialidades.setEnabled(false);
        ComboBoxEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEspecialidadesActionPerformed(evt);
            }
        });

        jLabel5.setText("Rol:");

        ComboBoxROL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepcionista", "Médico", "Enfermero", "Cajero", "Administrador" }));
        ComboBoxROL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxROLActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Rol", "Especialidad", "Telefono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        EliminarIngresaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarIngresaDNIActionPerformed(evt);
            }
        });

        ModificarIngresarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarIngresarDniActionPerformed(evt);
            }
        });

        GuardarCambiosbt.setText("Guardar Cambios");
        GuardarCambiosbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCambiosbtActionPerformed(evt);
            }
        });

        Volverbt.setText("Volver");
        Volverbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModificarIngresarDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EliminarIngresaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Aceptar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GuardarCambiosbt))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboBoxEspecialidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email)
                                .addComponent(telefono)
                                .addComponent(apellido)
                                .addComponent(nombre)
                                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Volverbt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Aceptar)
                            .addComponent(GuardarCambiosbt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Eliminar)
                            .addComponent(EliminarIngresaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modificar)
                            .addComponent(ModificarIngresarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Volverbt))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        String dniText = dni.getText();
        String nombreText = nombre.getText();
        String apellidoText = apellido.getText();
        String rolText = ComboBoxROL.getSelectedItem().toString();
        String telefonoText = telefono.getText();
        String emailText = email.getText();

        Empleado nuevoEmpleado;

        if (rolText.equals("Médico")) {
            String especialidadText = ComboBoxEspecialidades.getSelectedItem().toString();
            nuevoEmpleado = new Medico(
                    especialidadText,
                    dniText,
                    nombreText,
                    apellidoText,
                    telefonoText,
                    emailText,
                    dniText,
                    "123",
                    rolText
            );
        } else {
            nuevoEmpleado = new Empleado(
                    dniText,
                    nombreText,
                    apellidoText,
                    telefonoText,
                    emailText,
                    dniText,
                    "123",
                    rolText
            );
        }

        sistema.getGestionEmpleados().crearEmpleado(nuevoEmpleado);
        actualizarTabla();
        limpiarCampos();

        javax.swing.JOptionPane.showMessageDialog(this, "Empleado agregado correctamente.");

    }//GEN-LAST:event_AceptarActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void ComboBoxROLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxROLActionPerformed

        String rolSeleccionado = ComboBoxROL.getSelectedItem().toString();

        if (rolSeleccionado.equals("Médico")) {

            ComboBoxEspecialidades.setEnabled(true);
        } else {

            ComboBoxEspecialidades.setEnabled(false);
            ComboBoxEspecialidades.setSelectedIndex(0);
        }
    }//GEN-LAST:event_ComboBoxROLActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        String dniBusqueda = ModificarIngresarDni.getText();
        if (dniBusqueda.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese un DNI para modificar.");
            return;
        }

        Empleado emp = null;
        Empleado[] lista = sistema.getGestionEmpleados().getEmpleados();
        for (int i = 0; i < sistema.getGestionEmpleados().getCantidad(); i++) {
            if (lista[i].getDni().equals(dniBusqueda)) {
                emp = lista[i];
                indiceSeleccionado = i;
                break;
            }
        }

        if (emp == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            return;
        }

        dni.setText(emp.getDni());
        nombre.setText(emp.getNombres());
        apellido.setText(emp.getApellidos());
        telefono.setText(emp.getTelf());
        email.setText(emp.getEmail());
        ComboBoxROL.setSelectedItem(emp.getRol());
        if (emp.getRol().equals("Médico")) {
            ComboBoxEspecialidades.setEnabled(true);
            ComboBoxEspecialidades.setSelectedItem(emp.getEspecialidad());
        } else {
            ComboBoxEspecialidades.setEnabled(false);
            ComboBoxEspecialidades.setSelectedIndex(0);
        }

    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

    }//GEN-LAST:event_EliminarActionPerformed

    private void EliminarIngresaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarIngresaDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarIngresaDNIActionPerformed

    private void ModificarIngresarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarIngresarDniActionPerformed
        if (indiceSeleccionado == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay empleado seleccionado para modificar.");
            return;
        }

        String dniEmpleado = dni.getText();
        String nombresEmpleado = nombre.getText();
        String apellidosEmpleado = apellido.getText();
        String telefonoEmpleado = telefono.getText();
        String emailEmpleado = email.getText();
        String rolEmpleado = ComboBoxROL.getSelectedItem().toString();
        String especialidadEmpleado = "";

        if (rolEmpleado.equals("Médico")) {
            especialidadEmpleado = ComboBoxEspecialidades.getSelectedItem().toString();
        }

        Empleado nuevoEmpleado;
        if (rolEmpleado.equals("Médico")) {
            nuevoEmpleado = new Medico(
                    especialidadEmpleado,
                    dniEmpleado,
                    nombresEmpleado,
                    apellidosEmpleado,
                    telefonoEmpleado,
                    emailEmpleado,
                    "",
                    "",
                    rolEmpleado
            );
        } else {
            nuevoEmpleado = new Empleado(
                    dniEmpleado,
                    nombresEmpleado,
                    apellidosEmpleado,
                    telefonoEmpleado,
                    emailEmpleado,
                    "",
                    "",
                    rolEmpleado
            );
        }

        boolean exito = sistema.getGestionEmpleados().modificar(dniEmpleado, nuevoEmpleado);

        if (exito) {
            javax.swing.JOptionPane.showMessageDialog(this, "Empleado modificado correctamente.");
            actualizarTabla();
            limpiarCampos();
            indiceSeleccionado = -1;
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al modificar el empleado.");
        }
    }//GEN-LAST:event_ModificarIngresarDniActionPerformed

    private void GuardarCambiosbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCambiosbtActionPerformed
        if (indiceSeleccionado == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay empleado seleccionado para modificar.");
            return;
        }

        Empleado empActual = sistema.getGestionEmpleados().getEmpleados()[indiceSeleccionado];

        String rolText = ComboBoxROL.getSelectedItem().toString();
        Empleado nuevoEmpleado;

        if (rolText.equals("Médico")) {
            String especialidadText = ComboBoxEspecialidades.getSelectedItem().toString();
            nuevoEmpleado = new Medico(
                    especialidadText,
                    dni.getText(),
                    nombre.getText(),
                    apellido.getText(),
                    telefono.getText(),
                    email.getText(),
                    empActual.getUserName(),
                    empActual.getPassword(),
                    rolText
            );
        } else {
            nuevoEmpleado = new Empleado(
                    dni.getText(),
                    nombre.getText(),
                    apellido.getText(),
                    telefono.getText(),
                    email.getText(),
                    empActual.getUserName(),
                    empActual.getPassword(),
                    rolText
            );
        }

        boolean exito = sistema.getGestionEmpleados().modificar(empActual.getDni(), nuevoEmpleado);

        if (exito) {
            actualizarTabla();
            limpiarCampos();
            indiceSeleccionado = -1;
            javax.swing.JOptionPane.showMessageDialog(this, "Empleado modificado correctamente.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al modificar empleado.");
        }
    }//GEN-LAST:event_GuardarCambiosbtActionPerformed

    private void ComboBoxEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxEspecialidadesActionPerformed

    private void VolverbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverbtActionPerformed
        MenudeOpciones menu = new MenudeOpciones(sistema.getUsuarioActual(), sistema);
        menu.setSize(800, 600);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        // Cerrar la ventana actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_VolverbtActionPerformed
    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Empleado[] lista = sistema.getGestionEmpleados().getEmpleados();
        int cantidad = sistema.getGestionEmpleados().getCantidad();
        for (int i = 0; i < cantidad; i++) {
            model.addRow(new Object[]{
                lista[i].getDni(),
                lista[i].getNombres(),
                lista[i].getApellidos(),
                lista[i].getRol(),
                lista[i].getRol().equals("Médico") ? lista[i].getEspecialidad() : "",
                lista[i].getTelf(),
                lista[i].getEmail()
            });
        }
    }

    private void limpiarCampos() {
        dni.setText("");
        nombre.setText("");
        apellido.setText("");
        telefono.setText("");
        email.setText("");
        ComboBoxROL.setSelectedIndex(0);
        ComboBoxEspecialidades.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JComboBox<String> ComboBoxEspecialidades;
    private javax.swing.JComboBox<String> ComboBoxROL;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField EliminarIngresaDNI;
    private javax.swing.JButton GuardarCambiosbt;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField ModificarIngresarDni;
    private javax.swing.JToggleButton Volverbt;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
