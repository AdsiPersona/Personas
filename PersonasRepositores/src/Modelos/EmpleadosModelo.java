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
public class EmpleadosModelo extends Conexion{
   
    public DefaultTableModel getTablaPersonas(){
        MiModelo tableModel = new MiModelo();
       int registros = 0;
       String[] columNames = {"Documento","Fech_Nato","Email_Inst","Codi_Rol"};
       
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT "
            + "count(*) as total FROM empleados;");
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
            + " FROM empleados;");
            ResultSet resultado = pstm.executeQuery();
            int i = 0;
            while(resultado.next()){
                data[i][0] = resultado.getString("Documento");
                data[i][1] = resultado.getString("Fech_Nato");
                data[i][2] = resultado.getString("Email_Inst");
                data[i][3] = resultado.getString("Codi_Rol");
                i++;
            }
            resultado.close();
            tableModel.setDataVector(data, columNames);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return tableModel;
    }
        
    public boolean NuevoEmpleado(String Documento, String Nombre,String Fech_Nato,String Apellido, String Telefono, String Movil, String Email_Inst, String Codi_Rol){
        if(valida_datos(Documento, Nombre, Fech_Nato, Apellido, Telefono, Movil, Email_Inst, Codi_Rol)){
            
            Integer codigoR = codigoRol(Codi_Rol);
            
            JOptionPane.showMessageDialog(null, codigoR);
            
            String sql = "insert into empleados(Documento , Codi_Rol, Fech_Nato, Email_Inst"
                   + " ) values('"+Documento+"',"+codigoR+",'"+Fech_Nato+"','"+Email_Inst+"');";
            
            JOptionPane.showMessageDialog(null, sql);
            
            try {
                PreparedStatement pstm = this.getConexion().prepareStatement(sql);
                pstm.execute();
                pstm.close();
                return true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return false;
        }
        else
            return false;
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
    
     private Integer codigoRol(String Nomb_Rol){
        Integer roles = 0;
        
        String sql = "select Codi_Rol from roles where Nomb_Rol = '"
                +Nomb_Rol+"';" ;
        try{
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();         
            while(resultado.next()){
                roles = Integer.parseInt(resultado.getString("Codi_Rol"));
            }
            resultado.close();
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }                
        return roles;
    }
    
    public String[] LlenarComboBoxRoles(){
        String SQL = "Select Codi_Rol From roles;";
        int i = 0;

        try {
            PreparedStatement Sentencia = this.getConexion().prepareStatement(SQL);
            ResultSet Resultado = Sentencia.executeQuery();                
            while(Resultado.next()){                  
                i++;
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        String[] Combo = new String[i];

        SQL = "Select Nomb_Rol From roles order by Codi_Rol;";

        try {
            PreparedStatement Sentencia = this.getConexion().prepareStatement(SQL);
            ResultSet Resultado = Sentencia.executeQuery();
            i = 0;
            while(Resultado.next()){
              Combo[i] = Resultado.getString("Nomb_Rol");            
              i++;
            }
            Resultado.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Combo;  
    }
   
    
    public boolean valida_datos(String Documento, String Nombre,String Fech_Nato, String Apellido, String Telefono, String Movil, String Email_Inst, String Codi_Rol){
        if(Documento.length()> 0 && Nombre.length() > 0 && Fech_Nato.length() > 0 && Apellido.length() > 0 && Telefono.length() > 0 && Movil.length() > 0 &&  Email_Inst.length() > 0 &&  Codi_Rol.length() > 0){
         return true; 
        }else{
           return false;       
            }
        }    
}
