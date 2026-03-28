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
public class Boletin1Ejercicio8 {
    
    public static void solucion(){
    
        System.out.println("Programa para pedir dos numeros y decir cual es el mayor o si son iguales");
        
        int numero1, numero2;
        
        System.out.print("Escriba el primer numero = ");
        numero1 = Entrada.entero();
        
        System.out.print("Escriba el segundo numero = ");
        numero2 = Entrada.entero();
        
        if(numero1 > numero2){
            imprimirResultado(numero1, numero2, false);
        }else if (numero2 > numero1) {
            imprimirResultado(numero2, numero1, false);
        }else{
            imprimirResultado(numero2, numero1, true);
        }
    
    
    }
    
    private static void imprimirResultado(int numeroMayor, int numeroMenor, boolean iguales){
    
        if(iguales){
            System.out.printf("Los numeros son iguales %n", numeroMayor, numeroMenor);
        }else{
            System.out.printf("El numero %d es mayor que %d %n", numeroMayor, numeroMenor);
        }
        
    }
    
}
