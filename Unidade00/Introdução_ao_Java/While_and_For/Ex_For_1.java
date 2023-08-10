/*
Faça um programa que leia a nota de 5 alunos e mostre na tela a média das mesmas usando o comando for.
*/
package Unidade00.Introdução_ao_Java.While_and_For;
import java.util.Scanner;

public class Ex_For_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            media += nota;
        }

        System.out.println("A média das notas é: " + (media/5));

        scanner.close();
    }
}
