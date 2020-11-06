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
public class Ejercicio5 {
    public static void main(String[] args) {
       // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
       // declaro las variables  
       double prestamo;
       double interes;
       double multiplicacion;
       double suma;
       double tiempo;
       
        // declaro las variables
        System.out.println("Ingrese el valor del prestamo");
        prestamo = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del interes");
        interes = entrada.nextDouble();
        
        System.out.println("Ingrese el tiempo del prestamo");
        tiempo = entrada.nextDouble();
        
        // proceso
        multiplicacion = prestamo * tiempo;
        suma = multiplicacion + interes;
        
       // salida
       System.out.printf("el pago mensual de del préstamo es:" +suma);
                
               
               
       

    }      
}
