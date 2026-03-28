/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia1java;

import java.util.Arrays;

/**
 *
 * @author johna
 */
public class Boletin1Ejercicio10 {
    
    public static void solucion(){
            
        int cantidadNumerosEnteros = 10;
        
        System.out.printf("Programa para ordenar %d numeros de mayor a menor %n", cantidadNumerosEnteros);
        
        int numeros[] = new int[cantidadNumerosEnteros];
        
        for( int i=0; i < cantidadNumerosEnteros ; i++){
            System.out.printf(" Escriba el numero %d = ", (i+1));
            numeros[i] = Entrada.entero();
        }
        
//        12, 3, 43, 23, 54, 32, 1
//        12, 3
//        12, 43, 3
//        43, 12, 3
//        43, 12, 23, 3
//        43, 23, 12, 3    
        
        System.out.println("Los numeros ordenados de mayor a menor quedan asi:");
        System.out.println( Arrays.toString(ordenarNumeros(numeros)));
        System.out.println(Arrays.toString(numeros));

    }
    
    public static int[] ordenarNumeros(int numeros[]){
        
        int i=0;
        while( i < (numeros.length-1)){
        
            if(numeros[i+1] > numeros[i]){
               
                int temporal = numeros[i];
                numeros[i] = numeros[i+1];
                numeros[i+1] = temporal;
                
                if(i!=0){
                    i--;
                }
                
            }else{
                i++;
            }
        
        }
        
        return numeros;
    }
    
}
