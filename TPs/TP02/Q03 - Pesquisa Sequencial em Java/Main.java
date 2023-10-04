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
            int c = 0;

            Scanner in = new Scanner(System.in);
            BufferedReader br = null;

            // Criar vetor de jogadores
            Jogador[] jogadores = new Jogador[49];

            int k = 0;
            String id = in.nextLine();

            // Pegar os Ids de entrada e preencher o vetor de jogadores
            while (!isFim(id)) {
                br = new BufferedReader(new FileReader("/tmp/players.csv"));
                int linhaDesejada = Integer.parseInt(id) + 2;
                int linhaAtual = 1;
                String linha;

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

            String nome = in.nextLine();

            // Fazer as pesquisas sequenciais
            while (!isFim(nome)) {

                if (search(nome, jogadores)) {
                    System.out.println("SIM");
                } else {
                    System.out.println("NAO");
                }

                c += jogadores.length;

                nome = in.nextLine();
            }

            in.close();

            long end = System.currentTimeMillis();
            criarLog("812573\t" + (end - start) + "ms\t" + c);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static boolean search(String nome, Jogador[] jogadores) {
        boolean resp = false;
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i].getNome().equals(nome)) {
                resp = true;
                i = jogadores.length;
            }
        }
        return resp;
    }

    public static void criarLog(String m) {
        try {
            FileWriter arquivo = new FileWriter("matrícula_sequencial.txt");
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
