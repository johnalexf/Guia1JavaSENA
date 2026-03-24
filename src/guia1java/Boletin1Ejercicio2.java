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
public class Boletin1Ejercicio2 {
    
    public static void solucion(){
    
        double radio, area = 0;
        
        System.out.println("Programa para calcular el area de un circulo");
        System.out.println("Escribe el radio del circulo");
        radio = Entrada.real();
        
        System.out.println("El circulo con radio = " + radio);
        
        area = Math.PI*Math.pow(radio, 2);
        
        System.out.printf("Tiene como area =  %.2f %n" , area);
        
        
    }
    
}
