package org.example.models;

public class Persona {

    private String nombre;
    private int edad;


    public Persona(){
        System.out.println("Hola desde Constructor");
    }

    public Persona(String nombre,int edad){
        this.nombre = nombre +  ".";
        this.edad =edad;
        System.out.println("Hola, mi nombre es: " + this.nombre+" y mi edad es: "+this.edad);
    }
}
