package Unidade00.Introdução_OO;

public class Ponto {
    private double x;
    private double y;
    private int id;
    private static int nextID = 0;

    public Ponto() {
        setX(0);
        setY(0);
        this.id = nextID;
        nextID++;
    }

    public Ponto(double x, double y) {
        setX(x);
        setY(y);
        this.id = nextID;
        nextID++;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public static int getNextID() {
        return nextID;
    }

    public double dist(Ponto p) {
        return Math.sqrt(Math.pow((this.x - p.getX()), 2) + Math.pow((this.y - p.getY()), 2));
    }

    public double dist(double x, double y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    public static double dist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static boolean isTriangulo(Ponto p1, Ponto p2, Ponto p3){
        return p1.dist(p2) + p2.dist(p3) > p1.dist(p3) && p1.dist(p2) + p1.dist(p3) > p2.dist(p3) &&  p2.dist(p3) + p1.dist(p3) > p1.dist(p2);
    }

    public double getAreaRetangulo(Ponto p){
        return (p.getX() - this.x) * (p.getY() - this.y);
    }
}