/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_24_calificacion;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_24_CALIFICACION {

    public static void main(String[] args) {
       int cali;
            System.out.println("Ingrese su calficicacion:");
               Scanner cap= new Scanner(System.in);
              cali= cap.nextInt();
               cap.nextLine();
             if(cali>=90 && cali<100 ){
            System.out.println("Su calificacion es de A");
                  } else if(cali>=80 && cali<89){
                               System.out.println("Su calificacion es de B");
                                } else if(cali>=70 && cali<79){
                               System.out.println("Su calificacion es de C");
                                } else if(cali>=60&& cali<69){
                               System.out.println("Su calificacion es de D");
                                } else if(cali<=59){
                               System.out.println("Su calificacion es de F");
               }
           
                           
    }
}
