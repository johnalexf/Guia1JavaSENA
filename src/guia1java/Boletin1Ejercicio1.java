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
public class Boletin1Ejercicio1 {
     public static void solucion (){
        
        double x1 = 0, x2 = 0;
        double[] valores = new double[3];
        char[] letras = new char[]{'a','b','c'};

        System.out.println("Calculo de la solucion de una ecuacion de segundo grado");
        System.out.println("Teniendo encuenta que la ecuacion es de la siguiente forma:");
        System.out.println("(a)*X^2 + (b)*x + c = 0");

        for(int i=0; i< letras.length ; i++){
            System.out.println("Digite el valor de " + letras[i]);
            valores[i] = Entrada.real();
        }
        
        double a = valores[0] , b = valores[1], c = valores [2];
        
        double discriminante = (Math.pow(b, 2)-4*a*c);
        
        System.out.println("La ecuacion");
        System.out.println(a + "X^2 + " + b + "X + " + c + " = 0");
        
        if( discriminante >= 0){

            double raiz = Math.pow(discriminante,0.5);
            x1 = (-b + raiz )/(2*a);
            x2 = (-b - raiz )/(2*a);

            if( a == 0){
                System.out.println("No es una ecuacion de segundo grado ");
                
            }else{
                System.out.println("tiene como solucion: ");
                System.out.println(" X1 = "+ x1);
                System.out.println(" X2 = "+ x2);
            }

            

        }else{

            System.out.println("No tiene solucion en los numeros reales");

        }  
        
    }
}
