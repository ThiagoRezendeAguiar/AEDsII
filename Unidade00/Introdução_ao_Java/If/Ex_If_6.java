/*
O banco do Zé abriu uma linha de crédito para os seus clientes. O valor 
máximo da prestação não poderá ultrapassar 40% do salário bruto. Fazer 
um algoritmo que permita entrar com o salário bruto e o valor da prestação 
e informar se o empréstimo será concedido.
*/
package Unidade00.Introdução_ao_Java.If;

import java.util.Scanner;

public class Ex_If_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salário bruto:");
        float sal = scanner.nextFloat();
        System.out.println("Digite o valor da prestação:");
        float prest = scanner.nextFloat();
        scanner.close();
        if (prest <= (sal*0.4)) System.out.println("O empréstimo será concedido.");
        else System.out.println("O empréstimo não será concedido.");     
    }
}
