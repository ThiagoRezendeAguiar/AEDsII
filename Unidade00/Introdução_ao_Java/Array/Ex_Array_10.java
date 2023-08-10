/*
Faça um programa para ler a nota de cinco alunos, calcular e mostrar: a soma e a média das mesmas e a menor nota.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;
        double menor = 1000;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        double media =  soma/5;
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
        System.out.println("Menor nota: " + menor);
        scanner.close();
    }
}
