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
public class Ejercicio3 {
    public static void main(String[] args) {
       // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
         // declaro las variables
        double costoporminuto;
        double minutosconsumidos;
        double resultado;
    // pido datos por teclado - entradas    
     System.out.println("Ingrese el costo por minutos ");
    costoporminuto = entrada.nextDouble();
    System.out.println("Ingrese el numero de minutos consumidos en el mes ");
    minutosconsumidos = entrada.nextDouble();
    
    // proceso
    resultado = costoporminuto * minutosconsumidos;
    
   //salida
   System.out.printf("minutosconsumidos:" +resultado);
    }
    
}
