package ej6;

import java.util.Arrays;

public class Ejercicio6 {
    public static int[] suma(int[] t, int numeroElementos) {
        int[] resultados = new int[t.length - numeroElementos + 1];

        for(int i = 0; i < resultados.length; i++) {
            for(int j = i; j < i+numeroElementos; j++) {
                resultados[i] += t[j];
            }
        }

        return resultados;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(suma(new int[]{3, 1, 2, 6, 2}, 2)));
    }
}
