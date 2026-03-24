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
public class Boletin1Ejercicio3 {
    public static void solucion(){
    
        double radio, circunferencia = 0;
        
        System.out.println("Programa para calcular la longitud de una circunferencia");
        
        System.out.print("Digite el radio =  ");
        
        radio = Entrada.real();
        
        circunferencia = 2 * Math.PI * radio;
        
        System.out.printf("La circunferencia es %.2f para un radio de %.2f  %n", circunferencia, radio);
        
    
    }
}
