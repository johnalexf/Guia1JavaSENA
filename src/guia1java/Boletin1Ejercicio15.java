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
public class Boletin1Ejercicio15 {
    
    public static void solucion(){
        System.out.println("Programa para Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de\n" +
            "30 días.");
        
        int dia, mes, año;
        boolean fechaValida = false;
        
        System.out.print("Escribe el dia en numero = ");
        dia = Entrada.entero();
        System.out.print("Escribe el mes en numero = ");
        mes = Entrada.entero();
        System.out.print("Escribe el año en numero = ");
        año = Entrada.entero();
        
        if(dia >= 1 && dia <= 30){
            System.out.println("Dia valido");
            fechaValida = true;
        }else{
            System.out.println("Dia invalido");
            fechaValida = false;
        }
        
        if(mes >= 1 && mes <= 12){
            System.out.println("Mes Valido");
            fechaValida = true;
        }else{
            System.out.println("Mes invalido");
            fechaValida = false;
        }
        
        if(año >= 1){
            System.out.println("Año Valido");
            fechaValida = true;
        }else{
            System.out.println("Año invalido");
            fechaValida = false;
        }
        
        System.out.println((fechaValida) ? "La fecha es valida" : "La fecha no es valida");
     
    }
    
    
    public static void solucion2(){
     System.out.println("Programa para Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de\n" +
            "30 días.");
        
        int dia, mes, año;
        boolean diaValido = false, mesValido = false, añoValido = false;
        
        System.out.print("Escribe el dia en numero = ");
        dia = Entrada.entero();
        System.out.print("Escribe el mes en numero = ");
        mes = Entrada.entero();
        System.out.print("Escribe el año en numero = ");
        año = Entrada.entero();
        
        diaValido = (dia >= 1 && dia <= 30);
        mesValido = (mes >= 1 && mes <= 12);
        añoValido = (año >= 1);
        
        System.out.println("La fecha es " + ((diaValido && mesValido && añoValido) ? "Correcta" : "Incorrecta") + "  porque : ");
        System.out.println("El dia es = " + ((diaValido) ? "Correct0" : "Incorrecto") );
        System.out.println("El mes es = " + ((mesValido) ? "Correcto" : "Incorrecto") );
        System.out.println("El año es = " + ((añoValido) ? "Correcto" : "Incorrecto") );
    }
}
