package ej1;

public class Funciones {
    public static int sumatorio(int[] tabla){
        // guardará la suma de todos los índices
        int suma = 0;

        for(int i = 0; i < tabla.length; i++) {
            suma += tabla[i];
        }

        return suma;
    }
}
