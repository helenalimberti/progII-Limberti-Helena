public class EmpleadoPorHora extends Empleado {
    private double HsTrabajadas;
    private double ValorHora;
    public EmpleadoPorHora(String nombre, int legajo, double HT, double VH){
    super(nombre, legajo);
    this.HsTrabajadas = HT;
    this.ValorHora = VH;
    };

    @Override
    public double calcularSueldo(){
        double sueldo = HsTrabajadas*ValorHora;
       return sueldo;
    }

    public static void main(String[] args) {
        Empleado a = new EmpleadoPorHora("juan", 123, 4, 500);
        System.out.println(a);
    }
}
