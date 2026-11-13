package clase5.Ejercicio1;

public class Persona {
    String nombre;
    int edad;
    int dni;

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public String getnombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getdni() {
        return dni;
    }
 @Override
    public String toString(String nombre, int edad, int dni){
        return("Nombre: " + nombre "- edad: " + edad" - DNI: " + dni);
    }
}
