/*
Faça uma classe retângulo contendo os atributos base e altura, pelo menos dois métodos construtores, o método double getArea() que retorna a área do retângulo, o método 
double getPerimetro() que retorna o perímetro do retângulo e o método double getDiagonal() que retorna a diagonal do retângulo.
*/
package Unidade00.Introdução_OO;

public class Retangulo {
    private double base;
    private double altura;
    public Retangulo (){
        this.base = 1.0;
        this.altura = 1.0;
    }
    public Retangulo(double base , double altura){
       this.base = base;
       this.altura = altura;
    }
    public double getArea(){
        return base * altura;
    }
    public double getPerimetro(){
        return 2*(base + altura);
    }
    public double getDiagonal(){
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2)); 
    }
}