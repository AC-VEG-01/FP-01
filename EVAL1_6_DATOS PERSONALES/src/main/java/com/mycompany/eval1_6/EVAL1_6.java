/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_6;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_6 {

    public static void main(String[] args) {
        String nombre;
        String curpo;
        int edad;
        double promedio;
        
        
        Scanner captu;
        captu=new Scanner (System.in);
        
        //CAPTURAR
        System.out.println("Captura tu nombre completo");
        nombre= captu.nextLine();
          System.out.println("Captura tu CURP");
           curpo= captu.nextLine();
            System.out.println("Captura tu edad");
           edad = captu.nextInt();
            System.out.println("Captura tu promedio");
           promedio = captu.nextDouble();
           /// DATOS 
           System.out.println("////////////////DATOS////////////////");
             System.out.println(nombre);
               System.out.println(curpo);
                 System.out.println(edad);
                   System.out.println(promedio);
           
           
    }
}
