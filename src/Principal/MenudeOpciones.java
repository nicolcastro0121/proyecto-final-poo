package Principal;

import Clinica.Empleado;
import Clinica.Usuario;
import Principal.GESTIONCONSULTORIOSPANEL;

public class MenudeOpciones extends javax.swing.JFrame {

    private Clinica.Usuario usuarioActual;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenudeOpciones.class.getName());
    private Sistema sistema;

    public MenudeOpciones(Usuario user, Sistema sistema) {
        initComponents();
        deshabilitarTodo();

        this.usuarioActual = user;
        this.sistema = sistema;

        cargarDatosUsuario();
        aplicarRol(user);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    private void cargarDatosUsuario() {
        if (usuarioActual != null) {
            // Verifica si es un Empleado
            if (usuarioActual instanceof Empleado empleado) {
                nombre.setText(empleado.getNombres());
                apellido.setText(empleado.getApellidos());
                dni.setText(empleado.getDni());
                correo.setText(empleado.getEmail());
                telefono.setText(empleado.getTelf());
            } else {
                nombre.setText("—");
                apellido.setText("—");
                dni.setText("—");
                correo.setText("—");
                telefono.setText("—");
            }
        }
    }

    private void aplicarRol(Usuario user) {
        if (user == null) {
            return;
        }
        switch (user.getRol()) {
            case "Administrador":
                GEmpleados.setEnabled(true);
                GConsultorios.setEnabled(true);
                HistorialClinica.setEnabled(true);
                Reportes.setEnabled(true);
                Citas.setEnabled(true);
                GestionPacientes.setEnabled(true);
                break;
            case "Médico":
                Gconsulta.setEnabled(true);
                Citas.setEnabled(true);
                AtencionClinica.setEnabled(true);
                HistorialClinica.setEnabled(true);
                EjecucionOrdenesAnalisis.setEnabled(true);
                GestionPacientes.setEnabled(true);
                break;
            case "Enfermero":
                AdmisionyAlta.setEnabled(true);
                EjecucionOrdenesAnalisis.setEnabled(true);
                AtencionClinica.setEnabled(true);
                break;
            case "Cajero":
                Facturas.setEnabled(true);
                break;
            case "Recepcionista":
                GestionPacientes.setEnabled(true);
                Citas.setEnabled(true);
                AdmisionyAlta.setEnabled(true);
                Facturas.setEnabled(true);
                break;
        }
    }

    private void deshabilitarTodo() {
        GEmpleados.setEnabled(false);
        GConsultorios.setEnabled(false);
        GestionPacientes.setEnabled(false);
        Citas.setEnabled(false);
        AdmisionyAlta.setEnabled(false);
        AtencionClinica.setEnabled(false);
        EjecucionOrdenesAnalisis.setEnabled(false);
        HistorialClinica.setEnabled(false);
        Facturas.setEnabled(false);
        Reportes.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        CerrarSesionbt = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        GEmpleados = new javax.swing.JMenuItem();
        GConsultorios = new javax.swing.JMenuItem();
        Gconsulta = new javax.swing.JMenuItem();
        GestionPacientes = new javax.swing.JMenuItem();
        Citas = new javax.swing.JMenuItem();
        AdmisionyAlta = new javax.swing.JMenuItem();
        AtencionClinica = new javax.swing.JMenuItem();
        EjecucionOrdenesAnalisis = new javax.swing.JMenuItem();
        HistorialClinica = new javax.swing.JMenuItem();
        Facturas = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo");

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono");

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setOpaque(true);

        apellido.setBackground(new java.awt.Color(255, 255, 255));
        apellido.setOpaque(true);

        dni.setBackground(new java.awt.Color(255, 255, 255));
        dni.setOpaque(true);

        correo.setBackground(new java.awt.Color(255, 255, 255));
        correo.setOpaque(true);

        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setOpaque(true);

        CerrarSesionbt.setText("CerrarSesion");
        CerrarSesionbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(correo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(CerrarSesionbt)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CerrarSesionbt)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu1.setText("Funciones");

        GEmpleados.setText("Gestion Empleados");
        GEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(GEmpleados);

        GConsultorios.setText("Gestion Consultorios");
        GConsultorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GConsultoriosActionPerformed(evt);
            }
        });
        jMenu1.add(GConsultorios);

        Gconsulta.setText("Gestion Consulta");
        Gconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GconsultaActionPerformed(evt);
            }
        });
        jMenu1.add(Gconsulta);

        GestionPacientes.setText("Gestion Pacientes");
        GestionPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionPacientesActionPerformed(evt);
            }
        });
        jMenu1.add(GestionPacientes);

        Citas.setText("Citas");
        Citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitasActionPerformed(evt);
            }
        });
        jMenu1.add(Citas);

        AdmisionyAlta.setText("Admision y Alta");
        jMenu1.add(AdmisionyAlta);

        AtencionClinica.setText("Atencion Clinica");
        AtencionClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtencionClinicaActionPerformed(evt);
            }
        });
        jMenu1.add(AtencionClinica);

        EjecucionOrdenesAnalisis.setText("Ejecucion Ordenes Analisis");
        EjecucionOrdenesAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecucionOrdenesAnalisisActionPerformed(evt);
            }
        });
        jMenu1.add(EjecucionOrdenesAnalisis);

        HistorialClinica.setText("Historial Clinica");
        jMenu1.add(HistorialClinica);

        Facturas.setText("Facturas y Pagos");
        Facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturasActionPerformed(evt);
            }
        });
        jMenu1.add(Facturas);

        Reportes.setText("Reportes");
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });
        jMenu1.add(Reportes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Rol");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 409, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GConsultoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GConsultoriosActionPerformed

        GESTIONCONSULTORIOSPANEL panel = new GESTIONCONSULTORIOSPANEL(this.sistema);

        javax.swing.JFrame ventana = new javax.swing.JFrame("Gestión de Consultorios");

        ventana.setContentPane(panel);
        ventana.setSize(1200, 700);  
        ventana.setLocationRelativeTo(null);  
        ventana.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_GConsultoriosActionPerformed

    private void GEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GEmpleadosActionPerformed
        GESTIONEMPLEADOSPANEL panel = new GESTIONEMPLEADOSPANEL(this.sistema);

        // Creamos una nueva ventana
        javax.swing.JFrame ventana = new javax.swing.JFrame("Gestión de Empleados");

        // Configuramos la ventana con el panel
        ventana.setContentPane(panel);
        ventana.setSize(1200, 600);           
        ventana.setLocationRelativeTo(null);  
        ventana.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_GEmpleadosActionPerformed

    private void GestionPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionPacientesActionPerformed
        GESTIONPACIENTESPANEL panel = new GESTIONPACIENTESPANEL(this.sistema);
        javax.swing.JFrame ventana = new javax.swing.JFrame("Gestión de Pacientes");

        ventana.setContentPane(panel);
        ventana.setSize(1200, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_GestionPacientesActionPerformed

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportesActionPerformed

    private void FacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturasActionPerformed
        GestionFactura ventana = new GestionFactura(this.usuarioActual);
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_FacturasActionPerformed

    private void CitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasActionPerformed
        GESTIONCITAS gestorCitas = new GESTIONCITAS(this.usuarioActual);
        gestorCitas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CitasActionPerformed

    private void AtencionClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtencionClinicaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AtencionClinicaActionPerformed

    private void CerrarSesionbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionbtActionPerformed
        loginn login = new loginn();
        login.setVisible(true);
        this.dispose();    }//GEN-LAST:event_CerrarSesionbtActionPerformed

    private void EjecucionOrdenesAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecucionOrdenesAnalisisActionPerformed
        EjecuciónOrdenesyAnalisis ejecutor = new EjecuciónOrdenesyAnalisis(this.usuarioActual);
        ejecutor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EjecucionOrdenesAnalisisActionPerformed

    private void GconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GconsultaActionPerformed
        // TODO add your handling code here:
        GESTIONCONSULTAPANEL consultasPanel = new GESTIONCONSULTAPANEL(this.sistema);
        javax.swing.JFrame ventana = new javax.swing.JFrame("Gestión de Consultas");
        ventana.setContentPane(consultasPanel);
        ventana.setSize(900, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        this.dispose(); // Cierra el menú actual
    }//GEN-LAST:event_GconsultaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdmisionyAlta;
    private javax.swing.JMenuItem AtencionClinica;
    private javax.swing.JToggleButton CerrarSesionbt;
    private javax.swing.JMenuItem Citas;
    private javax.swing.JMenuItem EjecucionOrdenesAnalisis;
    private javax.swing.JMenuItem Facturas;
    private javax.swing.JMenuItem GConsultorios;
    private javax.swing.JMenuItem GEmpleados;
    private javax.swing.JMenuItem Gconsulta;
    private javax.swing.JMenuItem GestionPacientes;
    private javax.swing.JMenuItem HistorialClinica;
    private javax.swing.JMenuItem Reportes;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
