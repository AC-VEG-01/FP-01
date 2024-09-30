/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL_19_OPERADOR_OR {
   
    
    

    public static void main(String[] args) {
       int km ,meses;
    Scanner cap=new Scanner(System.in);
    
    System.out.println("Captura el kilometraje");
    
  km=cap.nextInt();
  cap.nextLine();
   System.out.println("Captura los meses");
    
  meses=cap.nextInt();
  cap.nextLine();
  if(km>=5000||meses>= 6 ){
      System.out.println("Cambio de aceite");
  }else{
      System.out.println("El vehiculo esta en exelente estado");
  }
    }
}
