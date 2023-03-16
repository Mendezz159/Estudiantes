/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Estudiantes.InterfacesCambios;

import Estudiantes.Gestores.Estudiante;
import Estudiantes.Gestores.GestionEstudiantes;
import Estudiantes.InterfacesPrincipales.Interfaz;
import java.util.HashMap;

/**
 *
 * @author HP PORTATIL
 */
public class ModificarEstudiante extends javax.swing.JFrame {
    
    private int codigo;
    
    public ModificarEstudiante(int codigo, Estudiante estudiante) {
        initComponents();
        this.codigo = codigo;
        this.txtCodigo.setText(String.valueOf(codigo));
        this.txtfillNombres.setText(estudiante.getNombres());
        this.txtfillApellidos.setText(estudiante.getApellidos());
        this.txtfillDireccion.setText(estudiante.getDireccion());
        this.txtfillTelefono.setText(String.valueOf(estudiante.getTelefono()));
        this.txtfillCarrera.setText(estudiante.getCarrera());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EnunCodigo = new javax.swing.JLabel();
        EnunNombres = new javax.swing.JLabel();
        EnunApellidos = new javax.swing.JLabel();
        EnunDireccion = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        EnunCarrera = new javax.swing.JLabel();
        txtfillNombres = new javax.swing.JTextField();
        txtfillApellidos = new javax.swing.JTextField();
        txtfillDireccion = new javax.swing.JTextField();
        txtfillTelefono = new javax.swing.JTextField();
        txtfillCarrera = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        TituloRegistro = new javax.swing.JLabel();
        ErrorCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        errorTelefono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EnunCodigo.setText("Codigo");

        EnunNombres.setText("Nombres");

        EnunApellidos.setText("Apellidos");

        EnunDireccion.setText("Direccion");

        Telefono.setText("Telefono");

        EnunCarrera.setText("Carrera");

        txtfillTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfillTelefonoKeyTyped(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        TituloRegistro.setText("Registrar Estudiante");

        txtCodigo.setText("Codigotxt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Telefono)
                    .addComponent(EnunDireccion)
                    .addComponent(EnunApellidos)
                    .addComponent(EnunNombres)
                    .addComponent(EnunCodigo)
                    .addComponent(EnunCarrera))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloRegistro)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfillNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(txtfillApellidos)
                                .addComponent(txtfillDireccion)
                                .addComponent(txtfillTelefono)
                                .addComponent(txtfillCarrera))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txtCodigo)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrorCodigo)
                            .addComponent(errorTelefono))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TituloRegistro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnunCodigo)
                    .addComponent(ErrorCodigo)
                    .addComponent(txtCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnunNombres)
                    .addComponent(txtfillNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnunApellidos)
                    .addComponent(txtfillApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnunDireccion)
                    .addComponent(txtfillDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono)
                    .addComponent(txtfillTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnunCarrera)
                    .addComponent(txtfillCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean NombresValido = txtfillNombresCheck();
        boolean ApellidosValido = txtfillApellidosCheck();
        boolean DireccionValido = txtfillDireccionCheck();
        boolean TelefonoValido = txtfillTelefonoCheck();
        boolean CarreraValido = txtfillCarreraCheck();
        
        if(NombresValido && ApellidosValido && DireccionValido && TelefonoValido && CarreraValido){
            this.ModificarDatos();
            Interfaz.RefrescarLista();
            dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtfillTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfillTelefonoKeyTyped
        char i = evt.getKeyChar();
        
        if (!Character.isDigit(i) || txtfillTelefono.getText().length()==10){
            evt.consume();
        }
    }//GEN-LAST:event_txtfillTelefonoKeyTyped

    private void ModificarDatos(){
        
        Estudiante elviejo = new Estudiante(this.txtfillNombres.getText(),
                                            this.txtfillApellidos.getText(),
                                            this.txtfillDireccion.getText(),
                                            this.txtfillTelefono.getText(),
                                            this.txtfillCarrera.getText());
        
        GestionEstudiantes.ModificarEstudiante(codigo, elviejo);
    }
        
    private boolean txtfillNombresCheck(){
        return(!"".equals(this.txtfillNombres.getText()));
    }
    
    private boolean txtfillApellidosCheck(){
        return(!"".equals(this.txtfillApellidos.getText()));
    }
    
    private boolean txtfillDireccionCheck(){
        return(!"".equals(this.txtfillDireccion.getText()));
    }
    
    private boolean txtfillTelefonoCheck(){
        boolean Digitos10 = this.txtfillTelefono.getText().length() == 10;
        
        
        if(!Digitos10){
            this.errorTelefono.setText("Digite 10 digitos");
        }else{
            this.errorTelefono.setText("");
        }
        
        return(Digitos10);
    }
    
    private boolean txtfillCarreraCheck(){
        return(!"".equals(this.txtfillCarrera.getText()));
    }
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnunApellidos;
    private javax.swing.JLabel EnunCarrera;
    private javax.swing.JLabel EnunCodigo;
    private javax.swing.JLabel EnunDireccion;
    private javax.swing.JLabel EnunNombres;
    private javax.swing.JLabel ErrorCodigo;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel TituloRegistro;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JLabel errorTelefono;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtfillApellidos;
    private javax.swing.JTextField txtfillCarrera;
    private javax.swing.JTextField txtfillDireccion;
    private javax.swing.JTextField txtfillNombres;
    private javax.swing.JTextField txtfillTelefono;
    // End of variables declaration//GEN-END:variables
}
