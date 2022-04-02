/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp3listaalumnos;

import java.util.Scanner;


public class ClsLista {

    public Nodo primero; // cabeza 
    //contructor primer elemento nulo
    public ClsLista(){
        primero = null; // al inicio estará vacía
    }
    
    //devolver clase lista
    public ClsLista insertarCabezaLista(ClsAlumno entrada){
        //nodo aislado
        Nodo nuevo;
        nuevo = new Nodo(entrada, null); //inicializar nodo aislado
        nuevo.enlace = primero; //enlaza nuevo nodo de la lista(lo apunta)
        primero = nuevo; //mueve primero y apunta la nodo nuevo
        
        return this; //referencia del bjeto lista
    }
    
    //ver el contenido de la lista
    public void visualizar(){
        Nodo n;
        int k =0;
        n = primero;
        
        while(n!=null){
            System.out.println(n.dato +" ");
            n= n.enlace;
            k++;
            System.out.print(k%15 !=0 ? " ": "\n )"); 
        }
    }
    
    public ClsLista insertarUltimo(Nodo ultimo, ClsAlumno entrada){
        ultimo.enlace = new Nodo(entrada, null);
        ultimo = ultimo.enlace;
        return this; //devolver la clase como tal
    }
    
    public Nodo buscarLista(ClsAlumno valorBuscar){
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace){
            if(valorBuscar.equals(indice.dato)){ 
                return indice; //devolver el indice
            }
        }
        return null;
    }
    
    //insertar en la lista
    //buscar un valor a insertar
    public ClsLista insertarLista(ClsAlumno valorBuscarInsertar, ClsAlumno entrada){
        Nodo nuevo, anterior;
        anterior = buscarLista(valorBuscarInsertar); //la lista buscara el valor a insertar
        if (anterior != null){
        nuevo= new Nodo(entrada, null); 
        nuevo.enlace = anterior.enlace;
        anterior.enlace =  nuevo;
        }
        return this;
    }
    
    //buscar por posicion
    public Nodo buscarPosicion(int posicion){
        Nodo indice;
        int i;
        if(posicion<0) return null;
        
        indice = primero;
        for (i=1; (i< posicion)&& (indice !=null); i++){
            indice = indice.enlace;
        }
        return indice;
    }
    
    //eliminar elemento
    public void eliminar(ClsAlumno entrada){
        Nodo actual, anterior;
        boolean encontrado;
        //iniciar los apuntadores
        actual = primero;
        anterior= null;
        encontrado = false;
        //buscar en el nodo
        while((actual != null)&& (!encontrado)){
            encontrado = ((actual.dato).equals(entrada)); //equals
            if(!encontrado){
                anterior = actual;
                actual = actual.enlace; 
            } 
        }
        //enlazar del nodo anterior con el sig. nodo
        if(actual != null){
          //distingue que el nodo no sea la cabeza
          if(actual == primero){
              primero = actual.enlace;
            }else{
              anterior.enlace = actual.enlace;
            }
          actual = null; //
        }
    }
}
