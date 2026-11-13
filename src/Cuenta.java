public class Cuenta {
    private String titular;
    private double cantidad;
    //------GETTERS------
    public String getTitular(){
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    //------SETTERS------
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
}
