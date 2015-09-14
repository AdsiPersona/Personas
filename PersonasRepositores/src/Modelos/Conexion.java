package Modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sala319
 */
public class Conexion {
    private String db = "correspondencia";
    private String user = "root";
    private String clave = "";
    private String driver ="com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/"+this.db;
    private Connection conexion = null;
    
    public Conexion(){
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(this.url, this.user, this.clave );
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
   public Connection getConexion(){
       return this.conexion;
   }
    public Connection Conectar(){
        
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url+db,user,clave);
            
            
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null, "Problemas con la BD: "+ex.getMessage());
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en el Driver: "+ex.getMessage());
        }
        
        return conexion;
    }
    
    public void desconectar(){
        conexion = null;
    }
}


