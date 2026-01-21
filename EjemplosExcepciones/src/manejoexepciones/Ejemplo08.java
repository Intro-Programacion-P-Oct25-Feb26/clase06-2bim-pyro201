/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo08 {
    
    public static void main(String[] args) {
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese valor 1:");
            int valor1 = entrada.nextInt(); // se espera un valor entero
            
        }
        catch(Exception e){
            
            System.out.printf(" Lo sentimos hay un error de tipo %s\n", e);
        
        }
        
        
               
    }
}
