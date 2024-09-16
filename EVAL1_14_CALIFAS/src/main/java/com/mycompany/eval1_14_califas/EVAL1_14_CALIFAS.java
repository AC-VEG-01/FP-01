/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_14_califas;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_14_CALIFAS {
    
    
  
    public static void main(String[] args) {
         int cali;
      System.out.println("INGRESE SU CALIFICACION");
     Scanner cap = new Scanner (System.in);
                 cali=cap.nextInt();
                if (cali>=7) {  
                    System.out.println("USTED APROBO CON: " + cali);
                }
                else{
                    System.out.println("USTED REPROBO CON:" + cali);
    }
    }
}
