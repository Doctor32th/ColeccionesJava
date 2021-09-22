/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprimero;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author LuisRobbeToichoaSaut
 */
public class LaSegundaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> clase = new HashSet<String>();

        clase.add("Pablo");
        clase.add("David");
        clase.add("David");
        clase.add("Alejandro");

        clase.remove("David");

        Iterator<String> it = clase.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(clase);

    }

}
