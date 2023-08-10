/* 
1. Faça um método que receba um array de inteiros e um número inteiro x e retorne um valor booleano informando se o elemento x está contido no array. 
2. Faça um método que receba um array de inteiros e mostre na tela o maior e o menor elementos do array.
*/
package Unidade00.Exercicios_de_revisao;

public class Ex {
    public static void main(String[] args) throws Exception {
        int[] array = { 1, 2, 3, 4, 5 };
        int num = 3;
        boolean resultado = verificador(array, num);
        System.out.println(resultado);
        maxMin(array);
    }

    public static boolean verificador(int[] array, int num) {
        for (int i = 0; i < 5; i++) {
            if (num == array[i])
                return true;
        }
        return false;
    }

    public static void maxMin (int[] array){
        int maior = array[0];
        int menor = array[0];
        for (int i = 0; i < 5; i++){
            if(array[i] > maior) maior = array[i];
            if(array[i] < menor) menor = array[i];
        }
        System.out.println("O maior número do array é " + maior);
        System.out.println("O menor número do array é " + menor);
    }
}
