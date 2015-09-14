/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Controladores.MiModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sala319
 */
public class TipoPersonaModelo extends Conexion{
   
    public DefaultTableModel getTablaPersonas(){
        MiModelo tableModel = new MiModelo();
       int registros = 0;
       String[] columNames = {"Documento","Nombre_Apellido","Email","Direccion"};
       
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT "
            + "count(*) as total FROM personas;");
            ResultSet resultado = pstm.executeQuery();
            resultado.next();
            registros = resultado.getInt("total");
            resultado.close();          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        Object[][] data = new String[registros][4];
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * "
            + " FROM personas;");
            ResultSet resultado = pstm.executeQuery();
            int i = 0;
            while(resultado.next()){
                data[i][0] = resultado.getString("Documento");
                data[i][1] = resultado.getString("Nombres");
                data[i][2] = resultado.getString("Email");
                data[i][3] = resultado.getString("Direccion");
                i++;
            }
            resultado.close();
            tableModel.setDataVector(data, columNames);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return tableModel;
    }
        
    public boolean NuevaPersona(String Documento, String Nombre, String Apellido, 
                                String Telefono, String Movil, String Direccion, 
                                String Email, String Contacto, String Web, char sexo, String tipopersona ){
        boolean bandera = false;
        String sql="";        
        sql = "insert into personas(Documento, Nombres,Apellidos,Direccion,Tele_Fijo,Tele_Movi, Email, Codi_Mpio)"+
                     "values('"+Documento+"','"+Nombre+"','"+Apellido+"','"+Direccion+"','"+Telefono+"','"+Movil+"','"+Email+"',85); ";
        try {            
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            pstm.execute();
            pstm.close();       
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        sql="";
        if (tipopersona=="N"){                       
           if(valida_datos_Natural(Documento, Nombre, Apellido, Telefono, Movil, Direccion, Email, sexo)){
               sql = "INSERT INTO naturales (documento,sexo) VALUES ('"+Documento+"','"+sexo+"')";
           }
        }else if (tipopersona=="J"){            
            if(valida_datos_Juridica(Documento, Nombre, Telefono, Movil, Direccion, Email, Contacto, Web)){
                sql ="INSERT INTO juridicas (documento,contacto,Web) VALUES ('"+Documento+"','"+Contacto+"','"+Web+"')";
            }
        }  
        System.out.println(sql);
        try {            
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            pstm.execute();
            pstm.close();            
            bandera = true;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return bandera;
    }
      
    
    public String[] LlenarComboDeptos(){
    String[] dptos = new String[33];
    
    String sql = "select Nomb_Dpto from departamentos order by Nomb_Dpto;";
    
        try {
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
            int i = 0;
            while(resultado.next()){
                dptos[i] = resultado.getString("Nomb_Dpto");
                i++;
            }
            resultado.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dptos;
}
   
     public String[] LlenarComboMpios(String codi_dpto){
        int i = 0;
        String sql = "select Nomb_Mpio from ciudades "
                   + "where Codi_Dpto = '"+codi_dpto+"' "
                   + "order by Codi_Mpio;";

        try{
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();           
            while(resultado.next()){
                i++;
            }
            resultado.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        String[] mpios = new String[i];

        try{
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
            i = 0;
            while(resultado.next()){
                mpios[i] = resultado.getString("Nomb_Mpio");
                i++;
            }
            resultado.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return mpios;
    }
    
    
    public String codigoDpto(String dpto){
        String codigodpto = "";
        
        String sql = "select Codi_Dpto from departamentos where Nomb_Dpto = '"+dpto+"';";
        try {
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                codigodpto = resultado.getString("Codi_Dpto");
            }
            resultado.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       return codigodpto;
    }
    
   
    
    public boolean EliminarPersona(String Documento){
        boolean resultado = false;
        String sql = "DELETE FROM personas WHERE documento ='"+Documento+"';";
        
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            pstm.execute();
            pstm.close();
            resultado = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    
    
    public boolean valida_datos_Natural(String Documento, String Nombre, String Apellido, String Telefono, String Movil, String Direccion, String Email, char sexo){
        if(Documento.length()> 0 && Nombre.length() > 0 && Apellido.length() > 0 && Telefono.length() > 0 && Movil.length() > 0 && Direccion.length() > 0 && Email.length() > 0){
           return true; 
        }else{
           return false;       
        }
    }
    
    public boolean valida_datos_Juridica(String Documento, String Nombre, String Telefono, String Movil, String Direccion, String Email, String Contacto, String Web){
        if(Documento.length()> 0 && Nombre.length() > 0 && Telefono.length() > 0 && Movil.length() > 0 && Direccion.length() > 0 && Email.length() > 0 && Contacto.length() > 0 && Web.length() > 0){
           return true; 
        }else{
           return false;       
        }
    }    
}
