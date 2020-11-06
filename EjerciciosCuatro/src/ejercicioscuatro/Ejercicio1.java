/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        double base;
        double altura;
        double multiplicacion;
        double area;
     
       
    
        System.out.println("Ingresar la base del triangulo");
        base = entrada.nextDouble();
        
        System.out.println("Ingresar la altura del triangulo");
        altura = entrada.nextDouble();
        
        
        multiplicacion = base * altura;
        area = multiplicacion / 2;
        
        System.out.printf("el area del triangulo es: " + area);       
        
        
    }
    
}
