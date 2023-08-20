/*
Leia o nome de dois arquivos e copie o conteúdo do primeiro 
para o segundo invertendo a ordem dos caracteres. O último 
caractere no arquivo de entrada será o primeiro do de saída, o 
penúltimo caractere será o segundo, ... 
*/

public class Ex_Arq_6{
    public static void main(Strng[] args){
        System.out.print("Digite o nome do primeiro arquivo: ");
        String nomeArq1 = MyIO.readLine();

        System.out.print("Digite o nome do segundo arquivo: ");
        String nomeArq2 = MyIO.readLine();

        Arq.openRead(nomeArq1);
        String str = Arq.readAll();
        StringBuilder reversed = new StringBuilder(str);
        String resp = reversed.reverse().toString();
        Arq.close();

        Arq.openWrite(nomeArq2);
        Arq.print(resp);
        Arq.close();
    }
}