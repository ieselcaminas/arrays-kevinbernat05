package Arrays;

import java.util.Scanner;

class Ej7 {
    public static int calculaMaximo(String[] cadenas) {
        int maxima = cadenas[0].length();
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() > maxima) {
                maxima = cadenas[i].length();
            }
        }
        return maxima;
    }
    public static void main(String[] args){
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner miScanner;
        miScanner = new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++){
            cadenas[i] = miScanner.next();
        }

        int maxima = calculaMaximo(cadenas);

        for (int i = 0; i < maxima + 4; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("* " + cadenas[i]);

            for (int j = cadenas[i].length(); j < maxima; j++) {
                System.out.print(" ");
            }

            System.out.println(" *");
        }

        for (int i = 0; i < calculaMaximo(cadenas) + 4; i++) {
            System.out.print("*");

        }
        //Realiza aquí tu algoritmo

    }
}
