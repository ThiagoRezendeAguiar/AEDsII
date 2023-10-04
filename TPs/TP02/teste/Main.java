package TP02.teste;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       String[] data = new String[3923];
       lerArq(data);

       Scanner in = new Scanner(System.in);
       Jogador[] jogadores = new Jogador[40];
       int k = 0;
       String id = in.nextLine();
       while(!isFim(id)){
         
        jogadores[k] = new Jogador();
        jogadores[k].ler(data[Integer.parseInt(id) + 1]);

        k++;
        id = in.nextLine();
       }

       in.close();

       for(int i = 0; i < jogadores.length; i++){
        jogadores[i].imprimir();
       }
    }

    public static void lerArq(String[] data){
        try {

            BufferedReader br = new BufferedReader(new FileReader("/tmp/players.csv"));
            int i = 0;
            String linha;

            while ((linha = br.readLine()) != null){
                data[i] = linha;
                i ++;
            }

            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static boolean isFim(String str) {
        return str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M';
    }
}
