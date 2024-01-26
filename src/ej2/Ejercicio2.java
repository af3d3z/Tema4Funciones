package ej2;

public class Ejercicio2 {
    public static int maximo(int[] t) {
        // guardaremos el número máximo
        int maximo = Integer.MIN_VALUE;

        for(int i = 0; i < t.length; i++) {
            if(t[i] > maximo){
                maximo = t[i];
            }
        }

        return maximo;
    }

    public static void main(String[] args) {
        System.out.println(maximo(new int[]{5,23,65,94,54,10}));
        System.out.println(maximo(new int[]{-50,203,655,-940,5454,101054}));
    }
}
