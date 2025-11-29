package Principal;

import Clinica.Administrador;
import Clinica.Medico;
import Clinica.Recepcionista;
import Clinica.Usuario;
import Clinica.Cajero;
import Clinica.Enfermero;
import GestionClinica.GestorUsuarios;
import static java.lang.System.gc;
import Clinica.Paciente;

public class loginn extends javax.swing.JFrame {

    public static Sistema sistemaGlobal = new Sistema();
   
    private GestorUsuarios usuarios;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(loginn.class.getName());
    public loginn() {
        initComponents();
        if (usuarios == null) {
            usuarios = new GestorUsuarios();
        }
        cargarUsuariosLogin();
        /*
        Medico med1 = new Medico("Cardiología", "11111111", "Juan", "Perez", "999999", "juan@mail.com", "medico1", "1234", "Médico");
        usuarios.AgregarUsuario("medico1", "1234", "Médico", med1);
        sistemaGlobal.getGestionEmpleados().crearEmpleado(med1);

        Medico med2 = new Medico("Pediatría", "22222222", "Ana", "Gomez", "888888", "ana@mail.com", "medico2", "1234", "Médico");
        usuarios.AgregarUsuario("medico2", "1234", "Médico", med2);
        sistemaGlobal.getGestionEmpleados().crearEmpleado(med2);

        Administrador admin = new Administrador("12312312", "Paul", "Castro", "123123", "castro@gmail.com", "admin", "admin", "Administrador");
        usuarios.AgregarUsuario("admin", "admin", "Administrador", admin);
        sistemaGlobal.getGestionEmpleados().crearEmpleado(admin);
        
        Administrador admin2 = new Administrador("66666", "Renata", "res", "1123123", "ren@gmail.com", "admin", "admin", "Administrador");
        usuarios.AgregarUsuario("admin", "admin", "Administrador", admin2);
        sistemaGlobal.getGestionEmpleados().crearEmpleado(admin2);

        Recepcionista recep = new Recepcionista("33333333", "Laura", "Rojas", "777777", "laura@mail.com", "recep", "1234", "Recepcionista");
        sistemaGlobal.getGestionEmpleados().crearEmpleado(recep);

        // Paciente
        Paciente paciente = new Paciente("74839201", "María Fernanda", "López Rivas", "2004-03-22", "F", "987654321", "Jr. Las Gardenias 221", "Carlos López - 987112233");
        sistemaGlobal.getGestionPacientes().agregar(paciente);

        Cajero cajero = new Cajero("44444444", "Pedro", "Mendoza", "666666", "pedro@mail.com", "cajero", "1234", "Cajero");
        sistemaGlobal.getGestionEmpleados().crearEmpleado(cajero);

        Enfermero enfer = new Enfermero("60966605", "Carlos", "Cabrera", "45632423", "cabrera@gmail.com", "enfermero", "enfermero", "Enfermero");
        sistemaGlobal.getGestionEmpleados().crearEmpleado(enfer);

        usuarios.AgregarUsuario("cajero", "cajero", "Cajero", cajero);
        usuarios.AgregarUsuario("medico1", "1234", "Médico", med1);
        usuarios.AgregarUsuario("medico2", "1234", "Médico", med2);
        usuarios.AgregarUsuario("enfermera", "enfermera", "Enfermero");
        usuarios.AgregarUsuario("recep", "1234", "Recepcionista", recep);
        */
    }

    private void cargarUsuariosLogin() {
        // Buscar médicos del sistema para crear usuarios
        Medico med1 = null, med2 = null;
        
        for (int i = 0; i < sistemaGlobal.getGestionEmpleados().getCantidad(); i++) {
            if (sistemaGlobal.getGestionEmpleados().getEmpleados()[i] instanceof Medico) {
                Medico m = (Medico) sistemaGlobal.getGestionEmpleados().getEmpleados()[i];
                if ("Juan".equals(m.getNombres())) med1 = m;
                if ("Ana".equals(m.getNombres())) med2 = m;
            }
        }

        // Crear usuarios de login
        if (med1 != null) {
            usuarios.AgregarUsuario("medico1", "1234", "Médico", med1);
        }
        if (med2 != null) {
            usuarios.AgregarUsuario("medico2", "1234", "Médico", med2);
        }
        
        Administrador admin = new Administrador("33333333", "Luis", "Ramírez", "777777", "luis@clinica.com", "admin", "admin", "Administrador");
            usuarios.AgregarUsuario("admin", "admin", "Administrador", admin);
            sistemaGlobal.getGestionEmpleados().crearEmpleado(admin);

            Recepcionista recep = new Recepcionista("44444444", "Laura", "Torres", "666666", "laura@clinica.com", "recep", "1234", "Recepcionista");
            usuarios.AgregarUsuario("recep", "1234", "Recepcionista", recep);
            sistemaGlobal.getGestionEmpleados().crearEmpleado(recep);

            Enfermero enfer = new Enfermero("55555555", "Marta", "Díaz", "555555", "marta@clinica.com", "enfermera", "enfermera", "Enfermero");
            usuarios.AgregarUsuario("enfermera", "enfermera", "Enfermero", enfer);
            sistemaGlobal.getGestionEmpleados().crearEmpleado(enfer);

            Cajero cajero = new Cajero("66666666", "Pedro", "Silva", "444444", "pedro@clinica.com", "cajero", "cajero", "Cajero");
            usuarios.AgregarUsuario("cajero", "cajero", "Cajero", cajero);
            sistemaGlobal.getGestionEmpleados().crearEmpleado(cajero);
            
            Paciente paciente1 = new Paciente("74839201", "María Fernanda", "López Rivas", "2004-03-22", "F", "987654321", "Jr. Las Gardenias 221", "Carlos López - 987112233");
            sistemaGlobal.getGestionPacientes().agregar(paciente1);
            

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aceptar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.setActionCommand("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Aceptar)
                        .addGap(73, 73, 73)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Salir))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        String pass = String.valueOf(jPasswordField1.getPassword());
        Usuario x = usuarios.ValidarUsuario(user.getText(), pass);

        if (x != null) {
            sistemaGlobal.setUsuarioActual(x);

            MenudeOpciones menu = new MenudeOpciones(x, sistemaGlobal);
            menu.setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
        
    }//GEN-LAST:event_AceptarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new loginn().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
