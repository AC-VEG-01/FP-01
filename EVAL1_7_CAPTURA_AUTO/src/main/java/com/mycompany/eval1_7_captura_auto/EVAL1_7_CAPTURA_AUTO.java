/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_7_CAPTURA_AUTO {

    public static void main(String[] args) {
       Scanner cap;
       
      String marca;
      String modelo;
              int año;
              double precio;
              
             cap=  new Scanner  (System.in);
             
              
            System.out.println("Captura la marca");
            
        marca= cap.nextLine();
          
        System.out.println("Captura modelo");
           
        modelo= cap.nextLine();
           
           System.out.println("Captura el year");
          
           año = cap.nextInt();
           
           System.out.println("Captura el precio");
           
           precio = cap.nextDouble();
           
             /////DATOS DE COMPRA/////
              System.out.println("/////DATOS DE COMPRA/////");
                         
              System.out.println(marca);
              
              System.out.println(modelo);
                                                 
              System.out.println(año);
                                                            
              System.out.println(precio);
             
    }
}
