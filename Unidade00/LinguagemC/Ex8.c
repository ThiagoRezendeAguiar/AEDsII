/*
Faça um programa que leia n números inteiros e os mostre em ordem inversa sem usar arrays.
*/

#include <stdio.h>

void ordemInversa() {
    int num;
    
    scanf("%d", &num);
    
    if (num == 0) {
        return;
    }
    
    ordemInversa();
    
    
    printf("%d ", num);
}

int main() {
    printf("Digite uma sequência de números inteiros (0 para parar):\n");
    
    ordemInversa();
    
    printf("\n");
    return 0;
}
