public class SumarDigitos {
   // public void sumardigitos(int num){
     //   if (num <= 9){
     //       return num;
     //   }
    //   return (num % 10) + sumardigitos(num /10);
   // }
    // Cada llamada queda "pendiente" en el Stack hasta que la siguiente llamada  retorna
    public static void cuentaRegresiva(int n) {
        if (n <= 0) {                 // caso base
            System.out.println("¡Despegue!");
            return;
        }
        System.out.println("Apilando llamada -> n = " + n);
        cuentaRegresiva(n - 1);       // caso recursivo: la ejecución "espera" acá
        System.out.println("Desapilando llamada -> n = " + n);
    }
}

void main(String[] args) {
    SumarDigitos a = new SumarDigitos();
    SumarDigitos.cuentaRegresiva(6);
}