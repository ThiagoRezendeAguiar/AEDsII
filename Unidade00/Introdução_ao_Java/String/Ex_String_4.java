/*
Faça um programa que leia uma string e mostre se ela é um palíndromo. 
*/
package Unidade00.Introdução_ao_Java.String;

import java.util.Scanner;

public class Ex_String_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();

        boolean resp = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                resp = false;
                i = str.length();
            }
        }

        System.out.println(resp);

        scanner.close();
    }
}
