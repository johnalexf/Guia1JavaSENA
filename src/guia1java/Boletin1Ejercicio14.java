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
public class Boletin1Ejercicio14 {
    
    public static void solucion(){
        System.out.println("Programa para describir una nota");
        
        System.out.println("Escriba una nota de 0 a 10");
        
        int nota = Entrada.entero();
        
        if (nota >= 0 && nota <= 10) {
            if(nota < 5)
                System.out.println("INSUFICIENTE");
            else
                if(nota < 6)
                    System.out.println("SUFICIENTE");
                else
                    if(nota < 7)
                        System.out.println("BIEN");
                    else
                        if(nota < 9)
                            System.out.println("NOTABLE");
                        else
                            System.out.println("SOBRESALIENTE");
            
            
        }else{
            System.out.println("La nota no es valida");
        }
    
    }
    
    /* public static void solucionModerna() {
        System.out.print("Introduzca una nota: ");
        int nota = Entrada.entero();

        // El Switch moderno permite comas y usa la flecha -> (no necesita break)
        String resultado = switch (nota) {
            case 0, 1, 2, 3, 4 -> "INSUFICIENTE";
            case 5             -> "SUFICIENTE";
            case 6             -> "BIEN";
            case 7, 8          -> "NOTABLE";
            case 9, 10         -> "SOBRESALIENTE";
            default            -> "NOTA NO VÁLIDA";
        };

        System.out.println(resultado);
    }
    */
    
}
