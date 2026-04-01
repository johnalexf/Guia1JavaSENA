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
public class Boletin1Ejercicio20 {
    
    public static void solucion(){
        System.out.println("Programa para Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente");
    
        //hora[0] = hora, hora[1] = minutos, hora[2] = segundos 
        int[] hora = new int[3];
        int[] nuevaHora = new int[3];
        String[] partesHora = new String[]{"hora","minutos","segundo"};
        
        System.out.println("Escriba la hora por partes:");
        for(int i = 0; i < 3; i++){
            System.out.printf("Escriba la %s = ",partesHora[i]);
            hora[i] = Entrada.entero();
        }
        
        String confirmarHora = confirmarHora(hora);
        
        if(confirmarHora.equals("OK")){
            System.out.println("La hora es valida");
            nuevaHora = sumarUnSegundo(hora);
            System.out.printf(
                    "La hora    %02d:%02d:%02d mas un segundo %n"
                  + "es igual a %02d:%02d:%02d %n",
                    hora[0],hora[1],hora[2],
                    nuevaHora[0],nuevaHora[1],nuevaHora[2]
            );
        }else
            System.out.printf("El tiempo no es valido por que %s no es correcta%n",confirmarHora);
        
        
    }
    
    
    public static String confirmarHora(int[] hora){
        
        String[] partesHora = new String[]{"hora","minutos","segundo"};
        int[] maxPartesHora = new int[]{23,59,59};
        
        for(int i=0; i < 3; i++){
            if ( !(hora[i]>=0 && hora[i]<=maxPartesHora[i]) ) 
                return partesHora[i];
        }   
        return "OK";
    }
    
    
    public static int[] sumarUnSegundo(int[] hora){
        
        //hora[0] = hora, hora[1] = minutos, hora[2] = segundos 
        int[] segundoDespues = hora.clone();
        
        int[] maxPartesHora = new int[]{24,60,60};
        
        segundoDespues[2] = (segundoDespues[2] + 1) % maxPartesHora[2] ; //segundoDespues[2] => segundos
        
        if ( segundoDespues[2] == 0 ){ //Como estamos sumando nunca va quedar en 0 sin el formateo, por eso se evalua si es igual a 0
             segundoDespues[1] = (segundoDespues[1] + 1) % maxPartesHora[1]; // segundoDespues[1] => minutos
             if(segundoDespues[1] == 0 ){
                segundoDespues[0] = ( segundoDespues[0] + 1) % maxPartesHora[0];// segundoDespues[0] => horas
             }
        }
        
        return segundoDespues;
    }
}
