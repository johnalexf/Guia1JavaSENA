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
public class Boletin1Ejercicio11 {
    
    public static void solucion(){
        System.out.println("Programa para pedir un numero entre 0 y 9.9999 y decir cuantas cifras tiene");
        
        double numero=0;
        
        
        System.out.print("Digite por favor un numero entre 0 y 9.99999  =  ");
        numero = Entrada.real();
         
        if(numero > 0 && numero < 10){
                
        }else{
            System.out.println("El numero no esta dentro del rango (0,10)");
        }
        
        
        
        
    
    }
    
    
}
