/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_8_PELICULA {

    public static void main(String[] args) {
        String Nombre;
        String genero;
        double duracion;
                String rep;
        String cla;
                
                Scanner can;
                  can=  new Scanner  (System.in);
             
              
            System.out.println("Captura el nombre ");
            
        Nombre= can.nextLine();
          
        System.out.println("Captura genero");
           
        genero= can.nextLine();
           
      
           
           System.out.println("Captura el reparto");
           
           rep=can.nextLine();
           
           
           System.out.println("Captura la clasificacion");
           
           cla= can.nextLine();
     
            System.out.println("Captura la duracion");
          
           duracion = can.nextDouble();
           
           
           
/////DATOS DE COMPRA/////
              System.out.println("/////PELICULA DEL AÑO!!!/////");
                         
              System.out.println(Nombre);
              
              System.out.println(genero);
                                                 
              System.out.println(duracion);
                                                            
              System.out.println(rep);
             
              
           
    }
}
