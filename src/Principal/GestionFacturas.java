/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Principal;
import GestionClinica.GestionFactura;
import Clinica.Factura;
import Clinica.Paciente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionFacturas extends javax.swing.JPanel {
    private Sistema sistema;
    private int indiceSeleccionado = -1;
    public GestionFacturas(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        cargarTabla();
        cargarCombos();
    }
    private void cargarCombos() {
    ComboPaciente.removeAllItems();
    if (sistema == null || sistema.getGestionPacientes() == null) return;

    Paciente[] pacientes = sistema.getGestionPacientes().getPacientes();
    int total = sistema.getGestionPacientes().getCantidad();

    for (int i = 0; i < total; i++) {
        Paciente p = pacientes[i];
        if (p != null) {
            ComboPaciente.addItem(p.getNombres() + " - " + p.getDni());
        }
    }
}
    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaFactura.getModel();
        modelo.setRowCount(0);

        Factura [] lista = sistema.getGestionFacturas().getFacturas();
        int total = sistema.getGestionFacturas().getCantidad();
        
        for (int i = 0; i < total; i++) {
        Factura f = lista[i];
        if (f == null) continue;

        String pacienteTexto = f.getPaciente() != null
            ? f.getPaciente().getNombres() + " - " + f.getPaciente().getDni()
            : "Sin paciente";

        modelo.addRow(new Object[]{
            f.getNumero(),
            f.getDescripcion(),
            f.getMonto(),
            pacienteTexto
        });
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboPaciente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();

        jLabel3.setText("Monto:");

        jLabel4.setText("Paciente:");

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

        jLabel1.setText("Numero:");

        jLabel2.setText("Descripcion:");

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

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addGap(68, 68, 68)
                        .addComponent(Eliminar))
                    .addComponent(jLabel4)
                    .addComponent(ComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(monto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addComponent(descripcion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numero, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Volver)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(Eliminar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Volver)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        if (sistema == null) {
        JOptionPane.showMessageDialog(this, "Error");
        return;
    }
        if (numero.getText().trim().isEmpty() ||
        descripcion.getText().trim().isEmpty() ||
        monto.getText().trim().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        return;
    }
        
        int pnumero;
        double pmonto;
        try {
        pnumero = Integer.parseInt(numero.getText().trim());
        pmonto = Double.parseDouble(monto.getText().trim());
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Número o monto inválido.");
        return;
    }
        String seleccionadoPaciente = (String) ComboPaciente.getSelectedItem();
            if (seleccionadoPaciente == null) {
                 JOptionPane.showMessageDialog(this, "Seleccione un paciente.");
                return;
    }
        Paciente paciente = null;
        for (Paciente p : sistema.getGestionPacientes().getPacientes()) {
            if (p != null &&
             (p.getNombres() + " - " + p.getDni()).equals(seleccionadoPaciente)) {
                paciente = p;
                break;
        }
    }
        
        String pdescripcion = descripcion.getText().trim();
        Factura nueva = new Factura(pnumero, pdescripcion, pmonto, paciente);
        
        boolean ok = sistema.getGestionFacturas().crearFactura(nueva);

        if (ok) {
            
            actualizarTabla();
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Factura agregada correctamente.");
             } else {
            JOptionPane.showMessageDialog(this, "No hay espacio para más Facturas.");
}
    }//GEN-LAST:event_AgregarActionPerformed
    
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int filaSeleccionada = tablaFactura.getSelectedRow();
        
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un factura de la tabla para eliminar.");
            return;
        }
        int confirmacion = JOptionPane.showConfirmDialog(
            this, 
            "¿Está seguro de que desea eliminar" +  "?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION
        );
        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean ok = sistema.getGestionFacturas().eliminarFactura(filaSeleccionada);

            if (ok) {
                JOptionPane.showMessageDialog(this, "Factura eliminado correctamente.");
                
                cargarTabla();
                limpiarCampos();
                indiceSeleccionado = -1; 
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el Factura.");
            }
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
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
            if (f == null) continue;

        String pacienteTxt = (f.getPaciente() != null)
                ? f.getPaciente().getNombres() + " - " + f.getPaciente().getDni()
                : "Sin paciente";

        model.addRow(new Object[]{
            f.getNumero(),
            f.getDescripcion(),
            f.getMonto(),
            pacienteTxt
        });
    }
}
    private void limpiarCampos() {
        numero.setText("");
        descripcion.setText("");
        monto.setText("");
        ComboPaciente.setSelectedIndex(-1);
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
