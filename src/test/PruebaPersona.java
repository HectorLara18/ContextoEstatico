package test;

import dominio.Persona;

import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        String nombre = "Hector";

        Persona personaDePrueba = new Persona();
        System.out.println(personaDePrueba.getNombre());
        System.out.println(nombre.length());
        System.out.println(validName(nombre));

    }

    public static String validName(String nombre) {
        String nombreValido;
        if(nombre.length() > 1) {
            nombreValido = nombre;
        } else {
            nombreValido = "Defaul Valid Name";
        }
        return nombreValido;
    }

}
