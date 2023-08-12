/*
Leia o nome de dois arquivos e copie o conteúdo do primeiro para o último.
*/

public class Ex_Arq_4 {
    public static void main(String[] args){
        System.out.print("Digite o nome do primeiro arquivo: ");
        String nomeArq1 = MyIO.readLine();

        System.out.print("Digite o nome do segundo arquivo: ");
        String nomeArq2 = MyIO.readLine();

        Arq.openRead(nomeArq1);
        String str = Arq.readAll();
        Arq.close();

        Arq.openWrite(nomeArq2);
        Arq.print(str);
        Arq.close();
    }
}
