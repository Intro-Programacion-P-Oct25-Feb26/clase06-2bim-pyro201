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

    }

    public static int valor_1() {
        boolean bandera = true;

        while (bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt(); // se espera un valor entero 
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt(); // se espera un valor entero // 0
                int resultado = valor1 / valor2;

                System.out.printf("Resultado %d\n", resultado);
                bandera = false;
                /* se le pedira al  usuario ingrese valores validos que son 2
                valores enteros, si ingresa otra cosa el coodigo volvera a pedir
                los valores*/
            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
            } catch (ArithmeticException arithmeticException) {

                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);

            }
        }

    }
