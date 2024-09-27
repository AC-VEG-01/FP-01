/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_18_RANGOS {

    public static void main(String[] args) {
        int cali;
                Scanner cap= new Scanner (System.in);
                System.out.println("Introduce la calficacion:");
                cali=cap.nextInt();
                
               if(cali>=0 && cali<100 ){
                   System.out.println("CALIFICACION VALIDA");
                           }else{
                   System.out.println("CALIFICACION NO VALIDA");
               }
          
    }
}
