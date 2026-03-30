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
public class Boletin1Ejercicio6 {
    
    public static void solucion(){
        
        System.out.println("Programa para determinar si un numero es multiplo del otro");
        
        int numero1 = 0, numero2 = 0;
        
        
        System.out.print("Digite el primer numero entero = ");
        numero1 = Entrada.entero();
        System.out.print("Digite el primer numero entero = ");
        numero2 = Entrada.entero();
        
        if( numero1 >= numero2){
            if(numero1%numero2 == 0){
                System.out.printf("El numero %d es multiplo de %d %n", numero1, numero2 );
            }else{
                System.out.printf("El numero %d no es multiplo de %d %n", numero1, numero2 );
            }
        }else{
            if(numero2%numero1 == 0){
                System.out.printf("El numero %d es multiplo de %d %n", numero2, numero1 );
            }else{
                System.out.printf("El numero %d no es multiplo de %d %n", numero2, numero1 );
            }
        }
    
    
    }
    
}
