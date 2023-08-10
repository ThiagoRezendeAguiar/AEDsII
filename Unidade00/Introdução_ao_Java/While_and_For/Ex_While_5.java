/*
Faça um programa que leia um número inteiro N indicando a nota máxima 
em uma prova P. Em seguida, leia a nota de 20 alunos (entre 0 e N) e 
mostre na tela: (i) a média da turma, (ii) o número de alunos cuja nota foi 
menor que a média da Universidade (suponha 60%) e (iii) a quantidade de 
alunos com conceito A (mais de 90%).
*/
package Unidade00.Introdução_ao_Java.While_and_For;
import java.util.Scanner;

public class Ex_While_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota máxima: ");
        float N = scanner.nextFloat();
        int i = 0;
        int alunosB = 0;
        int alunosA = 0;
        float nota;
        float media = 0;
        while (i < 20){
            nota = scanner.nextFloat();
            media += nota;
            if(nota > (0.9*N)) alunosA ++;
            else if (nota < (0.6*N)) alunosB++;
            i++;
        }
        media = media/20;
        scanner.close();
        System.out.println("Média da turma: " + media);
        System.out.println("Número de alunos abaixo da média da Universidade: " + alunosB);
        System.out.println("Quantidade de alunos com conceito A: " + alunosA);
    }
}
