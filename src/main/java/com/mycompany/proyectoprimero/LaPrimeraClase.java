/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprimero;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author LuisRobbeToichoaSaut
 */
public class LaPrimeraClase implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<Integer, String> clase = new HashMap<Integer, String>();
        
        clase.put(10, "David");
        clase.put(11, "Roberto");
        clase.put(7, "Diego");
        
        if(clase.containsKey(11)){
            System.out.println("Roberto esta dentro");
        }else{
            System.out.println("Roberto esta fuera");
        }
        
        System.out.println( clase.get(11));
        
        System.out.println("---Iterando con for---");
        for( Map.Entry m: clase.entrySet()){
            System.out.println("[" + m.getKey() + "] ");
            System.out.println(m.getValue());
        }
        
        System.out.println("---Solo imprime las claves---");
        for(Integer i: clase.keySet()){
            System.out.println(clase.get(i));
        }
        
        System.out.println("----Iterando con while----");
        //Si no ponemos a ite el next va a salir nullx100
        Iterator<Integer> ite = clase.keySet().iterator();
        
        while(ite.hasNext()){
            System.out.println(clase.get(ite.next()));
        }
        
        
        
        System.out.println("-------");
        System.out.println(clase);
    }

}
