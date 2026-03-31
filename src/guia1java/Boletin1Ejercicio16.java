/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author johna
 */
public class Boletin1Ejercicio16 {
    
    
    public static void solucion(){
    
        System.out.println("Programa para Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. \n" +
            "Sin años bisiestos.");
        
        int dia, mes, año;
        boolean diaValido = false, mesValido = true, añoValido = false, fechaValida=false;
        
        System.out.print("Escribe el dia en numero = ");
        dia = Entrada.entero();
        System.out.print("Escribe el mes en numero = ");
        mes = Entrada.entero();
        System.out.print("Escribe el año en numero = ");
        año = Entrada.entero();
        
        switch(mes){
            //meses de 31 dias
            case 1:  case 3: case 5: case 7: case 8: case 10: case 12:
                diaValido = (dia >= 1 && dia <= 31);
                break;
                
            //mes de febrero
            case 2:
                diaValido = (dia >= 1 && dia <= 28);
                break;
                
            // meses de 30 dias   
            case 4: case 6: case 9: case 11:
                diaValido = (dia >= 1 && dia <= 30);
                break;
                
            default:
                mesValido = false;
                break; 
        }
        
         añoValido = (año > 0);
         
         fechaValida = (diaValido && mesValido && añoValido);
         
         System.out.printf(
                 "La fecha es %s porque :%n"
               + "El dia es %s para el mes%n"
               + "El mes es %s %n" 
               + "El año es %s %n", 
                 construirMensajeValidacion(fechaValida, 'a'),
                 construirMensajeValidacion(diaValido, 'o'),
                 construirMensajeValidacion(mesValido, 'o'),
                 construirMensajeValidacion(añoValido, 'o') 
         );
         
        
    }
    
    public static String construirMensajeValidacion( boolean confirmacion, char terminacion){
        return (confirmacion) ? String.format("valid%c", terminacion): String.format("invalid%c", terminacion);
    }
    
    public static void pedirDatosScanner(){
    
        Scanner leer = new Scanner(System.in);
        
        String lectura = leer.nextLine();
        
        System.out.println(lectura);
        
    }
    
    public static void pedirDatosD(){
    
       // BufferedReader leer = new BufferedReader( new InputStreamReader(System.in));
        
       // String lectura = leer.readLine();
        
    }
    
}
