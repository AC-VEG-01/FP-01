/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_21_meses_year;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_21_MESES_YEAR {

    public static void main(String[] args) {
         int mess;
        Scanner cap = new Scanner(System.in);
        System.out.println("Captura el numero de meses 1 a 12:");
        mess= cap.nextInt();
        cap.nextLine();
        
        if (mess==1){
            System.out.println("Enero");
                    } else if(mess == 2){
             System.out.println("Febrero");
                  } else if(mess == 3){
             System.out.println("Marzo");
                  } else if(mess == 4){
             System.out.println("Abril");
                  } else if(mess == 5){
             System.out.println("Mayo");
                  } else if(mess == 6){
             System.out.println("Junio");
                  } else if(mess == 7){
                        System.out.println("Julio");
                    } else if(mess == 8){
             System.out.println("Agosto");
                  } else if(mess == 9){
             System.out.println("Septiempre");
                  } else if(mess == 10){
             System.out.println("Octubre");
                  } else if(mess == 11){
             System.out.println("Noviembre");
                  } else if(mess == 12){
             System.out.println("Diciembre");
             
             System.out.println("");
                  }else{ 
                      System.out.println("Numero de mes incorrecto!!!");
    }
    }
}