package ej4;

import java.util.Arrays;

public class Ejercicio4 {
    public static int buscar(int t[], int clave) {
        // guarda la posición del valor que se busca
        int posicion = -1;
        // guarda si se ha encontrado o no la clave
        boolean encontrado = false;
        // guarda la posición del array y nos sirve para iterar sobre él
        int iterador = 0;

        while(!encontrado && iterador < t.length){
            if(t[iterador] == clave) {
                posicion = iterador;
                encontrado = true;
            }
            iterador++;
        }

        return posicion;
    }

    public static void main(String[] args) {
        System.out.println(buscar(new int[]{56,5,6,2}, 6));

    }
}
