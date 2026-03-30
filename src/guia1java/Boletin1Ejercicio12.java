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
public class Boletin1Ejercicio12 {
    public static void solucion(){
        System.out.println("Programa para mostrar un numero con las cifras al reves");
        
        int numero;
        
        System.out.print("Digite un numero  =  ");
        numero = Entrada.entero();
        
        int cifras = 0;
        int reduciendoNumero = numero;
        int numeroAlReves = reduciendoNumero%10;
        reduciendoNumero /= 10;
        
        
        while(reduciendoNumero != 0){
            numeroAlReves = numeroAlReves*10 + reduciendoNumero%10;
            reduciendoNumero /= 10;        
        }
        
                
         System.out.printf("El numero %d al reves es = %d %n", numero, numeroAlReves);    
    
    
    }
    
    
    
    public static void solucion2(){
    
         System.out.println("Programa para mostrar un numero con las cifras al reves");
         
         double numero = 0;
         
         System.out.print("Escriba un numero = ");
         numero = Entrada.real();
         
         String numeroString = String.valueOf(numero);
         
         System.out.printf("El numero %f al reves es = %s %n" , numero ,  invertirString(numeroString) );
        
    }
    
    static String invertirString(String numeroString){
        String numeroAlReves="";
        
        for(int i = numeroString.length()-1 ; i >= 0; i--){
            numeroAlReves += numeroString.charAt(i);
        }
        
    return numeroAlReves;
    }
    
    public static void solucion2_pro() {
        System.out.println("Inversión de número Pro");
        double numero = Entrada.real();

        // 1. Convertimos a String sin notación científica
        //String numStr = String.format("%.0f", Math.abs(numero));
        String numStr = String.valueOf(Math.abs(numero));

        // 2. Usamos StringBuilder para invertir en UNA sola línea
        String invertido = new StringBuilder(numStr).reverse().toString();

        System.out.printf("El número %s al revés es =  %s %n" , numStr , invertido);
        
        //if( numStr == invertido){
        if( numStr.equals(invertido)){
            System.out.println("El numero es capicua");
        }else{
            System.out.println("El numero no es capicua");
        }
        
    }
}






