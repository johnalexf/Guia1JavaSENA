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
public class Boletin1Ejercicio9 {
    
    public static void solucion(){
    
        System.out.println("Programa para pedir dos numeros y ordenarlos de mayor a menor");
        
        int numero1, numero2;
        
        System.out.print("Escriba el primer numero = ");
        numero1 = Entrada.entero();
        
        System.out.print("Escriba el segundo numero = ");
        numero2 = Entrada.entero();
        
        
        System.out.println("Los numeros ordenados quedan asi:");
        if( numero1 > numero2 ){
            System.out.printf(" %d y %d  %n ", numero1, numero2);
        }else{
            System.out.printf(" %d y %d", numero2, numero1);
        }
        
        
        
    }
}
