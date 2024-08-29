/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_5_entrada_de_datos;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_5_ENTRADA_DE_DATOS {

    public static void main(String[] args) {
        String nombre;
        //CAPTURA DE DATOS TECLADO
        //Scanner---
        // Scanner : es un tipo de dato
        
        Scanner cap; //incorporar la herramienta 
 cap= new Scanner (System.in);
 
 
 // DAR INSTRUCCION
 System.out.println("Introduce tu nombre");
 // Capturar
 
 nombre = cap.nextLine();
 
 
// imprimir
System.out.println("----------------DATOS CAPTURURADOS-----------------");
  System.out.println(nombre);
    }
}
