/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * import java.util.Scanner;
 *
 *
 * @author A S U S
 */
public class Ejercicio {

    public static void main(String[] args) {
        int val = valor_1();
        int val_2 = valor_1();
        int suma=sum(val,val_2);
        imprimir(val,val_2,suma);
    }

    public static int valor_1() {
        int valor=0;
        boolean bandera = true;
        try {
            
            while (bandera) {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese valor:");
                valor = entrada.nextInt();
                if (valor < 0 || valor % 2 == 1) {
                    throw new Exception("valor invalido");
                }
                bandera = false;
            }
        } catch (Exception e) {
            System.out.printf("Lo sentimos hay un error del tipo %s\n",e);
        }
        return valor;
    }
    public static int sum(int a , int b){
        int suma= a+b;
        return suma;
    }
     public static void imprimir(int a, int b, int c){
         System.out.printf("se han ingresado los valores de %s y %s, cuya suma "
                 + "es: %s",a,b,c);
     }
}
