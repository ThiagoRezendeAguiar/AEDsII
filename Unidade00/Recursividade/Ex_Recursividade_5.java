/*
Faça um método recursivo que receba um array de caracteres e retorne um número inteiro indicando a quantidade de vogais do mesmo.
*/
package Unidade00.Recursividade;

public class Ex_Recursividade_5 {
    public static void main(String[] args) {
        char[] array = { 'a', 'b', 'c', 'd', 'e' };
        int vogais = contador(array, 0);
        System.out.println("Número de vogais: " + vogais);
    }

    public static int contador(char[] array, int i) {
        int resp = 0;
        if (i == array.length) {
            resp = 0;
        } else {
            if (isVogal(array[i]) && i < array.length) {
                resp++;
            } 
            return resp + contador(array, i + 1);
        }
        return resp;
    }

    public static boolean isVogal(char x) {
        x = Character.toLowerCase(x);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }
}
