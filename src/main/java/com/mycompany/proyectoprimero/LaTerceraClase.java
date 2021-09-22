/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprimero;

import java.util.HashMap;

/**
 *
 * @author LuisRobbeToichoaSaut
 */
public class LaTerceraClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //var clase = new HashMap<>();
        HashMap<String, Alumno> clase = new HashMap<>();
        
        long start = System.currentTimeMillis();
        
        Alumno marco = new Alumno(1, "Marco");
        clase.put("Cabessa", marco);
        
        Alumno canario = new Alumno(2, "David");
        clase.put("Canario", canario);
        
        if(clase.containsKey("Canario")){
            System.out.println(clase.get("Canario"));
        }
        
        long duracion = System.currentTimeMillis()-start;
        System.out.println("Duracion del programa: " + duracion);
    }
    
}
