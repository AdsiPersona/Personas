/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author Sala319
 */
public class FrmEmpleados extends javax.swing.JFrame {

   /**
     * Creates new form FrmPersonas
     */
    public FrmEmpleados() {
        initComponents();
        setLocationRelativeTo(this);
        asignarFecha();
    }
    
   
    
    public String HallarSexo(){
        String  Sexo;
        
       if (jRadioButtonFemenico.isSelected()){
           Sexo = "F";
       }
       else{
           Sexo = "M";
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
     
       private void asignarFecha(){
            Calendar fecha = new GregorianCalendar();
            
            String hoy = "";
                      
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH)+1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            
            hoy = dia+"/"+mes+"/"+(año - 30); 
            
//             JOptionPane.showMessageDialog(rootPane, hoy);
             
             try{   
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
                    Date fechaDate = new Date();
                    fechaDate = formato.parse(hoy);              
                                                                              
                    this.jDateFechaNaci.setDate(fechaDate);
                    jDateFechaNaci.getDateEditor().setEnabled(false);                                                                            
             }catch (ParseException ex){
                 Logger.getLogger(FrmEmpleados.class.getName()).log(Level.SEVERE,null, ex);
         }
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
        jLabelNombre = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jLabelSExo = new javax.swing.JLabel();
        jRadioButtonFemenico = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jLabelMovil = new javax.swing.JLabel();
        jTextMovil = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        jLabelDepartamento = new javax.swing.JLabel();
        jCbBoxDepartamento = new javax.swing.JComboBox();
        jBtnCrear = new javax.swing.JButton();
        jLbFechaNaci = new javax.swing.JLabel();
        jDateFechaNaci = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblEmpleados = new javax.swing.JTable();
        jBtnModificar = new javax.swing.JButton();
        jTextNombre = new javax.swing.JTextField();
        jComboRoles = new javax.swing.JComboBox();
        jLabelRoles = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personas ");
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

        jLabelNombre.setText("Nombre");

        jTextTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextTelefonoFocusLost(evt);
            }
        });
        jTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyTyped(evt);
            }
        });

        jLabelEmail.setText("Email Institucional");

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

        jLabelSExo.setText("Sexo");

        buttonGroupSexo.add(jRadioButtonFemenico);
        jRadioButtonFemenico.setText("F");
        jRadioButtonFemenico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemenicoActionPerformed(evt);
            }
        });

        buttonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("M");
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        jLabelMovil.setText("Movil");

        jTextMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMovilActionPerformed(evt);
            }
        });
        jTextMovil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextMovilFocusLost(evt);
            }
        });
        jTextMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMovilKeyTyped(evt);
            }
        });

        jLabelTelefono.setText("Telefono");

        jTextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoActionPerformed(evt);
            }
        });
        jTextApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidoKeyTyped(evt);
            }
        });

        jLabelDepartamento.setText("Departamento");

        jCbBoxDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbBoxDepartamentoItemStateChanged(evt);
            }
        });

        jBtnCrear.setText("Crear");
        jBtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCrearActionPerformed(evt);
            }
        });

        jLbFechaNaci.setText("Fecha Nacimiento ");

        jTblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTblEmpleados);

        jBtnModificar.setText("Modificar");

        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        jLabelRoles.setText("Roles: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jTextDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jCbBoxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSExo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLbFechaNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jDateFechaNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonFemenico, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jRadioButtonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabelDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jCbBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabelMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEmail)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextMovil, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jComboRoles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jBtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbFechaNaci)
                            .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateFechaNaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSExo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jRadioButtonFemenico))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jRadioButtonMasculino))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jCbBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jCbBoxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Empleados ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar(); 
        String cadena = jTextTelefono.getText();   
        
        if(c < '0' || c > '9') evt.consume();
        if(cadena.length() >=7)evt.consume();
    }//GEN-LAST:event_jTextTelefonoKeyTyped

    private void jTextEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEmailKeyTyped
        // TODO add your handling code here:
        String cadena = jTextEmail.getText();
        if(cadena.length() >=45)evt.consume();
    }//GEN-LAST:event_jTextEmailKeyTyped

    private void jTextApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
         String cadena = jTextApellido.getText();
         
        if((c< 'a'||c> 'z') && (c< 'A')| c> 'Z') evt.consume();
        if(cadena.length() >=25)evt.consume();
    }//GEN-LAST:event_jTextApellidoKeyTyped

    private void jTextMovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMovilKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        String cadena = jTextMovil.getText();   
        
        if(c < '0' || c > '9') evt.consume();
        if(cadena.length() >=10)evt.consume();
    }//GEN-LAST:event_jTextMovilKeyTyped

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
        int longitud = this.jTextDocumento.getText().length();
        
         
        if (!Character.isDigit(c) || longitud >= 11) {
            JOptionPane.showMessageDialog(jTextDocumento, "Solo son 11 digitos");
            evt.consume();
        }
        
        if (c < '0' || c > '9') {
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

    private void jRadioButtonFemenicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemenicoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButtonFemenicoActionPerformed

    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed

    private void jBtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearActionPerformed
        // TODO add your handling code here:
//        String a = jLbDocumento.getText();
//        String b = (String) jCbBoxCiudades.getSelectedItem();
//        String c = (String) jCbBoxDepartamento.getSelectedItem();
//        String d = jLabelNombre.getText();
//        String e = jLabelApellido.getText();
//        String f = jLabelTelefono.getText();
//        String g = jLabelMovil.getText();
//        String h = jLabelDireccion.getText();
//        String i = jLabelEmail.getText();
//        String j = jLbFechaNaci.getText();
    }//GEN-LAST:event_jBtnCrearActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
         String cadena = jTextNombre.getText();
         
        if((c< 'a'||c> 'z') && (c< 'A')| c> 'Z') evt.consume();
        if(cadena.length() >=25)evt.consume();
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextApellidoActionPerformed

    private void jTextDocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDocumentoFocusLost
        // TODO add your handling code here:
        int longitud = this.jTextDocumento.getText().length();
        
        
        if(longitud < 11){
            JOptionPane.showMessageDialog(jTextDocumento, "Debe tener 11 Digitos");
        }
    }//GEN-LAST:event_jTextDocumentoFocusLost

    private void jTextTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTelefonoFocusLost
        // TODO add your handling code here:
         int longitud = this.jTextTelefono.getText().length();
        
        
        if(longitud < 7){
            JOptionPane.showMessageDialog(jTextDocumento, "Debe tener 7 Digitos");
        }
    }//GEN-LAST:event_jTextTelefonoFocusLost

    private void jTextMovilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextMovilFocusLost
        // TODO add your handling code here:
         int longitud = this.jTextMovil.getText().length();
        
        
        if(longitud < 10){
            JOptionPane.showMessageDialog(jTextMovil, "Debe tener 10 Digitos");
        }
    }//GEN-LAST:event_jTextMovilFocusLost

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
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup buttonGroupPersona;
    public javax.swing.ButtonGroup buttonGroupSexo;
    public javax.swing.JButton jBtnCrear;
    public javax.swing.JButton jBtnModificar;
    public javax.swing.JComboBox jCbBoxCiudades;
    public javax.swing.JComboBox jCbBoxDepartamento;
    public javax.swing.JComboBox jComboRoles;
    public com.toedter.calendar.JDateChooser jDateFechaNaci;
    public static javax.swing.JLabel jLabelApellido;
    public static javax.swing.JLabel jLabelCiudad;
    public static javax.swing.JLabel jLabelDepartamento;
    public static javax.swing.JLabel jLabelDireccion;
    public static javax.swing.JLabel jLabelEmail;
    public static javax.swing.JLabel jLabelMovil;
    public static javax.swing.JLabel jLabelNombre;
    public static javax.swing.JLabel jLabelRoles;
    public static javax.swing.JLabel jLabelSExo;
    public static javax.swing.JLabel jLabelTelefono;
    public static javax.swing.JLabel jLbDocumento;
    public javax.swing.JLabel jLbFechaNaci;
    public javax.swing.JRadioButton jRadioButtonFemenico;
    public javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTblEmpleados;
    public javax.swing.JTextField jTextApellido;
    public javax.swing.JTextField jTextDireccion;
    public javax.swing.JTextField jTextDocumento;
    public javax.swing.JTextField jTextEmail;
    public javax.swing.JTextField jTextMovil;
    public javax.swing.JTextField jTextNombre;
    public javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
