/*
Leia 3 números inteiros, selecione o menor e o maior e imprima os seus respectivos valores na tela.
*/

package Unidade00.Introdução_ao_Java.If;

import java.util.Scanner;

public class Ex_If_2 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        x = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        y = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        z = scanner.nextInt();
        scanner.close();

        int menor = x;
        int maior = x;

        if (y < menor) {
            menor = y;
        }
        if (z < menor) {
            menor = z;
        }

        if (y > maior) {
            maior = y;
        }
        if (z > maior) {
            maior = z;
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}
