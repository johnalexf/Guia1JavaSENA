/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;

/**
 *
 * @author johna
 */
public class Boletin1Ejercicio7 {
    
    public static void solucion(){
    
        System.out.println("Programa para pedir dos numeros y decir cual es mayor");
        
        int numero1, numero2;
        
        System.out.print("Escribir el primer numero = ");
        numero1 = Entrada.entero();
        System.out.print("Escribir el segundo numero = ");
        numero2 = Entrada.entero();
        
        if(numero1 > numero2){
            System.out.printf("El numero mayor es %d %n", numero1);
        }else{
            if( numero2 > numero1){
                System.out.printf("El numero mayor es %d %n", numero2);
            }else{
                System.out.println("Los numeros son iguales");
            }
        
        }
        
    }
    
    
}
