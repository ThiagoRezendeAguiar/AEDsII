/*
Faça um programa que leia uma string e mostre se ela é composta apenas por dígitos.  
*/
package Unidade00.Introdução_ao_Java.String;

import java.util.Scanner;

public class Ex_String_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        boolean resp = true;

        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isDigit(texto.charAt(i)))
                resp = false;
        }

        if (resp == true)
            System.out.println("É composta apenas por digitos.");
        else if (resp == false)
            System.out.println("Não é composta apenas por digitos.");

        scanner.close();
    }
}
