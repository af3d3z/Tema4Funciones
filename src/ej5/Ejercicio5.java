package ej5;

import java.util.Arrays;

public class Ejercicio5 {
    public static int[] buscarTodos(int t[], int clave) {
        // guarda la posición del valor que se busca
        int[] posiciones = new int[t.length];
        // guarda el número de números encontrados
        int encontrados = 0;
        // guarda la posición del array y nos sirve para iterar sobre él
        int iterador = 0;

        while(iterador < t.length){
            if(t[iterador] == clave) {
                posiciones[encontrados] = iterador;
                encontrados++;
            }
            iterador++;
        }

        return posiciones;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buscarTodos(new int[]{1,5,5,6,},5)));
    }
}
