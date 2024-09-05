/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_10_conversiones;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_10_CONVERSIONES {

    public static void main(String[] args) {
       double farh,cent,kep;
       Scanner cap=new Scanner (System.in);
       System.out.println("Captura los Fahrenheit:");
       farh= cap.nextDouble();
       cent=(farh-32)/1.8;
       System .out.println("C = "+cent);
       
       System.out.println("Captura los Celcius:");
        cent= cap.nextDouble();
               farh=(cent*9/5)+32;
                  System .out.println("F= "+farh); 
                  
                   System.out.println("Captura los Celcius:");
        cent= cap.nextDouble();
               kep=(cent+273.15);
                  System .out.println("K= "+kep); 
                  
                  
                   System.out.println("Captura los Fahrenheit:");
        farh= cap.nextDouble();
               kep=(farh-32)/5/9;
                  System .out.println("K= "+kep); 
                  
               
       
       
       
       
    }
}
