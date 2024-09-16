/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_12_FORMULAS {

    
    public static void main(String[] args) {
        double Vo,d,a,t;
        Scanner cap=new Scanner (System.in);
       System.out.println("Velocidad inicial:");
        Vo=cap.nextDouble();
            System.out.println("Aceleracion:");
        a=cap.nextDouble();
            System.out.println("Tiempo:");
        t=cap.nextDouble();        
        d= Vo*t+ (a*t*t)/2;
        
          System.out.println("Distancia=" + d);
        
        
        
         
    }
}
