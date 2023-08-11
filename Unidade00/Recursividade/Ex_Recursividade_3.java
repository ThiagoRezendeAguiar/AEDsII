/*
Faça um método recursivo que receba um array de números inteiros e um número inteiro n indicando o tamanho do array e retorne o maior elemento.
*/
package Unidade00.Recursividade;

public class Ex_Recursividade_3 {
    public static void main(String[] args){
        int[] array = {1,5,3,9,7};
        int n = array.length;
        int i = 0;
        int maior = maior(array,n,i);
        System.out.println("O maior número do array é " + maior);
    }

    public static int maior(int[] array,int n,int i){
        int resp = array[0];
        if(i == n-1){
            resp = array[i];
        }
        else{
            resp = maior(array, n, i+1);
            if(resp < array[i]){
              resp = array[i];
            }
        }
        return resp;
    }
}
