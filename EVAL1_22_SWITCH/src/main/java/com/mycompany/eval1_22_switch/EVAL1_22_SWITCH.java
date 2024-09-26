/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_22_switch;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_22_SWITCH {

    public static void main(String[] args) {
         int diass;
        Scanner cap = new Scanner(System.in);
        System.out.println("Captura el numero del dia 1 a 7:");
        diass= cap.nextInt();
        cap.nextLine();
        
        switch(diass){
            case 1:
                System.out.println("Domingo");
               
                 case 2:
                System.out.println("Lunes");
                break;
                 case 3:
                System.out.println("Martes");
                break;
                 case 4:
                System.out.println("Miercoles");
                break;
                 case 5:
                System.out.println("Jueves");
                break;
                 case 6:
                System.out.println("Viernes");
                break;
                 case 7:
                System.out.println("Sabado");
                break;
                 default:
                           System.out.println("NO ES UN NUMERO VALIDO!!!");        }
        
            
    }
}
