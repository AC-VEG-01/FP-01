/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_17_contrasena;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL1_17_CONTRASENA {

    public static void main(String[] args) {
//Crear varuables y capturar usuario y contraseña

           String usr,psw;
           Scanner cap=new  Scanner (System.in);
           System.out.println("usuario");
           usr= cap.nextLine();
           System.out.println("contraseña");
           psw= cap.nextLine();
 
           if(usr.equals("Admin ") && psw.equals ("1234")){
        System.out.println("Acceso concedido");
        
    }else{
            System.out.println("Acceso denegado");
            
            }
    }
           
    }

