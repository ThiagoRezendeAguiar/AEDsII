/*
Seja uma partida de futebol, leia os números de gols do mandante e do visitante e imprima quem foi o vencedor ou se foi empate.
*/
package Unidade00.Introdução_ao_Java.If;
import java.util.Scanner;

public class Ex_If_5 {
    public static void main(String[] args){
      Scanner scanner = new Scanner (System.in);
      System.out.println("Digite o número de gols do mandante:");
      int golsM = scanner.nextInt();
      System.out.println("Digite o número de gols do visistante:");
      int golsV = scanner.nextInt();
      if(golsM != golsV){
        if(golsM > golsV) System.out.println("O mandante foi o vencedor.");
        else System.out.println("O visitante foi o vencedor.");
      }
      else System.out.println("Ocorreu um empate.");
      scanner.close();
    }
}
