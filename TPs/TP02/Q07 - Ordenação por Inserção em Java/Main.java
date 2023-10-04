import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();

            Scanner in = new Scanner(System.in);
            BufferedReader br = null;

            // Criar vetor de jogadores
            ArrayList<Jogador> jogadores = new ArrayList<>();

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
                        Jogador jogador = new Jogador();
                        jogador.ler(linha); 
                        jogadores.add(jogador);
                        break;
                    }

                    linhaAtual++;
                }

                id = in.nextLine();
                br.close();
            }

            in.close();

            int c = sort(jogadores);

            for (int i = 0; i < jogadores.size(); i++) {
                jogadores.get(i).imprimir();
            }

            long end = System.currentTimeMillis();
            criarLog("812573\t" + (end - start) + "ms\t" + c);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static int sort(ArrayList<Jogador> jogadores) {
        int c = 0;

        for (int i = 1; i < jogadores.size(); i++) {
            Jogador aux = jogadores.get(i).clone();

            int j = i - 1;
            while ((j >= 0) && ((jogadores.get(j).getAnoNascimento() > aux.getAnoNascimento()) || (jogadores.get(j).getAnoNascimento() == aux.getAnoNascimento() && jogadores.get(j).getNome().compareTo(aux.getNome()) > 0))) {
                jogadores.set(j + 1, jogadores.get(j));
                j--;
                c += 2;
            }
            jogadores.set(j + 1, aux);
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
