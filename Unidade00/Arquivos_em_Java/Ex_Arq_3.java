/*
Leia o nome de um arquivo e mostre seu conteúdo convertido para letras maiúscula.
*/

public class Ex_Arq_3 {
    public static void main(String[] args){
        System.out.print("Digite o nome do arquivo: ");
        String nomeArq = MyIO.readLine();

        Arq.openRead(nomeArq);
        String str = Arq.readAll();
        Arq.close();

        System.out.println(str.toUpperCase());
    }
}
