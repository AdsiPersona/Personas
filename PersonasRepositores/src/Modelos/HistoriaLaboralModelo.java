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
public class HistoriaLaboralModelo extends Conexion{
    
    
    
    public  DefaultTableModel getTablaHistorial(String Documento){
        MiModelo tableModel = new MiModelo();
        int Registros = 0;
        String[] ColumNames = {"Documento","Nombre"};
        String sql = "SELECT count(*) as Total FROM empleados where documento = '"+Documento+"';";
                    
                
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            ResultSet Resultado = pstm.executeQuery();
            Resultado.next();
            Registros = Resultado.getInt("Total");
            Resultado.close();                                 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
          Object[][] data = new String[Registros][3];
          try {
              sql = "SELECT Documento   FROM Empleados "
                  + "where documento = '"+Documento+"';";
              
              PreparedStatement pstm = this.getConexion().prepareStatement(sql);
              ResultSet resultado = pstm.executeQuery();
              int i=0;
              while(resultado.next()){
                  data[i][0] = resultado.getString("Documento");
                  data[i][1] = resultado.getString("Nombre");
                  i++;                  
              }
              resultado.close();
              
              tableModel.setDataVector(data, ColumNames);
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, e.getMessage());
          }
          
          return tableModel;
      }
   
    public DefaultTableModel getTablaHistorial(){
        MiModelo tableModel = new MiModelo();
       int registros = 0;
       String[] columNames = {"Documento","Fecha Ingreso","Codigo del Cargo","Codigo de la Oficina","Fecha Egreso"};
       
        try {
            PreparedStatement pstm =this.getConexion().prepareStatement("SELECT "
            + "count(*) as total FROM historial_laboral;");
            ResultSet resultado = pstm.executeQuery();
            resultado.next();
            registros = resultado.getInt("total");
            resultado.close();          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
   
        Object[][] data = new String[registros][5];
        try {
            String sql =  "SELECT * FROM historial_laboral;";
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            ResultSet resultado = pstm.executeQuery();
            int i = 0;
            while(resultado.next()){
                data[i][0] = resultado.getString("Documento");
                data[i][1] = resultado.getString("Fech_Ingr");
                data[i][2] = resultado.getString("Codi_Carg");
                data[i][3] = resultado.getString("Codi_Ofic");
                data[i][4] = resultado.getString("Fech_Egre");
                i++;
            }
            resultado.close();
            tableModel.setDataVector(data, columNames);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }                                                                      
        return tableModel;
    }
    
    public boolean NuevoHistorial(String Documento, String Nombre, String Fech_Ingr, String Codi_Carg, String Nom_Ofic , String Fech_Egre ){        
        if(valida_datos(Documento, Nombre, Fech_Ingr , Codi_Carg, Nom_Ofic, Fech_Egre)){                       
            String CodigoC = codigoCargo(Codi_Carg);
            String CodigoO = codigoOficina(Nom_Ofic);
            
            String sql;
            if (Fech_Egre == null){
                sql = "insert into historial_laboral(Documento, Fech_Ingr, Codi_Carg, Codi_Ofic ) values('"+Documento+"','"+Fech_Ingr+"','"+CodigoC+"','"+CodigoO+"');";
            }else{
                sql = "insert into historial_laboral(Documento, Fech_Ingr, Codi_Carg, Codi_Ofic, Fech_Egre) values('"+Documento+"','"+Fech_Ingr+"','"+CodigoC+"','"+CodigoO+"','"+Fech_Egre+"');";
            }
            
            System.out.println(sql);
      
          
                    
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
    
    public String TraerNombre(String Documento){
         String nombre = "";
        
        String sql = "select concat(p.nombres,\" \",p.apellidos)as nombreempleado from personas p join "
                + "historial_laboral h on (p.documento = h.documento) where h.documento = '"+Documento+"';";
               
        try{
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();         
            while(resultado.next()){
               nombre = resultado.getString("nombreempleado");
            }
            resultado.close();
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }                
        return nombre;
    }
    
    public String codigoCargo(String Nomb_Carg){
        String cargos = "";
        
        String sql = "select Codi_Carg from cargos where Nomb_Carg = '"
                +Nomb_Carg+"';" ;
        try{
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();         
            while(resultado.next()){
                cargos = resultado.getString("Codi_Carg");
            }
            resultado.close();
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }                
        return cargos;
    }

    public String[] LlenarComboBoxCargos(){
        String SQL = "Select Codi_Carg From cargos;";
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

        SQL = "Select Nomb_Carg From cargos order by Codi_Carg;";

        try {
            PreparedStatement Sentencia = this.getConexion().prepareStatement(SQL);
            ResultSet Resultado = Sentencia.executeQuery();
            i = 0;
            while(Resultado.next()){
              Combo[i] = Resultado.getString("Nomb_Carg");            
              i++;
            }
            Resultado.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Combo;  
    }
    
        
    public String codigoOficina(String Nomb_Ofic){
            /**
        String oficina = "";
        
        String sql = "select Codi_Ofic from oficinas where Nomb_Ofic = '"
                +Nomb_Ofic+"';" ;        
        try{            
            PreparedStatement Sentencia = this.getConexion().prepareStatement(sql);            
            ResultSet resultado = Sentencia.executeQuery();                     
            while(resultado.next()){                
                oficina = resultado.getString("Codi_Ofic");
            }
            resultado.close();
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }                
        return oficina;
        * */            
        String oficina = "";
        
        String sql = "select Codi_Ofic from oficinas where Nomb_Ofic = '"
                +Nomb_Ofic+"';";
        
        JOptionPane.showMessageDialog(null, "Sentencia sql: "+sql);
        
        try{
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();         
            while(resultado.next()){
                oficina = resultado.getString("Codi_Ofic");
            }
            resultado.close();
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }         
        
        JOptionPane.showMessageDialog(null, "Código retornado: "+oficina);
        
        return oficina;
        }

        public String[] LlenarComboBoxOficina(){
        int i = 0;
        String SQL = "Select Codi_Ofic From oficinas;";
        

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

       SQL = "Select Nomb_Ofic From oficinas order by Codi_Ofic;";

        try {
            PreparedStatement Sentencia = this.getConexion().prepareStatement(SQL);
            ResultSet Resultado = Sentencia.executeQuery();
            i = 0;
            while(Resultado.next()){
              Combo[i] = Resultado.getString("Nomb_Ofic");            
              i++;
            }
            Resultado.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Combo;  
    }
    
    
    public boolean EliminarHistorial(String Documento){
        boolean resultado = false;
        
        String sql = "DELETE FROM historial_laboral WHERE Documento ='"+Documento+"';";
        
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
    
    
    
    public boolean valida_datos(String Documento, String Nombre, String Fech_Ingr, String Codi_Carg, String Codi_Ofic, String Fech_Egre){        
        if(Documento.length() > 0 && Nombre.length() > 0 && Fech_Ingr.length() > 0 && Codi_Carg.length() > 0 && Codi_Ofic.length() > 0 ){
            return true;
        }else{
            return false;
        }
    }        
}
