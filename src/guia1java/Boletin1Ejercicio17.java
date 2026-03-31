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
public class Boletin1Ejercicio17 {
    
    public static void solucion(){
        
        System.out.println("Programa Para Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente");
        
        int dia, mes, año;
        int diaSiguiente, mesSiguiente, añoSiguiente;
        boolean diaValido = false, mesValido = true, añoValido = false, fechaValida=false;
        
        System.out.print("Escribe el dia en numero = ");
        dia = Entrada.entero();
        System.out.print("Escribe el mes en numero = ");
        mes = Entrada.entero();
        System.out.print("Escribe el año en numero = ");
        año = Entrada.entero();
        
        
        boolean[] confirmacion  = confirmarFecha(dia, mes, año);
        diaValido = confirmacion[0];
        mesValido = confirmacion[1];
        añoValido = confirmacion[2];
        fechaValida = confirmacion[3];
         
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
        
        
        if(fechaValida){
            int[] fechaSiguiente = diaSiguiente(dia, mes, año);
            diaSiguiente = fechaSiguiente[0]; 
            mesSiguiente = fechaSiguiente[1]; 
            añoSiguiente = fechaSiguiente[2]; 
            
            System.out.printf("La fecha del dia siguiente es %s / %s / %s %n", diaSiguiente,mesSiguiente,añoSiguiente);
            
        }else{
            System.out.println("No se puede mostar la fecha del dia despues, si la fecha no es correcta");
        }
    }
    
    //Funcion para obtener el dia maximo segun el mes
    public static int obtenerDiasDelMes(int mes) {
        switch(mes){
            //meses de 31 dias
            case 1:  case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            //mes de febrero
            case 2:
                return 28;
            // meses de 30 dias   
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 0; //Se interpretara a la vez como mes invalido si el dia del mes es 0
        }
    }
    
    //Funcion para confirmar si la fecha ingresada es correcta, segun el dia y el mes acorde y un año mayor a 0
    public static boolean[] confirmarFecha(int dia,int mes,int año){
        boolean diaValido = false, mesValido = true, añoValido = false, fechaValida=false;
        
        int diaMaximoMes = obtenerDiasDelMes(mes);
        
        diaValido = (dia >= 1 && dia <= diaMaximoMes);
        mesValido = (diaMaximoMes != 0);
        añoValido = (año > 0);
         
         fechaValida = (diaValido && mesValido && añoValido);
        
        return new boolean[]{diaValido, mesValido, añoValido, fechaValida};
    }
    
    //Funcion para construir un mensaje de validacion, convertir un booleno en texto "invalid@"
    public static String construirMensajeValidacion( boolean confirmacion, char terminacion){
        return (confirmacion) ? String.format("valid%c", terminacion): String.format("invalid%c", terminacion);
    }
     
     
    
    // Funcion para calcular el dia siguiente si la fecha es correcta.
    public static int[] diaSiguiente(int dia, int mes, int año){
        
        int diaSiguiente = dia, mesSiguiente = mes, añoSiguiente = año;
        
        int diaMaximo = obtenerDiasDelMes(mes);
        
        diaSiguiente++;
        if(diaSiguiente > diaMaximo){
            diaSiguiente = 1;
            if(mes == 12){
                mesSiguiente = 1;
                añoSiguiente++;
            }else{
                mesSiguiente++;
            } 
        }
        
        return new int[] {diaSiguiente,mesSiguiente,añoSiguiente};
     }
    
}
