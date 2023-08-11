/*
Faça um método recursivo que receba um array de inteiros e os ordene.
*/
package Unidade00.Recursividade;

public class Ex_Recursividade_6 {
    public static void main(String[] args) {
        int[] array = { 24, 11, 18, 2, 10 };

        ordenador(array, 0);

        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void ordenador(int[] array, int i) {
        if (i < array.length) {
            int menor = array[i];
            int temp = 0;
            for (int j = i + 1; j < 5; j++) {
                if (array[j] < menor) {
                    menor = array[j];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            ordenador(array, i + 1);
        }
    }
}
