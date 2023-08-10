/*
Faça um programa que leia três números reais representando os lados 
de um triângulo e informe se seu triângulo é Equilátero, Isósceles ou 
Escaleno
*/

package Unidade00.Introdução_ao_Java.If;
import java.util.Scanner;

public class Ex_If_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float l1, l2, l3;
        System.out.println("Digite o valor do primeiro lado: ");
        l1 = scanner.nextFloat();
        System.out.println("Digite o valor do segundo lado: ");
        l2 = scanner.nextFloat();
        System.out.println("Digite o valor do terceiro lado: ");
        l3 = scanner.nextFloat();
        if (l1 == l2 && l2 == l3) {
            System.out.println("Equilátero");
        } else if (l1 != l2 && l1 != l3 && l2 != l3) {
            System.out.println("Escaleno");
        } else {
            System.out.println("Isósceles");
        }
        scanner.close();
    }
}