/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;

import javax.swing.text.Caret;

/**
 *
 * @author johna
 */
public class Boletin1Ejercicio11 {
    
    public static void solucion(){
        System.out.println("Programa para pedir un numero entre 0 y 99999 y decir cuantas cifras tiene");
        
        double numero=0 ;
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
    
    public static void solucion2(){
    
        System.out.println("Programa para pedir un numero positivo y decir cuantas cifras tiene");
        
        double numero=0;
        int cifrasEnteras = 0, cifrasDecimales = 0;
        
        System.out.print("Porfavor escriba un numero    ");
        numero = Entrada.real();
        
        
        int reduciendoNumeroParteEntera = (int) numero; //Creando copia independiente de numero
        double reduciendoNumeroParteDecimal = numero - (int) numero;
        
        while( reduciendoNumeroParteEntera!= 0){
            reduciendoNumeroParteEntera /= 10;
            System.out.println(reduciendoNumeroParteEntera);
            cifrasEnteras++;
        }
        
        while( reduciendoNumeroParteDecimal != 0){ 
            double analisis = reduciendoNumeroParteDecimal*10;
            int numeroSinDecimal = (int) analisis;
            System.out.printf("Analisis: decimal * 10 = %.20f , decimal * 10 parte entera = %.20f %n" , analisis , (double)numeroSinDecimal );
            //reduciendoNumeroParteDecimal = reduciendoNumeroParteDecimal*10 - (int)analisis%10;
            System.out.println(reduciendoNumeroParteDecimal);
           
            reduciendoNumeroParteDecimal = analisis - (double)numeroSinDecimal;
            System.out.println(reduciendoNumeroParteDecimal);
            cifrasDecimales++;
        }
        
        //Leccion aprendida double cero eficientes para precision, se guardan como divison binaria, 
        //para precision usar bigDecimal pero esto requiere usar funciones especificas para las operaciones 
        // y es un poco mas costoso en cuestion de memoria de ejecucion

       
        System.out.printf("El numero %.2f tiene %d cifras Enteras y %d Cifras decimales %n" , numero, cifrasEnteras, cifrasDecimales);
    
    }
    
    public static void solucion3(){
        System.out.println("Programa para pedir un numero positivo y decir cuantas cifras tiene");
        
        double numero=0;
        int cifrasEnteras = 0, cifrasDecimales = 0;
        
        System.out.print("Porfavor escriba un numero    ");
        numero = Entrada.real();
        
        String numeroString = String.valueOf(numero);
        //System.out.println(numeroString.length());
        int posicionPunto = encontrarPosicion(numeroString, '.');
        //int posicionPunto = numeroString.indexOf('.');
        
        cifrasEnteras = posicionPunto;
        cifrasDecimales = numeroString.length() - (posicionPunto + 1 );
        
        System.out.printf(" El numero %s tiene %d cifras enteras y %d cifras decimales %n", numeroString, cifrasEnteras, cifrasDecimales);
        
    
    }
    
    static int encontrarPosicion(String cadena, char caracter){
        int posicion=0;
        
        for(int i=0; i < cadena.length() ;i++){
            if(cadena.charAt(i) == caracter){
                posicion = i;
                break;
            }
        
        }
        
        return posicion;
    }
    
    
}
