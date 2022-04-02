/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp3listaalumnos;

/**
 *
 * @author 50232
 */
public class ClsAlumno {
    public String carnet;
    public String nombre;
    public double promedio; 
    
    //constructor
    public ClsAlumno(){
        this.carnet= carnet;
        this.nombre = nombre;
        this.promedio = promedio; 
    }
    
    public String getCarnet(){
        return carnet;
    }
    
    public void setCarnet(String carnet){
        this.carnet = carnet;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getPromedio(){
        return promedio;
    }
    
    public void setPromedio(double promedio){
        this.promedio= promedio;
    }
}
