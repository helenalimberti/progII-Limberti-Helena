public class Empleado {
    protected String nombre;
    protected int legajo;


    public String getnombre() {
        return nombre;
    }
    public int getLegajo() {
        return legajo;
    }
    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }
    public double calcularSueldo() {
        return 0.0;
    }
    public String toString() {
        return(nombre + "( legajo " + legajo + ") -$" + calcularSueldo());
    }
}
