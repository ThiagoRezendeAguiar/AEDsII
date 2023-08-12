/*
Faça um programa que leia n números inteiros, armazene-os em um arquivo, leia-os do arquivo e mostre-os na tela.
*/

#include <stdio.h>

int main(){
    int n;
    scanf("%d",&n);

    FILE* arq = fopen("arquivo.txt","w");

    if (arq == NULL) {
        printf("Erro ao abrir o arquivo.\n");
        return -1;
    }

    printf("Digite os números:\n");
    for (int i = 0; i < n; i++) {
        int num;
        scanf("%d", &num);
        fprintf(arq, "%d\n", num);
    }

    fclose(arq);

    arq = fopen("arquivo.txt","r");

    if (arq == NULL) {
        printf("Erro ao abrir o arquivo.\n");
        return -1;
    }

    printf("Números lidos do arquivo:\n");
    int num;
    while (fscanf(arq, "%d", &num) != EOF) {
        printf("%d\n", num);
    }

    fclose(arq); 
    return 0;
}