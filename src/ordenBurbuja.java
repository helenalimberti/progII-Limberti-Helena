import java.util.Arrays;
public class ordenBurbuja {
    public static void main(String[] args) {

        int[] numeros= {8, 7, 3, 1, 4, 2, 1, 6};
        int i, j, temp;
        for (i = 1; i < numeros.length ; i++) {
            for (j = 0; j < numeros.length - i ; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
                System.out.println(j);
            }
        }


            System.out.println(Arrays.toString(numeros));

    }
}