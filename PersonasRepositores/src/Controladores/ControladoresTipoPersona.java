/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Modelos.TipoPersonaModelo;
import Vista.FrmTipoPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sala319
 */
public class ControladoresTipoPersona implements ActionListener, MouseListener{
    
    FrmTipoPersona vtnTipoPersona;
    TipoPersonaModelo modelo = new TipoPersonaModelo();
    
    public enum AccionMVC{
        __VER_PERSONA,
        __AGREGAR_PERSONA,
        __ELIMINAR_PERSONA,
        __ADICIONAR_PERSONA,
        __INTEMSELECTED
        
    }
    
    public ControladoresTipoPersona(FrmTipoPersona vista){
        this.vtnTipoPersona = vista;
        for (int i = 0; i < modelo.LlenarComboDeptos().length; i++){
            vista.jCbBoxDepartamento.addItem(modelo.LlenarComboDeptos()[i]);
        }
        }
            
    private void llenarCbMpios(){    
        String dpto = this.vtnTipoPersona.jCbBoxDepartamento.getSelectedItem().toString();
        
        vtnTipoPersona.jCbBoxCiudades.removeAllItems();
        for (int i = 0; i < this.modelo.LlenarComboMpios(this.modelo.codigoDpto(dpto)).length; i++) {
            vtnTipoPersona.jCbBoxCiudades.addItem(this.modelo.LlenarComboMpios(this.modelo.codigoDpto(dpto))[i]);            
        }        
    }
    public void Iniciar(){
//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows."
//                                      + "WindowsLookAndFeel");
//            SwingUtilities.updateComponentTreeUI(vtnPersonas);
            vtnTipoPersona.setVisible(true);
            vtnTipoPersona.setLocationRelativeTo(null);
//        } catch (UnsupportedLookAndFeelException ex) {}
//          catch (ClassNotFoundException ex){
//                JOptionPane.showMessageDialog(vtnPersonas, "Error de driver de "
//                + "Video: "+ex.getMessage());
//          }
//          catch (InstantiationException ex){}
//          catch (IllegalAccessException ex){}
        
        this.vtnTipoPersona.jBtnVerPersona.setActionCommand("__VER_PERSONA");
        this.vtnTipoPersona.jBtnVerPersona.addActionListener(this);
        
        this.vtnTipoPersona.jBtnAdicionarPersona.setActionCommand("__ADICIONAR_PERSONA");
        this.vtnTipoPersona.jBtnAdicionarPersona.addActionListener(this);
        
        this.vtnTipoPersona.jBtnAgregarPersona.setActionCommand("__AGREGAR_PERSONA");
        this.vtnTipoPersona.jBtnAgregarPersona.addActionListener(this);
        
        this.vtnTipoPersona.jBtnEliminar.setActionCommand("__ELIMINAR_PERSONA");
        this.vtnTipoPersona.jBtnEliminar.addActionListener(this);
        
        this.vtnTipoPersona.jCbBoxDepartamento.setActionCommand("__INTEMSELECTED");
        this.vtnTipoPersona.jCbBoxDepartamento.addActionListener(this);
        
        this.vtnTipoPersona.jTblPersonas.addMouseListener(this);
        this.vtnTipoPersona.jTblPersonas.setModel(new DefaultTableModel());   
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getButton()== 1)//boton izquierdo
        {
            int fila = this.vtnTipoPersona.jTblPersonas.rowAtPoint(e.getPoint());
            if(fila > -1){
                this.vtnTipoPersona.jTextDocumento.setText(String.valueOf(
                        this.vtnTipoPersona.jTblPersonas.getValueAt(fila, 0)));
                this.vtnTipoPersona.jTextNombre.setText(String.valueOf(
                        this.vtnTipoPersona.jTblPersonas.getValueAt(fila, 1)));
                this.vtnTipoPersona.jTextFlApellido.setText(String.valueOf(
                        this.vtnTipoPersona.jTblPersonas.getValueAt(fila, 2)));
                this.vtnTipoPersona.jTextTelefono.setText(String.valueOf(
                        this.vtnTipoPersona.jTblPersonas.getValueAt(fila, 3)));
                this.vtnTipoPersona.jTextMovil.setText(String.valueOf(
                        this.vtnTipoPersona.jTblPersonas.getValueAt(fila, 4)));
                this.vtnTipoPersona.jTextDireccion.setText(String.valueOf(
                        this.vtnTipoPersona.jTblPersonas.getValueAt(fila, 5)));
                this.vtnTipoPersona.jTextEmail.setText(String.valueOf(
                        this.vtnTipoPersona.jTblPersonas.getValueAt(fila, 6)));
                this.vtnTipoPersona.jTextContacto.setText(String.valueOf(
                        this.vtnTipoPersona.jTblPersonas.getValueAt(fila, 7)));
                this.vtnTipoPersona.jTextWeb.setText(String.valueOf(
                        this.vtnTipoPersona.jTblPersonas.getValueAt(fila, 8)));
                this.vtnTipoPersona.jTextDocumento.setEditable(false);
                this.vtnTipoPersona.jTextNombre.setEditable(false);
                this.vtnTipoPersona.jTextFlApellido.setEditable(false);
                this.vtnTipoPersona.jTextTelefono.setEditable(false);
                this.vtnTipoPersona.jTextMovil.setEditable(false);
                this.vtnTipoPersona.jTextDireccion.setEditable(false);
                this.vtnTipoPersona.jTextEmail.setEditable(false);
                this.vtnTipoPersona.jTextContacto.setEditable(false);
                this.vtnTipoPersona.jTextWeb.setEditable(false);
               
                 
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
            
            case __VER_PERSONA:{
                this.vtnTipoPersona.jTblPersonas.setModel(this.modelo.getTablaPersonas());
                this.vtnTipoPersona.jTblPersonas.requestFocus();
                break;
            }
            case __ADICIONAR_PERSONA:{
                this.vtnTipoPersona.jTextDocumento.setEditable(true);
                this.vtnTipoPersona.jTextNombre.setEditable(true);
                this.vtnTipoPersona.jTextFlApellido.setEditable(true);
                this.vtnTipoPersona.jTextTelefono.setEditable(true);
                this.vtnTipoPersona.jTextMovil.setEditable(true);
                this.vtnTipoPersona.jTextDireccion.setEditable(true);
                this.vtnTipoPersona.jTextEmail.setEditable(true);
                this.vtnTipoPersona.jTextContacto.setEditable(true);
                this.vtnTipoPersona.jTextWeb.setEditable(true);
                this.vtnTipoPersona.jTextDocumento.requestFocus();
                this.vtnTipoPersona.jTextDocumento.setText("");
                this.vtnTipoPersona.jTextNombre.setText("");
                this.vtnTipoPersona.jTextFlApellido.setText("");
                this.vtnTipoPersona.jTextTelefono.setText("");
                this.vtnTipoPersona.jTextMovil.setText("");
                this.vtnTipoPersona.jTextDireccion.setText("");
                this.vtnTipoPersona.jTextEmail.setText("");
                this.vtnTipoPersona.jTextContacto.setText("");
                this.vtnTipoPersona.jTextWeb.setText("");
                
                break;
            }
            case __AGREGAR_PERSONA:{
              if (this.modelo.NuevaPersona(
                      this.vtnTipoPersona.jTextDocumento.getText(),
//                    this.vtnTipoPersona.jCbBoxDepartamento.getSelectedItem().toString(),
//                    this.vtnTipoPersona.jCbBoxCiudades.getSelectedItem().toString(),
                      this.vtnTipoPersona.jTextNombre.getText(),
                      this.vtnTipoPersona.jTextFlApellido.getText(),
                      this.vtnTipoPersona.jTextTelefono.getText(),
                      this.vtnTipoPersona.jTextMovil.getText(),
                      this.vtnTipoPersona.jTextDireccion.getText(),
                      this.vtnTipoPersona.jTextEmail.getText(),
                      this.vtnTipoPersona.jTextContacto.getText(),
                      this.vtnTipoPersona.jTextWeb.getText(),
                      this.vtnTipoPersona.HallarSexo(),
                      this.vtnTipoPersona.HallarPersona())) {
                  this.vtnTipoPersona.jTblPersonas.setModel(this.modelo.getTablaPersonas());
                  JOptionPane.showMessageDialog(vtnTipoPersona, "Persona  Creada!.");
                  this.vtnTipoPersona.jTextDocumento.setText("");
//                  this.vtnTipoPersona.jCbBoxDepartamento.getSelectedItem().toString();
//                  this.vtnTipoPersona.jCbBoxCiudades.getSelectedItem().toString();
                  this.vtnTipoPersona.jTextNombre.setText("");
                  this.vtnTipoPersona.jTextFlApellido.setText("");
                  this.vtnTipoPersona.jTextTelefono.setText("");
                  this.vtnTipoPersona.jTextMovil.setText("");
                  this.vtnTipoPersona.jTextDireccion.setText("");
                  this.vtnTipoPersona.jTextEmail.setText("");
                  this.vtnTipoPersona.jTextContacto.setText("");
                  this.vtnTipoPersona.jTextWeb.setText("");
//                  this.vtnTipoPersona.HallarSexo();
//                  this.vtnTipoPersona.HallarPersona();
            } else JOptionPane.showMessageDialog(vtnTipoPersona,"Datos Incorrectos!.");
            break;
            }
            
            case __ELIMINAR_PERSONA:{
                if(this.modelo.EliminarPersona(this.vtnTipoPersona.jTextDocumento.getText())){
                         this.vtnTipoPersona.jTblPersonas.setModel(this.modelo.getTablaPersonas());
                JOptionPane.showMessageDialog(vtnTipoPersona, "Persona Eliminada.");
                this.vtnTipoPersona.jTextDocumento.setText("");
                this.vtnTipoPersona.jTextNombre.setText("");
                this.vtnTipoPersona.jTextFlApellido.setText("");
                this.vtnTipoPersona.jTextTelefono.setText("");
                this.vtnTipoPersona.jTextMovil.setText("");
                this.vtnTipoPersona.jTextDireccion.setText("");
                this.vtnTipoPersona.jTextEmail.setText("");
                this.vtnTipoPersona.jTextContacto.setText("");
                this.vtnTipoPersona.jTextWeb.setText("");
             }
          break;
           }
            case __INTEMSELECTED:{                    
                    llenarCbMpios();
                    break;       
                } 
        }
    }
}
