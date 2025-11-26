
package Principal;

import Clinica.Consulta;
import GestionClinica.GestionConsulta;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GESTIONCONSULTAPANEL extends javax.swing.JPanel {
    private Sistema sistema;
    private int indiceSeleccionado = -1;
    
    public GESTIONCONSULTAPANEL(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        actualizarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aceptar = new javax.swing.JButton();
        GuardarCambios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        antecedentes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        signos_vitales = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        examenes_fisicos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        diagnosticos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cant_operaciones = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        plan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Motivo = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Volverbt = new javax.swing.JToggleButton();

        aceptar.setText("aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        GuardarCambios.setText("Guardar Cambios");
        GuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCambiosActionPerformed(evt);
            }
        });

        jLabel1.setText("Motivo:");

        jLabel2.setText("Precio:");

        jLabel3.setText("Estado:");

        jLabel4.setText("Antecedentes:");

        jLabel5.setText("Signos Vitales:");

        jLabel6.setText("Examenes Fisicos:");

        jLabel7.setText("Diagnosticos:");

        jLabel8.setText("Cantidad de Operaciones:");

        jLabel9.setText("Plan Médico:");

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

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Motivo", "Precio", "Estado", "Antecedentes", "Signos Vitales", "Ex. Fisicos", "Diagnostico", "Cant Operaciones", "Plan Médico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(7).setResizable(false);
            tabla.getColumnModel().getColumn(8).setResizable(false);
        }

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(Modificar)
                        .addGap(231, 231, 231)
                        .addComponent(Eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(Volverbt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(46, 46, 46))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(63, 63, 63))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(aceptar)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9)))
                                            .addGap(2, 2, 2))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(estado, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Precio, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Motivo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(antecedentes, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                            .addComponent(plan)
                                            .addComponent(cant_operaciones)
                                            .addComponent(diagnosticos)
                                            .addComponent(examenes_fisicos)
                                            .addComponent(signos_vitales)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(GuardarCambios)))))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(antecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signos_vitales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(examenes_fisicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(diagnosticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cant_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aceptar)
                            .addComponent(GuardarCambios)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(Modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Volverbt)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        if (Motivo.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "El motivo es obligatorio");
        return;
        }

        try {
            String pMotivo = Motivo.getText();
            double pPrecio = Precio.getText().isEmpty() ? 0.0 : Double.parseDouble(Precio.getText());
            String pEstado = estado.getText();
            String pAntecedentes = antecedentes.getText();
            String pSignosVitales = signos_vitales.getText();
            String pExamenesFisicos = examenes_fisicos.getText();
            String pDiagnosticos = diagnosticos.getText();
            int pCantidadOrdenes = cant_operaciones.getText().isEmpty() ? 0 : Integer.parseInt(cant_operaciones.getText());
            String pPlan = plan.getText();

            Consulta nuevaConsulta = new Consulta(
                pMotivo, pPrecio, pEstado, pAntecedentes, pSignosVitales,
                pExamenesFisicos, pDiagnosticos, null, new Clinica.Orden[10], 
                pCantidadOrdenes, pPlan, null
            );

           
            sistema.getGestionConsultas().agregar(nuevaConsulta);
            JOptionPane.showMessageDialog(this, "Consulta agregada correctamente");

            actualizarTabla();
            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Precio y Cantidad deben ser números válidos");
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona una consulta de la tabla para modificar");
            return;
        }
        
        Consulta consultaSeleccionada = sistema.getGestionConsultas().buscar(fila);
        
        if (consultaSeleccionada != null) {

            Motivo.setText(consultaSeleccionada.getMotivo());
            Precio.setText(String.valueOf(consultaSeleccionada.getPrecio()));
            estado.setText(consultaSeleccionada.getEstado());
            antecedentes.setText(consultaSeleccionada.getAntecedentes());
            signos_vitales.setText(consultaSeleccionada.getSignosVitales());
            examenes_fisicos.setText(consultaSeleccionada.getExamenesFisicos());
            diagnosticos.setText(consultaSeleccionada.getDiagnosticos());
            cant_operaciones.setText(String.valueOf(consultaSeleccionada.getCantidadOrdenes()));
            plan.setText(consultaSeleccionada.getPlan());
            
            indiceSeleccionado = fila;
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una consulta para eliminar.");
            return;
        }

        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar esta consulta?");
        
        if (opcion == JOptionPane.YES_OPTION) {
            sistema.getGestionConsultas().eliminar(filaSeleccionada);
            JOptionPane.showMessageDialog(this, "Consulta eliminada correctamente");
            actualizarTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void VolverbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverbtActionPerformed
        MenudeOpciones menu = new MenudeOpciones(this.sistema.getUsuarioActual(), this.sistema);
        menu.setVisible(true);
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_VolverbtActionPerformed

    private void GuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCambiosActionPerformed
         if (indiceSeleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No hay consulta seleccionada para modificar.");
            return;
        }

        // Validar campos obligatorios
        if (Motivo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El motivo es obligatorio");
            return;
        }

        try {
            // Obtener datos de los campos
            String pMotivo = Motivo.getText();
            double pPrecio = Precio.getText().isEmpty() ? 0.0 : Double.parseDouble(Precio.getText());
            String pEstado = estado.getText();
            String pAntecedentes = antecedentes.getText();
            String pSignosVitales = signos_vitales.getText();
            String pExamenesFisicos = examenes_fisicos.getText();
            String pDiagnosticos = diagnosticos.getText();
            int pCantidadOrdenes = cant_operaciones.getText().isEmpty() ? 0 : Integer.parseInt(cant_operaciones.getText());
            String pPlan = plan.getText();

            // Obtener la consulta actual para mantener datos que no se modifican
            Consulta consultaActual = sistema.getGestionConsultas().buscar(indiceSeleccionado);

            // Crear nueva consulta con los datos actualizados
            Consulta consultaActualizada = new Consulta(
                pMotivo, pPrecio, pEstado, pAntecedentes, pSignosVitales,
                pExamenesFisicos, pDiagnosticos, 
                consultaActual.getReceta(), // Mantener la receta existente
                consultaActual.getOrdenes(), // Mantener las órdenes existentes
                pCantidadOrdenes, pPlan, 
                consultaActual.getCita() // Mantener la cita existente
            );

            // Modificar la consulta en el sistema
            boolean exito = sistema.getGestionConsultas().modificar(indiceSeleccionado, consultaActualizada);

            if (exito) {
                actualizarTabla();
                limpiarCampos();
                indiceSeleccionado = -1;
                JOptionPane.showMessageDialog(this, "Consulta modificada correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar la consulta.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Precio y Cantidad deben ser números válidos");
        }
    }//GEN-LAST:event_GuardarCambiosActionPerformed

    
    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        
        GestionConsulta gestor = sistema.getGestionConsultas();
        
        for (int i = 0; i < gestor.getCantidad(); i++) {
            Consulta c = gestor.getConsultas()[i];
            model.addRow(new Object[]{
                c.getMotivo(),
                c.getPrecio(),
                c.getEstado(),
                c.getAntecedentes(),
                c.getSignosVitales(),
                c.getExamenesFisicos(),
                c.getDiagnosticos(),
                c.getCantidadOrdenes(),
                c.getPlan()
            });
        }
    }
    
    private void limpiarCampos() {
        Motivo.setText("");
        Precio.setText("");
        estado.setText("");
        antecedentes.setText("");
        signos_vitales.setText("");
        examenes_fisicos.setText("");
        diagnosticos.setText("");
        cant_operaciones.setText("0");
        plan.setText("");
        indiceSeleccionado = -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton GuardarCambios;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Motivo;
    private javax.swing.JTextField Precio;
    private javax.swing.JToggleButton Volverbt;
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField antecedentes;
    private javax.swing.JTextField cant_operaciones;
    private javax.swing.JTextField diagnosticos;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField examenes_fisicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField plan;
    private javax.swing.JTextField signos_vitales;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
