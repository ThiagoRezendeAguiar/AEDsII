/*
Leia dois números. Se um deles for maior que 45, realize a soma dos 
mesmos. Caso contrário, se os dois forem maior que 20, realize a subtração 
do maior pelo menor, senão, se um deles for menor do que 10 e o outro 
diferente de 0 realize a divisão do primeiro pelo segundo. Finalmente, se 
nenhum dos casos solicitados for válido, mostre seu nome na tela. 
*/

package Unidade00.Introdução_ao_Java.If;

import java.util.Scanner;

public class Ex_If_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x = scanner.nextInt();
        System.out.println("Digite outro número:");
        int y = scanner.nextInt();
        scanner.close();
        if (x > 45 || y > 45) {
            System.out.println("Soma: " + (x+y));
        }
        else if (x > 20 && y > 20){
            if(x > y) System.out.println("Subtração: " + (x-y));
            else System.out.println("Subtração: " + (y-x));
        }
        else if ((x > 10 && y != 0) || (y > 10 && x != 0)){
           System.out.println("Divisão: " + (x/y));
        }
        else{
            System.out.println("Thiago");
        }
    }
}
