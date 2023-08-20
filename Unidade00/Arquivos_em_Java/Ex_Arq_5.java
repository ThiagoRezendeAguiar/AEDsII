/*
Leia o nome de dois arquivos, abra o primeiro, converta seu conteúdo para letra maiúscula e salve o no segundo.
*/

public class Ex_Arq_5{
    public static void main(String[] args){
        System.out.print("Digite o nome do primeiro arquivo: ");
        String nomeArq1 = MyIO.readLine();

        System.out.print("Digite o nome do segundo arquivo: ");
        String nomeArq2 = MyIO.readLine();

        Arq.openRead(nomeArq1);
        String str = Arq.readAll();
        String strUpper = str.toUpperCase();
        Arq.close();

        Arq.openWrite(nomeArq2);
        Arq.print(strUpper);
        Arq.close();
    }
}