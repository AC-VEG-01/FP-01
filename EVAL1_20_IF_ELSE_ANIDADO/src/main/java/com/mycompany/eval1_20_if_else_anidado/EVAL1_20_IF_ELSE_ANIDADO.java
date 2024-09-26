/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_20_IF_ELSE_ANIDADO {

    public static void main(String[] args) {
        int diass;
        Scanner cap = new Scanner(System.in);
        System.out.println("Captura el numero del dia 1 a 7:");
        diass= cap.nextInt();
        cap.nextLine();
        
        if (diass==1){
            System.out.println("Domingo");
                    } else if(diass == 2){
             System.out.println("Lunes");
                  } else if(diass == 3){
             System.out.println("Martes");
                  } else if(diass == 4){
             System.out.println("Miercoles");
                  } else if(diass == 5){
             System.out.println("Jueves");
                  } else if(diass == 6){
             System.out.println("Viernes");
                  } else if(diass == 7){
             System.out.println("Sabado");
                  }else{ 
                      System.out.println("Numero de dia incorrecto!!!");
}
        
    }
}
