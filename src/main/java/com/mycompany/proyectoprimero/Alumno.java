/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprimero;

/**
 *
 * @author LuisRobbeToichoaSaut
 */
public class Alumno {
    public Integer id;
    public String Nombre;

    public Alumno(Integer id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", Nombre=" + Nombre + '}';
    }
    
}
