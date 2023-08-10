/*
Faça um programa que leia a nota de 5 alunos e mostre na tela a média das notas cujo valor é maior ou igual a oitenta  
*/
package Unidade00.Introdução_ao_Java.While_and_For;
import java.util.Scanner;

public class Ex_For_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = 0;
        int contador = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota >= 80) {
                media += nota;
                contador++;
            }
        }

        scanner.close();

        if (contador > 0) {
            media = media / contador;
            System.out.println("A média das notas maiores ou iguais a oitenta é: " + media);
        } else {
            System.out.println("Não houve notas maiores ou iguais a oitenta.");
        }
    }
}
