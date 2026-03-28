/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author johna
 */
public class Boletin1Ejercicio5 {
    
    public static void solucion(){
    
        double numero = 0;
        
        System.out.println("Programa para determinar si un numero es positivo o negativo");
        
        System.out.print("Digite un numero real  =  ");
        
    
       // BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        //numero = Double.parseDouble(teclado.readLine());
        
        numero = Entrada.real();
        
        if( numero >= 0){
            System.out.printf("El numero %.2f es positivo %n", numero);
        }else{
            System.out.printf("El numero %.2f es negativo %n", numero);
        }
        
        
        
    }
    
    
}
