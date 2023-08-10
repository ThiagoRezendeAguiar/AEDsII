/*
Declare um vetor contendo os elementos 10, 5, 8, 2 e 8. Em seguida, mostre os elementos contidos no array.
*/
package Unidade00.Introdução_ao_Java.Array;

public class Ex_Array_9 {
    public static void main(String[] args){
        int[] vetor = {10,5,8,2,8};
        for(int i = 0; i < 5; i++){
           System.out.print(vetor[i] + " ");
        }
    }
}
