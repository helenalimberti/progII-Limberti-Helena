package clase1;
//clase 1
import java.util.Scanner;
public class verificadorPrimo {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("ingrese un numero para veirficar si es primo");
    int num = sc.nextInt();

       boolean b = esPrimo(num);
        if (b==false){
            System.out.println("su numero NO es primo");
        } else System.out.println("su numero es primo");
   }
    private static boolean esPrimo(int n){
       int cont=0;
       if (n<=1){
           return false;
       } else {
           for (int i=2; i<=n-1; i++){
               if ((n%i)==0){
                   return false;
               } else return true ;
           }
       }
    }
}
