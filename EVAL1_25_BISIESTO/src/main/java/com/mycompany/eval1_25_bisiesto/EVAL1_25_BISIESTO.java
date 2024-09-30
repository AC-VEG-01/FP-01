/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_25_BISIESTO {

    public static void main(String[] args) {
        int year;
         Scanner cap= new Scanner (System.in);
              System.out.println("Ingresa el year:");
       year= cap.nextInt();
       
        if(year %4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( year + " es bisiesto");
        } else {
            System.out.println( year + " no es bisiesto");
        
    
               
}
    }
}