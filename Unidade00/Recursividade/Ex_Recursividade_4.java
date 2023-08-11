/*
Faça um método recursivo que receba um array de caracteres e retorne um valor booleano indicando se esse é um palíndromo. 
*/
package Unidade00.Recursividade;

public class Ex_Recursividade_4 {
    public static void main(String[] args){
       String texto = "roma e amor";
       System.out.println(isPalindromo(texto , 0));
    }

    public static boolean isPalindromo(String str, int i){
        boolean resp;
        if (i >= str.length() / 2){
        resp = true;
        } else if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
        resp = false;
        } else {
        resp = isPalindromo(str, i + 1);
        }
         return resp;
        }
}
