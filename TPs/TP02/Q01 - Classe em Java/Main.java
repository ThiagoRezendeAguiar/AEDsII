import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            BufferedReader br = null;

            ArrayList<Jogador> jogadores = new ArrayList<>();
            String id = in.nextLine();

            while (!isFim(id)) {
                br = new BufferedReader(new FileReader("/tmp/players.csv"));
                int linhaDesejada = Integer.parseInt(id) + 2;
                int linhaAtual = 1;
                String linha;

                while ((linha = br.readLine()) != null) {
                    if (linhaAtual == linhaDesejada) {
                        Jogador jogador = new Jogador();
                        jogador.ler(linha);
                        jogadores.add(jogador);
                        jogador.imprimir();
                        break;
                    }

                    linhaAtual++;
                }

                id = in.nextLine();
                br.close();
            }

            in.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static boolean isFim(String str) {
        return str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M';
    }
}
