/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Sala319
 */
public class FrmTipoPersona extends javax.swing.JFrame {

   /**
     * Creates new form FrmPersonas
     */
    public FrmTipoPersona() {
        initComponents();
        setLocationRelativeTo(this);
        this.jRadioButtonFemenico.setSelected(true);
        this.jRdioBtnNatural.setSelected(false);
    }
    
    public String HallarPersona(){
         String Persona;
        
       if (jRdioBtnNatural.isSelected()){
           Persona = "N";
       }
       else{
           Persona = "J";
       }
       return Persona;
    } 
    
    
    
    public char HallarSexo(){
        char  Sexo;
        
       if (jRadioButtonFemenico.isSelected()){
           Sexo = 'F';
       }
       else{
           Sexo = 'M';
       }
       return Sexo;
    }   
    
    
     public boolean isEmail(String correo){
            Pattern pat = null;
            Matcher mat = null;
            pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z]"
                    + "[-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
            mat = pat.matcher(correo);
            if(mat.find()){
                return true;
            }else{
                return false;
            }
        }
     
     public void DeshabilitarMenu(){
//         jTextContacto.setEnabled(false);
//         jTextWeb.setEnabled(false);
     }

     public void HabilitarMenu(){
//         jRadioButtonFemenico.setEnabled(true);
//         jRadioButtonMasculino.setEnabled(true);
//         jTextContacto.setEnabled(true);
//         jTextWeb.setEnabled(true);
     }
     
     
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPersona = new javax.swing.ButtonGroup();
        buttonGroupSexo = new javax.swing.ButtonGroup();
        jLbDocumento = new javax.swing.JLabel();
        jTextDocumento = new javax.swing.JTextField();
        jLabelCiudad = new javax.swing.JLabel();
        jCbBoxCiudades = new javax.swing.JComboBox();
        jLabelPersona = new javax.swing.JLabel();
        jRdioBtnNatural = new javax.swing.JRadioButton();
        jRdioBtnJuridica = new javax.swing.JRadioButton();
        jLabelNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextFlApellido = new javax.swing.JTextField();
        jLabelSExo = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFemenico = new javax.swing.JRadioButton();
        jLabelContacto = new javax.swing.JLabel();
        jTextContacto = new javax.swing.JTextField();
        jLabelWeb = new javax.swing.JLabel();
        jTextWeb = new javax.swing.JTextField();
        jLabelMovil = new javax.swing.JLabel();
        jTextMovil = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jLabelDepartamento = new javax.swing.JLabel();
        jCbBoxDepartamento = new javax.swing.JComboBox();
        jBtnVerPersona = new javax.swing.JButton();
        jBtnAdicionarPersona = new javax.swing.JButton();
        jBtnAgregarPersona = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personas ");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLbDocumento.setText("Documento ");

        jTextDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDocumentoActionPerformed(evt);
            }
        });
        jTextDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDocumentoFocusLost(evt);
            }
        });
        jTextDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDocumentoKeyTyped(evt);
            }
        });

        jLabelCiudad.setText("Ciudad ");

        jLabelPersona.setText("Persona  ");

        buttonGroupPersona.add(jRdioBtnNatural);
        jRdioBtnNatural.setText("Natutal");
        jRdioBtnNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdioBtnNaturalActionPerformed(evt);
            }
        });

        buttonGroupPersona.add(jRdioBtnJuridica);
        jRdioBtnJuridica.setText("Juridica");
        jRdioBtnJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdioBtnJuridicaActionPerformed(evt);
            }
        });

        jLabelNombre.setText("Nombre");

        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        jLabelEmail.setText("Email");

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        jTextEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextEmailFocusLost(evt);
            }
        });
        jTextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEmailKeyTyped(evt);
            }
        });

        jLabelDireccion.setText("Direccion ");

        jLabelApellido.setText("Apellido ");

        jTextFlApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFlApellidoKeyTyped(evt);
            }
        });

        jLabelSExo.setText("Sexo");

        jRadioButtonMasculino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("M");
        jRadioButtonMasculino.setOpaque(false);
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        jRadioButtonFemenico.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupSexo.add(jRadioButtonFemenico);
        jRadioButtonFemenico.setText("F");
        jRadioButtonFemenico.setOpaque(false);
        jRadioButtonFemenico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemenicoActionPerformed(evt);
            }
        });

        jLabelContacto.setText("Contacto ");

        jTextContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContactoActionPerformed(evt);
            }
        });
        jTextContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextContactoKeyTyped(evt);
            }
        });

        jLabelWeb.setText("Web");

        jLabelMovil.setText("Movil");

        jTextMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMovilActionPerformed(evt);
            }
        });
        jTextMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMovilKeyTyped(evt);
            }
        });

        jLabelTelefono.setText("Telefono");

        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });
        jTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyTyped(evt);
            }
        });

        jLabelDepartamento.setText("Departamento");

        jCbBoxDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbBoxDepartamentoItemStateChanged(evt);
            }
        });

        jBtnVerPersona.setText("Ver Persona");

        jBtnAdicionarPersona.setText("Adicionar Persona");
        jBtnAdicionarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarPersonaActionPerformed(evt);
            }
        });

        jBtnAgregarPersona.setText("Agregar Persona ");
        jBtnAgregarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarPersonaActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");

        jTblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTblPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPersona)
                        .addGap(6, 6, 6)
                        .addComponent(jRdioBtnNatural)
                        .addGap(10, 10, 10)
                        .addComponent(jRdioBtnJuridica))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jTextDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jTextFlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabelSExo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jRadioButtonFemenico, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButtonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jCbBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jCbBoxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jTextMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnVerPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jBtnAdicionarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBtnAgregarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(jTextContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(jLabelWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jTextWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdioBtnJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRdioBtnNatural))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSExo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonFemenico)
                    .addComponent(jRadioButtonMasculino))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCbBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDepartamento)
                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbBoxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMovil)
                    .addComponent(jTextMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelContacto)
                    .addComponent(jTextContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelWeb)
                    .addComponent(jTextWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnVerPersona)
                    .addComponent(jBtnAdicionarPersona)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnAgregarPersona)
                        .addComponent(jBtnEliminar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
         String cadena = jTextNombre.getText();
         
        if((c< 'a'||c> 'z') && (c< 'A')| c> 'Z') evt.consume();
        if(cadena.length() >=25)evt.consume();
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextFlApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFlApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
         String cadena = jTextFlApellido.getText();
         
        if((c< 'a'||c> 'z') && (c< 'A')| c> 'Z') evt.consume();
        if(cadena.length() >=25)evt.consume();
    }//GEN-LAST:event_jTextFlApellidoKeyTyped

    private void jTextEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEmailKeyTyped
        // TODO add your handling code here:
        String cadena = jTextEmail.getText();
        if(cadena.length() >=45)evt.consume();
    }//GEN-LAST:event_jTextEmailKeyTyped

    private void jTextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        String cadena = jTextTelefono.getText();
        
        if(c< '0' || c> '9') evt.consume();
        if(cadena.length() >=7)evt.consume();
    }//GEN-LAST:event_jTextTelefonoKeyTyped

    private void jTextMovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMovilKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        String cadena = jTextMovil.getText();   
        
        if(c < '0' || c > '9') evt.consume();
        if(cadena.length() >=10)evt.consume();
    }//GEN-LAST:event_jTextMovilKeyTyped

    private void jTextContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContactoActionPerformed

    private void jTextContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextContactoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
         String cadena = jTextContacto.getText();
         
        if((c< 'a'||c> 'z') && (c< 'A')| c> 'Z') evt.consume();
        if(cadena.length() >=25)evt.consume();
    }//GEN-LAST:event_jTextContactoKeyTyped

    private void jTextEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextEmailFocusLost
        // TODO add your handling code here:
          if (!isEmail(jTextEmail.getText())){
           JOptionPane.showMessageDialog(rootPane, "Email Incorrecto"); 
           jTextEmail.requestFocus();
           jTextEmail.selectAll();
        }
    }//GEN-LAST:event_jTextEmailFocusLost

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMovilActionPerformed

    private void jTextDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDocumentoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

        String cadena = jTextDocumento.getText();
        if (cadena.length() >= 11) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextDocumentoKeyTyped

    private void jTextDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDocumentoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened

    private void jCbBoxDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbBoxDepartamentoItemStateChanged
     
    }//GEN-LAST:event_jCbBoxDepartamentoItemStateChanged

    private void jBtnAdicionarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAdicionarPersonaActionPerformed

    private void jRadioButtonFemenicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemenicoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButtonFemenicoActionPerformed

    private void jRdioBtnNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdioBtnNaturalActionPerformed
        // TODO add your handling code here:
        jLabelContacto.setVisible(false);
        jLabelWeb.setVisible(false);
        jTextContacto.setVisible(false);
        jTextWeb.setVisible(false);
        jLabelSExo.setVisible(true);
        jRadioButtonFemenico.setVisible(true);
        jRadioButtonMasculino.setVisible(true);
         jLabelApellido.setVisible(true);
        jTextFlApellido.setVisible(true);
        this.DeshabilitarMenu();
        
    }//GEN-LAST:event_jRdioBtnNaturalActionPerformed

    private void jRdioBtnJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdioBtnJuridicaActionPerformed
        // TODO add your handling code here:
        jLabelSExo.setVisible(false);
        jRadioButtonFemenico.setVisible(false);
        jRadioButtonMasculino.setVisible(false);
        jLabelApellido.setVisible(false);
        jTextFlApellido.setVisible(false);
        
        jLabelContacto.setVisible(true);
        jLabelWeb.setVisible(true);
        jTextContacto.setVisible(true);
        jTextWeb.setVisible(true);
        
        this.HabilitarMenu();
    }//GEN-LAST:event_jRdioBtnJuridicaActionPerformed

    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed

    private void jBtnAgregarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarPersonaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBtnAgregarPersonaActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

    private void jTextDocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDocumentoFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextDocumentoFocusLost

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
            java.util.logging.Logger.getLogger(FrmTipoPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTipoPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTipoPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTipoPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTipoPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup buttonGroupPersona;
    public javax.swing.ButtonGroup buttonGroupSexo;
    public javax.swing.JButton jBtnAdicionarPersona;
    public javax.swing.JButton jBtnAgregarPersona;
    public javax.swing.JButton jBtnEliminar;
    public javax.swing.JButton jBtnVerPersona;
    public javax.swing.JComboBox jCbBoxCiudades;
    public javax.swing.JComboBox jCbBoxDepartamento;
    public static javax.swing.JLabel jLabelApellido;
    public javax.swing.JLabel jLabelCiudad;
    public static javax.swing.JLabel jLabelContacto;
    public static javax.swing.JLabel jLabelDepartamento;
    public static javax.swing.JLabel jLabelDireccion;
    public javax.swing.JLabel jLabelEmail;
    public static javax.swing.JLabel jLabelMovil;
    public javax.swing.JLabel jLabelNombre;
    public static javax.swing.JLabel jLabelPersona;
    public static javax.swing.JLabel jLabelSExo;
    public javax.swing.JLabel jLabelTelefono;
    public javax.swing.JLabel jLabelWeb;
    public static javax.swing.JLabel jLbDocumento;
    public javax.swing.JRadioButton jRadioButtonFemenico;
    public javax.swing.JRadioButton jRadioButtonMasculino;
    public javax.swing.JRadioButton jRdioBtnJuridica;
    public javax.swing.JRadioButton jRdioBtnNatural;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTblPersonas;
    public javax.swing.JTextField jTextContacto;
    public javax.swing.JTextField jTextDireccion;
    public javax.swing.JTextField jTextDocumento;
    public javax.swing.JTextField jTextEmail;
    public javax.swing.JTextField jTextFlApellido;
    public javax.swing.JTextField jTextMovil;
    public javax.swing.JTextField jTextNombre;
    public javax.swing.JTextField jTextTelefono;
    public javax.swing.JTextField jTextWeb;
    // End of variables declaration//GEN-END:variables
}
