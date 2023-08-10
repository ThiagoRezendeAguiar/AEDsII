/*
Faça um programa que leia uma string e a converta para número inteiro. 
*/
package Unidade00.Introdução_ao_Java.String;

import java.util.Scanner;

public class Ex_String_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();

        int num = 0, temp;

        for (int i = 0; i < str.length(); i++) {
            temp = (int) (str.charAt(i) - 48);
            temp *= (int) Math.pow(10, str.length() - i - 1);
            num += temp;
        }

        System.out.println(num);

        scanner.close();
    }
}
