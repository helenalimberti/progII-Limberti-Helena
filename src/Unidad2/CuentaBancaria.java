package Unidad2;

public class CuentaBancaria {
    private String titular;
    private int nCuenta;
    private float saldo;
    //metodo constructor
    public CuentaBancaria(String titular, int nCuenta, float saldo){
        setTitular(titular);
        setnCuenta(nCuenta);
        setSaldo(saldo);
    }
    public CuentaBancaria(String titular, int nCuenta){
        this(titular, nCuenta, 0);

    }

    public void setTitular(String titular){
        if (titular.isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacio");
        }
        this.titular= titular;
    }

    public void setSaldo(float saldo){
        if (saldo<0) {
            throw new IllegalArgumentException("El saldo no puede comenzar negativo");
        }
        this.saldo= saldo;
    }

    public void setnCuenta(int nCuenta){
        this.nCuenta= nCuenta;
    }

    public String getTitular(){
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void extraer(float monto){
        if (monto<0){
            throw new IllegalArgumentException("no se puede extraer monto negativo");
        }
        if (monto >saldo){
            throw new IllegalArgumentException("no tiene suficiente dinero en su cuenta");
        }
        saldo=saldo-monto;
        System.out.printf("extracción exitosa!, su saldo quedó en $ "+ saldo);
    }

    public void depositar(float monto){
        if (monto >= 0){
            saldo= saldo+monto;
            System.out.printf("has depositado exitosametne $ "+ monto + "%n");
            System.out.printf("tu saldo ahora es de $ "+ saldo + "%n");
        } else {
            throw new IllegalArgumentException("no se puede depositar monto negativo");
        }
    }
    public void mostrar(){
        System.out.println("titular: "+ getTitular());
        System.out.println("no. de cuenta: "+ getnCuenta());
        System.out.println("saldo disponible: "+ getSaldo());
    }
}
 class MainCuentaBancaria {
     public static void main(String[] args) {

         CuentaBancaria a = new CuentaBancaria("Juan", 123, 222);
         System.out.println("");
        a.mostrar();
         try {//probar try-catch
             a.setTitular("");
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
         System.out.println("");

         try {//probar try-catch
             a.setSaldo(-12);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
         System.out.println("");

         a.mostrar();
         System.out.println("");

         a.depositar(200);
         System.out.println("");

         a.extraer(100);
         System.out.println("");

         System.out.println("");
        try {
            a.depositar(-100);
        }   catch (Exception e){
            System.out.println(e.getMessage());
        }

         System.out.println("");
         try {
             a.extraer(-100);
         }   catch (Exception e){
             System.out.println(e.getMessage());
         }



     }
 }