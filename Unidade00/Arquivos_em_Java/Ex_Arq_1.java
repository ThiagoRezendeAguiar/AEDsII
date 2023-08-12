/*
Leia o nome de um arquivo e uma frase e salve essa frase nesse arquivo.
*/
public class Ex_Arq_1 {
    public static void main(String[] args){
        System.out.print("Digite o nome do arquivo: ");
        String nomeArq = MyIO.readLine();

        System.out.print("Digite a frase que você deseja salvar nesse arquivo: ");
        String frase = MyIO.readLine();

        Arq.openWrite(nomeArq);
        Arq.print(frase);
        Arq.close();
    }
}
