package Arrays;

import java.util.Scanner;

public class Ej6 {
    public static int minimo(int[] numeros){
        int min = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] numeros = {3,4,5,23,42,23,52,23,89,123,23,23};

        Scanner sc = new Scanner(System.in);

        System.out.println(minimo(numeros));


    }
}
