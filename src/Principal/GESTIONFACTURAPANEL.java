/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Principal;

import Clinica.Factura;
import Clinica.Paciente;
import GestionClinica.GestionFactura;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GESTIONFACTURAPANEL extends javax.swing.JPanel {

    private Sistema sistema;
    private int indiceSeleccionado = -1;
    
    public GESTIONFACTURAPANEL() {
        initComponents();
    }
    private void cargarComboPacientes() {
    ComboPaciente.removeAllItems();
    ComboPaciente.addItem("Seleccione...");

    Paciente[] lista = sistema.getGestionPacientes().getPacientes();

    for (int i = 0; i < sistema.getGestionPacientes().getCantidad(); i++) {
        Paciente p = lista[i];

        if (p != null) {
            ComboPaciente.addItem(p.getNombres() + " " + p.getApellidos());
        }
    }
}
    private Paciente obtenerPacienteDelCombo() {
    int indexPac = ComboPaciente.getSelectedIndex();
    if (indexPac <= 0) { 
        return null;
    }

    Paciente[] pacientes = sistema.getGestionPacientes().getPacientes();
    int contadorPac = 0;

    for (int i = 0; i < sistema.getGestionPacientes().getCantidad(); i++) {
        if (pacientes[i] != null) {
            contadorPac++;
            if (contadorPac == indexPac) {
                return pacientes[i];
            }
        }
    }
    return null;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboPaciente = new javax.swing.JComboBox<>();

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("FACTURA");

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Descripcion", "Monto", "Paciente"
            }
        ));
        jScrollPane1.setViewportView(tablaFactura);
        if (tablaFactura.getColumnModel().getColumnCount() > 0) {
            tablaFactura.getColumnModel().getColumn(1).setResizable(false);
            tablaFactura.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Numero:");

        jLabel2.setText("Descripcion:");

        numero.setText("jTextField1");

        descripcion.setText("jTextField2");

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Monto:");

        jLabel4.setText("Paciente:");

        ComboPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addGap(68, 68, 68)
                        .addComponent(Eliminar))
                    .addComponent(jLabel4)
                    .addComponent(ComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Volver)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(ComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar)
                            .addComponent(Eliminar)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tablaFactura.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una Factura para eliminar.");
            return;
        }

        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar esta Factura?");
        
        if (opcion == JOptionPane.YES_OPTION) {
            sistema.getGestionConsultas().eliminar(filaSeleccionada);
            JOptionPane.showMessageDialog(this, "Factura eliminada correctamente");
            actualizarTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
            int pnumero = numero.getText().isEmpty() ? 0 : Integer.parseInt(numero.getText());
            String pdescripcion = descripcion.getText();
            double pmonto = monto.getText().isEmpty() ? 0.0 : Double.parseDouble(monto.getText());
            
            Paciente paciente = (Paciente) ComboPaciente.getSelectedItem();

            Factura nuevaFactura = new Factura(
                pnumero,
                pdescripcion,
                pmonto,
                paciente);

           
            boolean ok = sistema.getGestionFacturas().crearFactura(nuevaFactura);
            JOptionPane.showMessageDialog(this, "Factura agregada correctamente");

        if (ok) {
            actualizarTabla();
            JOptionPane.showMessageDialog(this, "Cita agregada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No hay espacio para más citas.");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        MenudeOpciones menu = new MenudeOpciones(this.sistema.getUsuarioActual(), this.sistema);
        menu.setVisible(true);
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_VolverActionPerformed
private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaFactura.getModel();
        model.setRowCount(0);
        
        GestionFactura gestor = sistema.getGestionFacturas();
        
        for (int i = 0; i < gestor.getCantidad(); i++) {
            Factura f = gestor.getFacturas()[i];
            model.addRow(new Object[]{
                f.getNumero(),
                f.getDescripcion(),
                f.getMonto(),
                f.getPaciente()
            });
        }
    }
    
    private void limpiarCampos() {
    numero.setText("");
    descripcion.setText("");
    monto.setText("");
    ComboPaciente.setSelectedIndex(0); 

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> ComboPaciente;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField numero;
    private javax.swing.JTable tablaFactura;
    // End of variables declaration//GEN-END:variables
}
