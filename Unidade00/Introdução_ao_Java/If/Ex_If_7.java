/*
Leia dois números reais e imprima a raiz cúbica do menor e o logaritmo do menor considerando o maior como a base desse logaritmo.
*/
package Unidade00.Introdução_ao_Java.If;
import java.util.Scanner;

public class Ex_If_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        float x = scanner.nextFloat();
        System.out.println("Digite outro número:");
        float y = scanner.nextFloat();
        scanner.close();
        if (x > y) {
            System.out.println("Raiz cúbica: " + Math.cbrt(y));
            System.out.println("Logaritmo: " + (Math.log10(y) / Math.log10(x)));
        } else {
            System.out.println("Raiz cúbica: " + Math.cbrt(x));
            System.out.println("Logaritmo: " + (Math.log10(x) / Math.log10(y)));
        }
    }
}
