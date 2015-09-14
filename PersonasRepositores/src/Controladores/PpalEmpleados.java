/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vista.FrmEmpleados;

/**
 *
 * @author Sala319
 */
public class PpalEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        iniciar();
    }
      public  static void iniciar(){
         new ControladoresEmpleados(new FrmEmpleados()).Iniciar();
    }
    
}
