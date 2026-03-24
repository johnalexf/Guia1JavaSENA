/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JOHN FORERO
 */
public class Entrada {
    static String Inicializar(){
        String lectura = "";
        InputStreamReader conversor = new InputStreamReader(System.in);
        BufferedReader capturarDatosTeclado = new BufferedReader(conversor);
        
        try {
           lectura = capturarDatosTeclado.readLine();
        } catch (IOException e) {
            System.out.println("Entrada incorrecta");
        }
        
        return lectura;
    }
    
    static int entero(){
        int valor = Integer.parseInt(Inicializar());
        return valor;
    }
    
    static double real(){
        double valor = Double.parseDouble(Inicializar());
        return valor;
    }
    
    static String cadena(){
        String valor = Inicializar();
        return valor;
    }
    
    static char caracter(){
        String valor = Inicializar();
        return valor.charAt(0);
    }
    
}
