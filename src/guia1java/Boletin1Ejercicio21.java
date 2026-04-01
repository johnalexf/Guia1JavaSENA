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
public class Boletin1Ejercicio21 {
    
    public static void solucion(){
    
        System.out.println("Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...");
        
        System.out.printf("Escriba la nota en numero  =  ");
        int nota = Entrada.entero();
        String[] notasExpresion = new String[]{
            "Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez"
        };
        
        if(nota >= 0 && nota <= 10)
            System.out.printf("%s %n", notasExpresion[nota]);
        else
            System.out.printf("La nota %d es invalida %n", nota);
        
                
    }
    
    
}
