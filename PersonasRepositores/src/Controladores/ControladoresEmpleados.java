/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Modelos.EmpleadosModelo;
import Vista.FrmEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sala319
 */
public class ControladoresEmpleados implements ActionListener, MouseListener{
    
    FrmEmpleados vtnEmpleados;
    EmpleadosModelo modelo = new EmpleadosModelo();
    
    public enum AccionMVC{
        __AGREGAR_EMPLEADO,
        __MODIFICAR_EMPLEADO,
        __INTEMSELECTED
    }
    
       public String CambiarFecha(Date fecha){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String formattedTime = formato.format(fecha);
            return formattedTime;
             
        }
       
    public ControladoresEmpleados(FrmEmpleados vista){
        this.vtnEmpleados = vista;
        for (int i = 0; i < modelo.LlenarComboDeptos().length; i++){
            vista.jCbBoxDepartamento.addItem(modelo.LlenarComboDeptos()[i]);
        }
        
        for (int i = 0; i < modelo.LlenarComboBoxRoles().length; i++){
            vista.jComboRoles.addItem(modelo.LlenarComboBoxRoles()[i]);
        }

      }
           
     private void llenarCbMpios(){    
        String dpto = this.vtnEmpleados.jCbBoxDepartamento.getSelectedItem().toString();
     vtnEmpleados.jCbBoxCiudades.removeAllItems();
        for (int i = 0; i < this.modelo.LlenarComboMpios(this.modelo.codigoDpto(dpto)).length; i++) {
            vtnEmpleados.jCbBoxCiudades.addItem(this.modelo.LlenarComboMpios(this.modelo.codigoDpto(dpto))[i]);            
        }        
    }
    
