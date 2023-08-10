/*
Faça um programa para ler uma palavra. Em seguida, mostre a primeira ocorrência da letra A.  
*/
package Unidade00.Introdução_ao_Java.String;

import java.util.Scanner;

public class Ex_String_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int posicao = -1;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'A' || palavra.charAt(i) == 'a') {
                posicao = i;
            }
        }

        if(posicao != -1)
          System.out.println("A primeira ocorrência da letra A foi na " + (posicao + 1) + "o letra.");

        scanner.close();
    }
}
