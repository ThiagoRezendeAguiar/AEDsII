/*
Faça também uma classe Lixao contendo um método main sendo que esse terá dois objetos do tipo retângulo e chamará os métodos desenvolvidos na classe retângulo. 
*/
package Unidade00.Introdução_OO;

public class LixaoRetangulo {
    public static void main(String[] args){
        Retangulo ret1 = new Retangulo(5,4);
        Retangulo ret2 = new Retangulo();

        System.out.println("Retangulo 1:");
        System.out.println("Área: " + ret1.getArea());
        System.out.println("Perímetro: " + ret1.getPerimetro());
        System.out.println("Diagonal: " + ret1.getDiagonal());

        System.out.println("\nRetangulo 2:");
        System.out.println("Área: " + ret2.getArea());
        System.out.println("Perímetro: " + ret2.getPerimetro());
        System.out.println("Diagonal: " + ret2.getDiagonal());
    }
}
