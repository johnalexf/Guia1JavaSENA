/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia1java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
    /*    System.out.println("Orden de forma descendente, de mayor a menor");
        System.out.println( Arrays.toString(ordenarNumeros(numeros, false)));
        System.out.println("Orden de forma ascendente, de menor a mayor");
        System.out.println(Arrays.toString(ordenarNumeros(numeros, true)));
       */
    
        System.out.println( Arrays.toString(ordenarNumerosMasRapido(numeros,true)) );
        
        

    }
    
    public static int[] ordenarNumeros(int numeros[], boolean ascendente){
        
        int i=0;
        while( i < (numeros.length-1)){
            
            if((ascendente && numeros[i+1] < numeros[i])||(!ascendente && numeros[i+1] > numeros[i])){
               
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
    
    
    public static int[] ordenarNumerosMasRapido(int numeros[], boolean ascendente){
        
        Random random = new Random();
        
        int ordenandoVector[] = numeros.clone();
        //int vectorInspeccion[] = numeros.clone();
        int numerosMayores = 0;
        int numerosMenores = 0;
        //int posicionesSeparaciones[][] = new int[numeros.length*10][2];
        //posicionesSeparaciones[0][0] = 0;                  //guarda la posicion inicial de la division
        //posicionesSeparaciones[0][1] = numeros.length - 1; //guarda la posicion final de la division
        ArrayList<int[]> pendientesActual = new ArrayList<>();
        pendientesActual.add(new int[]{0, numeros.length - 1});
        
        //int cantidadDivisionAnalizadas = 0;
        //int cantidadDivisionUltimaInteraccion = 1;
       
        //while(true){    
        while (!pendientesActual.isEmpty()) {
            
            ArrayList<int[]> pendientesNuevos = new ArrayList<>();
            
            //int posicionAGuardarDivisionesNuevas = cantidadDivisionAnalizadas + cantidadDivisionUltimaInteraccion;
            //int cantidadDivisionesInteraccionActual = 0;
            
            //for(int j = 0; j < cantidadDivisionUltimaInteraccion; j++ ){
            for(int[] rango : pendientesActual){
                
                
                //int divisionAanalizar = cantidadDivisionAnalizadas + j;
                //System.out.printf("Division a analizar %d %n", divisionAanalizar );

                //int posicioninicial = posicionesSeparaciones[ divisionAanalizar ][0];
                //int posicionfinal = posicionesSeparaciones[ divisionAanalizar ][1];
                int posicioninicial = rango[0];
                int posicionfinal = rango[1];
                
                //int numeroAleatorio = random.nextInt((max - min) + 1) + min;
                int posicionRandom = random.nextInt((posicionfinal - posicioninicial) + 1) + posicioninicial;
                int numeroRandom = ordenandoVector[posicionRandom];
                System.out.printf("numero random %d %n", numeroRandom);
                numerosMayores = 0;
                numerosMenores = 0;
                //int numerosIguales = 0;
                int ayuda = 0;
                int posicionFinalSinValidar = posicionfinal;
                

                for(int i = posicioninicial;  i <= posicionFinalSinValidar ; i++){
                        
                    System.out.println("Posicion analizada = " + i);
                    
                    if(ordenandoVector[i] > numeroRandom){
                        ayuda = ordenandoVector[(posicionfinal) - numerosMayores];
                        ordenandoVector[(posicionfinal) - numerosMayores] = ordenandoVector[i];
                        ordenandoVector[i] = ayuda;
                        numerosMayores += 1;
                        posicionFinalSinValidar--;
                        i--;
                    }else{
                        if(ordenandoVector[i] != numeroRandom){
                            if(i != (posicioninicial + numerosMenores) ){
                                ayuda =  ordenandoVector[posicioninicial + numerosMenores];
                                ordenandoVector[posicioninicial + numerosMenores] = ordenandoVector[i];
                                ordenandoVector[i] = ayuda;
                            }
                            numerosMenores += 1;
                        } 
                        
                    } 
                    
                    System.out.println("Posicion final sin validar = " + posicionFinalSinValidar);
                    System.out.println(Arrays.toString(ordenandoVector));
                }
                
                
                if(numerosMenores > 1){
                    pendientesNuevos.add(new int[]{posicioninicial,posicioninicial + numerosMenores - 1});
                    /*posicionesSeparaciones[posicionAGuardarDivisionesNuevas][0] = posicioninicial;                  
                    posicionesSeparaciones[posicionAGuardarDivisionesNuevas][1] = posicioninicial + numerosMenores - 1; 
                    cantidadDivisionesInteraccionActual += 1;
                    posicionAGuardarDivisionesNuevas += 1;
                       */
                    
                }

                if(numerosMayores > 1){
                    pendientesNuevos.add(new int[]{posicionfinal - numerosMayores + 1, posicionfinal});
                    /*posicionesSeparaciones[posicionAGuardarDivisionesNuevas][0] = posicionfinal - numerosMayores + 1;                  
                    posicionesSeparaciones[posicionAGuardarDivisionesNuevas][1] = posicionfinal;
                    cantidadDivisionesInteraccionActual += 1;
                    posicionAGuardarDivisionesNuevas += 1;
                    */
                }
                
                System.out.printf("Posicion inicial particion 1 %d %n", posicioninicial);
                System.out.printf("Posicion final particion 1 %d %n",(posicioninicial + numerosMenores - 1));
                System.out.printf("Posicion inicial particion 2 %d %n",(posicionfinal - numerosMayores + 1));
                System.out.printf("Posicion final  particion 2 %d %n", posicionfinal);
                
                System.out.println(Arrays.toString(ordenandoVector));
                System.out.println(" -------------------------------------- ");
                System.out.println("");
                
                
                

            }
            
            
            pendientesActual = pendientesNuevos;

           /* if(cantidadDivisionesInteraccionActual == 0){
                break;
            }else{
                cantidadDivisionAnalizadas += cantidadDivisionUltimaInteraccion;
                cantidadDivisionUltimaInteraccion = cantidadDivisionesInteraccionActual;
                //vectorInspeccion = ordenandoVector.clone();
            }*/
            
        }
        
        return ordenandoVector;
    }
    
    
}
