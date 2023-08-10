/*
Faça um programa que leia a nota e o nome de 5 alunos e mostre na tela o nome daqueles que ficaram acima da média do grupo.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];
        double media = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Digite o nome do aluno " + (i+1) + ":");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a nota do aluno " + (i+1) + ":");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
            media += notas[i];
        }
        media /= 5;
        for (int i = 0; i < 5; i++){
            if(notas[i] > media) System.out.println(nomes[i]);
        }
        scanner.close();
    }
}
