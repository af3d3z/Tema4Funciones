package ej3;

import java.util.Arrays;

public class Ejercicio3 {
    public static int[] rellenaPares(int longitud, int fin) {
        // guarda la tabla con los pares
        int[] tablaPares = new int[longitud];

        // genera un número aleatorio y si es impar le añade uno
        for(int i = 0; i < tablaPares.length; i++) {
            tablaPares[i] = (int) (Math.random() * fin);
            tablaPares[i] += tablaPares[i] % 2 == 0 ? 0 : 1;
        }

        return tablaPares;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rellenaPares(30, 16)));
    }
}
