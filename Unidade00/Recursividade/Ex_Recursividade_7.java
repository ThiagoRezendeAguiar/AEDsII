/*
Faça um método recursivo para cada um dos problemas abaixo.

------------------------------------------------------------
T(0) = 1
T(1) = 2
T(n) = T(n-1) * T(n-2) - T(n-1)
------------------------------------------------------------

------------------------------------------------------------
T(0) = 1
T(n) = T(n-1)^2
------------------------------------------------------------

*/
package Unidade00.Recursividade;

public class Ex_Recursividade_7 {
    public static void main(String[] args){
        int n = 5;
        System.out.println("Problema 1: " + problema1(n));
        System.out.println("Problema 2: " + problema2(n));
    }

    public static int problema1(int n){
        if(n == 0) return  1;
        else if (n == 1) return  2;
        else return problema1(n-1) * problema1(n-2) - problema1(n-1);
    }

    public static int problema2(int n){
        if(n == 0) return 1;
        else return problema2(n-1) * problema2(n-1);
    }
}
