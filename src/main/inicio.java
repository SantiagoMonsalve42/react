/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import modelo.relojCPU;

/**
 *
 * @author Santiago monsalve
 */
public class inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        relojCPU objprocesos = new relojCPU();
        objprocesos.iniciar();
        objprocesos.start();
        
    }
    
}
