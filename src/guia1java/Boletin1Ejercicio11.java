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
        System.out.println("Programa para pedir un numero entre 0 y 99999 y decir cuantas cifras tiene");
        
        int numero=0 ;
        int divisionExacta=0;
        System.out.print("Digite por favor un numero entre 0 y 99.999  =  ");
        numero = Entrada.entero();
         
        if(numero > 0 && numero < 100000){
                for( int i=0; i < 6 ; i++ ){
                    divisionExacta = (int) (numero / Math.pow(10, i));
                    //System.out.println("division exacta = " +  divisionExacta);
                    if(divisionExacta > 0){
                        if(divisionExacta < 10){
                            System.out.printf("El numero %.2f tiene %d cifras enteras %n", numero, i+1);
                            break;
                        }
                    }else{
                        System.out.println("El numero tiene cero cifras enteras");
                        break;
                    }            
                 }
        }else{
            System.out.println("El numero no esta dentro del rango (0,100.000)");
        }
        
        
        
        
    
    }
    
    
}
