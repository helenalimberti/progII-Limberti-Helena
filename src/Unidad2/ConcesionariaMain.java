package Unidad2;

import java.util.ArrayList;
    class Concesionaria {
      String nombre ;
      ArrayList<Vehiculo> stock = new ArrayList<>();
      public Concesionaria(String nombre) {
         this.nombre = nombre;
     }

     public void agregarVehiculo(Vehiculo a){
        stock.add(a);
      }

     public Vehiculo buscarMarca(String nombreMarca){
          for (int i = 0 ; i < stock.size(); i++){
            if (nombreMarca.equalsIgnoreCase(stock.get(i).getMarca())){
            return stock.get(i);
            }
          }
      return null;
     }

     public double totalStock(){
         double total = 0;
      for (int i= 0; i < stock.size() ; i++) {
          total += stock.get(i).getPrecio();
      }
      return total ;}
}
public class ConcesionariaMain {
    public static void main(String[] args) {
        Concesionaria a1 = new Concesionaria("Kyoto");

        Vehiculo a = new Vehiculo("fiat", "palio", 200020);
        Vehiculo b = new Vehiculo("ford", "ka", 30000);
        Vehiculo c = new Vehiculo("nissan", "versa", 6000);
        Vehiculo d = new Vehiculo("toyota", "corolla", 10000);
        a1.agregarVehiculo(a);
        a1.agregarVehiculo(b);
        a1.agregarVehiculo(c);
        a1.agregarVehiculo(d);
        System.out.println(a1.stock);

        Vehiculo resultado = a1.buscarMarca("audi");
        if (resultado != null) {
            System.out.println(resultado.toString());
        } else {
            System.out.println("no se encontro su auto");
        }
        Vehiculo resultado2 = a1.buscarMarca("chevrolet");
        if (resultado2 != null) {
            System.out.println(resultado2.toString());
        } else {
            System.out.println("no se encontro su auto");
        }
        System.out.println("el total en de stock es: "+ a1.totalStock());
    }
}