/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_13_if;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_13_IF {

    public static void main(String[] args) {
       //CAPTUREN LA EDAD
       int edad;
         
       Scanner cap= new Scanner (System.in);
              System.out.println("INGRESA TU EDAD:");
       edad= cap.nextInt();
       

      if (edad >= 18) {
        
              System.out.println("USTED ES MAYOR DE EDAD");
                      
    }else {
    System.out.println("USTED ES MENOR DE EDAD");
     
            }
    }
    
}
