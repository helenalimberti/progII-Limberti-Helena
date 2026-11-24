package Unidad2;

public class EmpleadoCom extends Empleado{
private int ventas;
public EmpleadoCom(String nombre, int legajo, int ventas){
    super (nombre, legajo);
    this.ventas = ventas;
}
    @Override
    public double calcularSueldo() {
        double comision;
        comision = ventas*200;
        return comision;
    }

   public static void main(String[] args) {
        Empleado[] a = new Empleado[3];
        a[0] = new EmpleadoPorHora ("helena", 321, 6.5, 500 );
        a[1] = new EmpleadoCom ("juana", 222, 12);
        a[2] = new Empleado ("carlos", 111);

        for (int i=0; i<=2; i++){
            System.out.println(a[i]);
       }
    }
}
