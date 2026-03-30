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
public class Boletin1Ejercicio13 {
    
    public static void solucion(){
    
        System.out.println("Escribe un numero o un texto y te dire si es Capicua");
        
        System.out.print("Escribe el numero  =  ");
        String numero = Entrada.cadena();
        
        String invertido = new StringBuilder(numero).reverse().toString();
    
        String mensaje = (numero.equals(invertido)) ? "es capicua" : "no es capicua";
        
        System.out.printf("El numero o texto = %s  %s %n", numero, mensaje);
    }
    
}
