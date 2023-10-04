import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

class Jogador {
    private int id;
    private String nome;
    private int altura;
    private int peso;
    private String universidade;
    private int anoNascimento;
    private String cidadeNascimento;
    private String estadoNascimento;

    public Jogador() {
        this(0," ",0,0," ",0," "," ");
    }

    public Jogador(int id, String nome, int altura, int peso, String universidade, int anoNascimento,
            String cidadeNascimento, String estadoNascimento) {
        setId(id);
        setNome(nome);
        setAltura(altura);
        setPeso(peso);
        setUniversidade(universidade);
        setAnoNascimento(anoNascimento);
        setCidadeNascimento(cidadeNascimento);
        setEstadoNascimento(estadoNascimento);
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getPeso() {
        return this.peso;
    }

    public String getUniversidade() {
        return this.universidade;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public String getCidadeNascimento() {
        return this.cidadeNascimento;
    }

    public String getEstadoNascimento() {
        return this.estadoNascimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public void imprimir() {
        System.out.println("[" + this.id + " ## " + this.nome + " ## " + this.altura + " ## " + this.peso + " ## "
                + this.anoNascimento + " ## " + this.universidade + " ## " + this.cidadeNascimento + " ## "
                + this.estadoNascimento + "]");
    }

    public Jogador clone(){
        Jogador clone = new Jogador();
 
        clone.setId(this.id);
        clone.setNome(this.nome);
        clone.setAltura(this.altura);
        clone.setPeso(this.peso);
        clone.setUniversidade(this.universidade);
        clone.setAnoNascimento(this.anoNascimento);
        clone.setCidadeNascimento(this.cidadeNascimento);
        clone.setEstadoNascimento(this.estadoNascimento);

        return clone;
    }

    public void ler(String str){
        String[] partes = {"","","","","","","",""};

        int j = 0;
        for(int i = 0; i < str.length(); i++){
            if( str.charAt(i) != ','){
              partes[j] += str.charAt(i);
            }else if(str.charAt(i) == ','){
                j++;
            }   
        }

        for(int i = 0; i < partes.length; i++){
            if(partes[i] == ""){
                partes[i] = "nao informado";
            }
        } 

        setId(Integer.parseInt(partes[0]));
        setNome(partes[1]);
        setAltura(Integer.parseInt(partes[2]));
        setPeso(Integer.parseInt(partes[3]));
        setUniversidade(partes[4]);
        setAnoNascimento(Integer.parseInt(partes[5]));
        setCidadeNascimento(partes[6]);
        setEstadoNascimento(partes[7]);
        
    }
}


public class Main {
    public static void main(String[] args){
       String[] data = new String[3923];
       lerArq(data);

       Scanner in = new Scanner(System.in);
       ArrayList<Jogador> jogadores = new ArrayList<>();
       String id = in.nextLine();
       while(!isFim(id)){
        Jogador jogador = new Jogador();
        jogador.ler(data[Integer.parseInt(id) + 1]);
        jogadores.add(jogador);
       
        id = in.nextLine();
       }

       in.close();

       for(int i = 0; i < jogadores.size(); i++){
        jogadores.get(i).imprimir();
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
