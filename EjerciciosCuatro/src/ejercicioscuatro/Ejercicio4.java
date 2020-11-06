/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio4 {
    public static void main(String[] args) {
       // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
     // declaro las variables
    int CPU;
    int teclado;
    int pantalla;
    int raton;
    int suma;
   // pido datos por teclado - entradas  
  System.out.println("Ingrese el valor del CPU");
  CPU = entrada.nextInt();
  
  System.out.println("Ingrese el valor del teclado");
  teclado = entrada.nextInt();
  
  System.out.println("Ingrese el valor de la patalla");
  pantalla = entrada.nextInt();
  
  System.out.println("Ingrese el valor del raton");
  raton = entrada.nextInt();
  
  // proceso
  suma = CPU + teclado + pantalla + raton;
          
  // salida
  System.out.printf("el costo de la computadora es:" +suma);
  
  
    } 
}
