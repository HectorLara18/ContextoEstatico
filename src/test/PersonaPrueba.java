package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Hector Lara");
        imprimir(persona1);
        
        Persona persona2 = new Persona("Jazmin Banda");
        imprimir(persona2);

    }

    //para poder utilizar un metodo dentro de main este debe de ser estatico
    public static void imprimir(Persona persona) {
        System.out.println("Persona = " + persona);
    }
}
