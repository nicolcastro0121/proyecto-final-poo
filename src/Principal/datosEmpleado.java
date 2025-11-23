
package Principal;

import Clinica.Empleado;
import Clinica.Medico;
import Clinica.Usuario;


public class datosEmpleado extends javax.swing.JFrame {
    private Gestor_Empleados gestor; 
    private Integer indiceModificar = null;

    /**
     * Creates new form datosEmpleado
     */
    public datosEmpleado(Gestor_Empleados gestor, Empleado emp, Integer indice) {
        initComponents();
        this.gestor = gestor;
        this.indiceModificar = indice;

        if (emp != null) { 
            dni.setText(emp.getDni()); 
            nombre.setText(emp.getNombres()); 
            apellido.setText(emp.getApellidos()); 
            telefono.setText(emp.getTelf()); 
            email.setText(emp.getEmail()); 
            ComboBoxROL.setSelectedItem(emp.getRol());
            if (emp instanceof Medico) { 
                ComboBoxEspecialidades.setEnabled(true); 
                ComboBoxEspecialidades.setSelectedItem(((Medico) emp).getEspecialidad());
            }else{
                ComboBoxEspecialidades.setEnabled(false);
            }
        }else{
            dni.setText(""); 
            nombre.setText(""); 
            apellido.setText(""); 
            telefono.setText(""); 
            email.setText(""); 
            ComboBoxROL.setSelectedIndex(0); 
            ComboBoxEspecialidades.setEnabled(false);
                    
            }
    }
    
    public datosEmpleado(Gestor_Empleados gestor) { 
        this(gestor, null, null); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
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

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
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

        jLabel5.setText("Rol:");

        ComboBoxROL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepcionista", "Médico", "Enfermero", "Cajero", "Administrador" }));
        ComboBoxROL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxROLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Aceptar)
                        .addGap(43, 43, 43)
                        .addComponent(Cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addComponent(Cancelar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        String pDni = dni.getText();
        String pNombre = nombre.getText();
        String pApellido = apellido.getText();
        String pTelefono = telefono.getText();
        String pEmail = email.getText();
        String rol = ComboBoxROL.getSelectedItem().toString();

        Empleado nuevo;

        if (rol.equals("Médico")) {
            String especialidad = ComboBoxEspecialidades.getSelectedItem().toString();
            nuevo = new Medico(especialidad, pDni, pNombre, pApellido, pTelefono, pEmail,
                               "usuario", "password", rol);
        } else {
            nuevo = new Empleado(pDni, pNombre, pApellido, pTelefono, pEmail,
                                 "usuario", "password", rol);
        }
        
        if (indiceModificar != null) {
            Gestor_Empleados.listaEmpleados.set(indiceModificar, nuevo);
        } else {
            Gestor_Empleados.listaEmpleados.add(nuevo);
        }
        
        
        gestor.actualizarTabla();
        this.dispose();
        gestor.setVisible(true);
           
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        gestor.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

    private void ComboBoxROLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxROLActionPerformed
        // TODO add your handling code here:
        if(this.ComboBoxROL.getSelectedItem().toString().equals("Médico")){
            this.jLabel6.setEnabled(true);
            this.ComboBoxEspecialidades.setEnabled(true);
        }else{
            this.jLabel6.setEnabled(false);
            this.ComboBoxEspecialidades.setEnabled(false);
        }
    }//GEN-LAST:event_ComboBoxROLActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(datosEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datosEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datosEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datosEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Usuario temp = new Usuario("demo", "demo", "Administrador");
                new Gestor_Empleados(temp).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> ComboBoxEspecialidades;
    private javax.swing.JComboBox<String> ComboBoxROL;
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
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