    public void Iniciar(){
//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows."
//                                      + "WindowsLookAndFeel");
//            SwingUtilities.updateComponentTreeUI(vtnPersonas);
            vtnEmpleados.setVisible(true);
            vtnEmpleados.setLocationRelativeTo(null);
//        } catch (UnsupportedLookAndFeelException ex) {}
//          catch (ClassNotFoundException ex){
//                JOptionPane.showMessageDialog(vtnPersonas, "Error de driver de "
//                + "Video: "+ex.getMessage());
//          }
//          catch (InstantiationException ex){}
//          catch (IllegalAccessException ex){}
               
        
        this.vtnEmpleados.jBtnCrear.setActionCommand("__AGREGAR_EMPLEADO");
        this.vtnEmpleados.jBtnCrear.addActionListener(this);
        
        this.vtnEmpleados.jBtnModificar.setActionCommand("MODIFICAR_EMPLEADO");
        this.vtnEmpleados.jBtnModificar.addActionListener(this);
        
        this.vtnEmpleados.jCbBoxDepartamento.setActionCommand("__INTEMSELECTED");
        this.vtnEmpleados.jCbBoxDepartamento.addActionListener(this);
        
        this.vtnEmpleados.jTblEmpleados.addMouseListener(this);
        this.vtnEmpleados.jTblEmpleados.setModel(new DefaultTableModel());   
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getButton()== 1)//boton izquierdo
        {
            int fila = this.vtnEmpleados.jTblEmpleados.rowAtPoint(e.getPoint());
            if(fila > -1){
                this.vtnEmpleados.jTextDocumento.setText(String.valueOf(
                        this.vtnEmpleados.jTblEmpleados.getValueAt(fila, 0)));
                this.vtnEmpleados.jTextTelefono.setText(String.valueOf(
                        this.vtnEmpleados.jTblEmpleados.getValueAt(fila, 1)));
                 this.vtnEmpleados.jDateFechaNaci.setDateFormatString(String.valueOf(
                        this.vtnEmpleados.jTblEmpleados.getValueAt(fila, 2)));
                this.vtnEmpleados.jTextApellido.setText(String.valueOf(
                        this.vtnEmpleados.jTblEmpleados.getValueAt(fila, 3)));
                this.vtnEmpleados.jComboRoles.setSelectedItem(String.valueOf(
                        this.vtnEmpleados.jTblEmpleados.getValueAt(fila, 4)));
                this.vtnEmpleados.jTextMovil.setText(String.valueOf(
                        this.vtnEmpleados.jTblEmpleados.getValueAt(fila, 5)));
                this.vtnEmpleados.jTextEmail.setText(String.valueOf(
                        this.vtnEmpleados.jTblEmpleados.getValueAt(fila, 6))); 
                this.vtnEmpleados.jTextDocumento.setEditable(false);
                this.vtnEmpleados.jTextTelefono.setEditable(false);
                this.vtnEmpleados.jDateFechaNaci.setEnabled(false);
                this.vtnEmpleados.jTextApellido.setEditable(false);
                this.vtnEmpleados.jComboRoles.setEditable(false);
                this.vtnEmpleados.jTextMovil.setEditable(false);
                this.vtnEmpleados.jTextEmail.setEditable(false);
                
                
               
                 
            }
        }
    }
    
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    
    @Override
    public void actionPerformed(ActionEvent e){
        switch(AccionMVC.valueOf(e.getActionCommand())){
            
      
            
            case __MODIFICAR_EMPLEADO:{
                this.vtnEmpleados.jTextDocumento.setEditable(true);
                this.vtnEmpleados.jTextTelefono.setEditable(true);
                this.vtnEmpleados.jTextApellido.setEditable(true);
                this.vtnEmpleados.jComboRoles.setEditable(true);
                this.vtnEmpleados.jTextMovil.setEditable(true);
                this.vtnEmpleados.jTextDireccion.setEditable(true);
                this.vtnEmpleados.jTextEmail.setEditable(true);
                this.vtnEmpleados.jDateFechaNaci.setEnabled(true);
                this.vtnEmpleados.jTextDocumento.requestFocus();
                this.vtnEmpleados.jTextDocumento.setText("");
                this.vtnEmpleados.jTextTelefono.setText("");
                this.vtnEmpleados.jTextApellido.setText("");
                this.vtnEmpleados.jComboRoles.setSelectedItem("");
                this.vtnEmpleados.jTextMovil.setText("");
                this.vtnEmpleados.jTextDireccion.setText("");
                this.vtnEmpleados.jTextEmail.setText("");
                this.vtnEmpleados.jDateFechaNaci.setDateFormatString("");
                
                break;
            }
            case __AGREGAR_EMPLEADO:{
                if (this.modelo.NuevoEmpleado(
                        this.vtnEmpleados.jTextDocumento.getText(),
                        this.vtnEmpleados.jTextNombre.getText(),
                        CambiarFecha(this.vtnEmpleados.jDateFechaNaci.getDate()),
                        this.vtnEmpleados.jTextApellido.getText(),
                        this.vtnEmpleados.jTextTelefono.getText(),
                        this.vtnEmpleados.jTextMovil.getText(),
                        this.vtnEmpleados.jTextEmail.getText(),
                        this.vtnEmpleados.jComboRoles.getSelectedItem().toString())){
                this.vtnEmpleados.jTblEmpleados.setModel(this.modelo.getTablaPersonas());
                JOptionPane.showMessageDialog(vtnEmpleados, "Persona  Creada!.");
                this.vtnEmpleados.jTextDocumento.setText("");
                this.vtnEmpleados.jTextNombre.setText("");
                this.vtnEmpleados.jTextTelefono.setText("");
                this.vtnEmpleados.jDateFechaNaci.setDateFormatString("");
                this.vtnEmpleados.jTextApellido.setText("");
                this.vtnEmpleados.jTextMovil.setText("");
                this.vtnEmpleados.jTextEmail.setText("");
                this.vtnEmpleados.jComboRoles.setSelectedItem("");
                
                
            }
            else
                JOptionPane.showMessageDialog(vtnEmpleados,"Datos Incorrectos!.");
            break;
            }
            case __INTEMSELECTED:{                    
                    llenarCbMpios();
                    break;       
                } 

           }
        }
    }

