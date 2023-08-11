/*
Faça um método recursivo que receba dois números inteiros e retorne amultiplicação do primeiro pelo segundo fazendo somas.
*/
package Unidade00.Recursividade;

import java.util.Scanner;

public class Ex_Recursividade_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.println(a + " x " + b + " = " + multiplicacao(a, b));
        
        scanner.close();
    }

    public static int multiplicacao(int a, int b) {
        int resp = 0;
        if (b > 0) {
            resp =  a + multiplicacao(a, b - 1);
        }
        return resp;
    }
}