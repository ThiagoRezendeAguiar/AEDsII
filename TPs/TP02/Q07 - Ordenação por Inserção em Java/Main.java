import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();

            Scanner in = new Scanner(System.in);
            BufferedReader br = null;

            // Criar vetor de jogadores
            Jogador[] jogadores = new Jogador[463];

            int k = 0;
            String id = in.nextLine();

            // Pegar os Ids de entrada
            while (!isFim(id)) {
                br = new BufferedReader(new FileReader("/tmp/players.csv"));
                int linhaDesejada = Integer.parseInt(id) + 2;
                int linhaAtual = 1;
                String linha;

                // Preencher o vetor de jogadores
                while ((linha = br.readLine()) != null) {
                    if (linhaAtual == linhaDesejada) {
                        jogadores[k] = new Jogador();
                        jogadores[k].ler(linha);
                        k++;
                        break;
                    }

                    linhaAtual++;
                }

                id = in.nextLine();
                br.close();
            }

            in.close();

            int c = sort(jogadores);

            for (int i = 0; i < jogadores.length; i++) {
                jogadores[i].imprimir();
            }

            long end = System.currentTimeMillis();
            criarLog("812573\t" + (end - start) + "ms\t" + c);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static int sort(Jogador[] jogadores) {
        int c = 0;

        for (int i = 1; i < jogadores.length; i++) {
            Jogador aux = jogadores[i].clone();

            int j = i - 1;
            while ((j >= 0) && ((jogadores[j].getAnoNascimento() > aux.getAnoNascimento()) || (jogadores[j].getAnoNascimento() == aux.getAnoNascimento() && jogadores[j].getNome().compareTo(aux.getNome()) > 0))) {
                jogadores[j + 1] = jogadores[j];
                j--;
                c += 2;
            }
            jogadores[j + 1] = aux;
        }

        return c;
    }

    public static void criarLog(String m) {
        try {
            FileWriter arquivo = new FileWriter("matrícula_insercao.txt");
            PrintWriter gravador = new PrintWriter(arquivo);
            gravador.println(m);

            gravador.close();
            arquivo.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static boolean isFim(String str) {
        return str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M';
    }
}
