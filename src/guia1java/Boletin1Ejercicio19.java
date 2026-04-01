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
public class Boletin1Ejercicio19 {
    
    public static void solucion(){
        
        System.out.println("Programa Para Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.");
        
        //En la matriz fechas se guardara de la siguiente manera
        //En fechas [#] la fecha completa
        //En fechas[#][0]=dia, fechas[#][1]=mes, fechas[#][2]= año 
        int[][] fechas = new int[2][3];
        String[] nombresFechas = new String[]{"dia","mes","año"};
        String[] numeroOrdinal = new String[]{"Primera","Segunda"};
        int diasDiferencia = 0;
        
        
        for(int i=0; i < 2; i++){
            System.out.printf("%nEscribir la %s fecha:%n", numeroOrdinal[i]);
            for(int j=0; j < 3; j++){
                System.out.printf("Escribir el %s = ",nombresFechas[j]);
                fechas[i][j] = Entrada.entero();
            }
        }
        
        boolean confirmacionFecha1  = confirmarFecha(fechas[0][0], fechas[0][1], fechas[0][2]);
        boolean confirmacionFecha2  = confirmarFecha(fechas[1][0], fechas[1][1], fechas[1][2]);
        
        System.out.printf( "%nLa primer fecha es %s %n", construirMensajeValidacion(confirmacionFecha1, 'a') );
        System.out.printf( "La segunda fecha es %s %n", construirMensajeValidacion(confirmacionFecha2, 'a') );
        
        
        if(confirmacionFecha1 && confirmacionFecha2){
              
            int posicionMenor = posicionFechaMenor(fechas[0], fechas[1]);
            
            if(posicionMenor == -1){
                System.out.println("Las fechas son iguales");
            }else{
              diasDiferencia =  ( posicionMenor == 0 )?  
                                calcularDiasDiferencia(fechas[0], fechas[1]): 
                                calcularDiasDiferencia(fechas[1], fechas[0]);
              
                System.out.printf("La diferencia entres las fechas:"
                                 +"%nFecha1 = %d/%d/%d"
                                 +"%nFecha2 = %d/%d/%d"
                                 +"%n%d dias%n",
                                 fechas[0][0],fechas[0][1],fechas[0][2],
                                 fechas[1][0],fechas[1][1],fechas[1][2],
                                 diasDiferencia
                );    
            }
        
        }else{
            System.out.println("No se puede calcular la diferencia de dias si una o mas de las fechas son invalidas");
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
    public static boolean confirmarFecha(int dia,int mes,int año){
        boolean diaValido = false, mesValido = true, añoValido = false, fechaValida=false;
        
        int diaMaximoMes = obtenerDiasDelMes(mes);
        
        diaValido = (dia >= 1 && dia <= diaMaximoMes);
        mesValido = (diaMaximoMes != 0);
        añoValido = (año > 0);
         
         fechaValida = (diaValido && mesValido && añoValido);
        
        return fechaValida;
    }
    
    
    //Funcion para construir un mensaje de validacion, convertir un booleno en texto "invalid@"
    public static String construirMensajeValidacion( boolean confirmacion, char terminacion){
        return (confirmacion) ? String.format("valid%c", terminacion): String.format("invalid%c", terminacion);
    }
     
 
    
    
    public static int posicionFechaMenor(int[] fecha1, int[] fecha2){   
        // dia1 = fecha1[0], mes1 = fecha1[1], año1 = fecha1[2];
        // dia2 = fecha2[0], mes2 = fecha2[1], año2 = fecha2[2];
        
        if (fecha1[2] != fecha2[2]) { return (fecha1[2] < fecha2[2]) ? 0 : 1; }
        if (fecha1[1] != fecha2[1]) { return (fecha1[1] < fecha2[1]) ? 0 : 1; }
        if (fecha1[0] != fecha2[0]) { return (fecha1[0] < fecha2[0]) ? 0 : 1; }
        return -1;
    }
    
    
    
        
    
    // Funcion para calcular el dia siguiente si la fecha es correcta.
    public static int calcularDiasDiferencia(int[] fecha1menor, int[] fecha2){
        
        int diasDiferencia = 0;
        int[] fecha1 = fecha1menor.clone();
        
        // dia1 = fecha1[0], mes1 = fecha1[1], año1 = fecha1[2];
        // dia2 = fecha2[0], mes2 = fecha2[1], año2 = fecha2[2];
        
        while(!Arrays.equals(fecha1, fecha2)){
            
            int diaMaximo = obtenerDiasDelMes(fecha1[1]);
            fecha1[0]++;
            if(fecha1[0] > diaMaximo){
                fecha1[0] = 1;
                if(fecha1[1] == 12){
                    fecha1[1] = 1;
                    fecha1[2]++;
                }else{
                    fecha1[1]++;
                } 
            }
            
            diasDiferencia++;
            
        }
        
        return diasDiferencia;
     }
    
    
}
