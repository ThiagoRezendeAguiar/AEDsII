/*
Faça um programa que leia a nota de 5 alunos e mostre na tela a média das mesmas.
*/
package Unidade00.Introdução_ao_Java.While_and_For;
import java.util.Scanner;

public class Ex_While_1{
    public static void main(String[] args){
      float soma = 0;
      Scanner scanner = new Scanner(System.in);
      int i = 0;
      while(i < 5){
        System.out.println("Digite a " + (i+1) + "º nota:");
        float nota = scanner.nextFloat();
        soma += nota;
        i++;
      }
      System.out.println("A média das notas é " + (soma/5));
      scanner.close();
    }
}