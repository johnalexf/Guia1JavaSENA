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
public class Boletin1Ejercicio22 {
    
    public static void solucion(){
    
        System.out.println("Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.");
    
        System.out.print("Escriba un numero de 0 a 99 = ");
        int numero = Entrada.entero();
        
        String[] unidades = new String[]{
            "Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"
        };
        
        String[] decenas = new String[]{
            "Cero","Diez","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"
        };
        
        String[] decenasEspeciales = new String[]{
            "","Dieci","Veinti"
        };
        
        String [] decenasEspeciales2 = new String[]{
            "","On","Do","Tre","Cator","Quin"
        };
        
        int unidad = numero % 10;
        int decena = numero / 10;
        
        if(unidad == 0){
            System.out.printf("%s %n", decenas[decena]);
        }else{
            if(decena > 2){
                System.out.printf("%s y %s %n", decenas[decena],unidades[unidad].toLowerCase());
            }else if(decena == 2 || (decena == 1 && unidad >= 6)){
                System.out.printf("%s%s %n", decenasEspeciales[decena],unidades[unidad].toLowerCase());
            }else if(decena == 1){
                System.out.printf("%sce %n", decenasEspeciales2[unidad]);
            }else{
                System.out.printf("%s %n", unidades[unidad]);
            }
        }
        
    }
    
}
