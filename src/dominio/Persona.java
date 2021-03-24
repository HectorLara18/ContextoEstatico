package dominio;

public class Persona {
    //Atributos
    private int idPersona;
    private String nombre;
    private static int contadorPersona;
    public boolean variable;

    public Persona() {}

    public Persona(String nombre) {
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++;
        //Asignar el nuevo valor a la variable de idPersona
        this.idPersona = Persona.contadorPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return  this.nombre;
    }

    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public static int getContadorPersona(){
        return Persona.contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
