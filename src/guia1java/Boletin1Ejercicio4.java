/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;

/**
 *
 * @author JOHN FORERO
 */
public class Boletin1Ejercicio4 {
    
    public static void solucion(){
    
        double numero1 = 0, numero2 = 0;
        
        System.out.println("Programa para comparar dos numeros y determinar si son iguales o no");
        
        System.out.print("Digite el primer numero  =  ");
        numero1 = Entrada.real();
        System.out.print("Digite el segundo numero  =  ");
        numero2 = Entrada.real();
        
        
        if( numero1 == numero2 ){
            System.out.println("Los numeros son iguales");
        }
        else{
            System.out.println("Los numeros no son iguales");
 
        }
    
    }
    
}
