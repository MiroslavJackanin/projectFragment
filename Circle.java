package sk.itsovy.jackanin.fragment;

public class Circle {
    private int r;

    //GETTER & SETTER
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }

    //CONSTRUCTOR
    public Circle(int r) {
        this.r = r;
    }

    public double calcArea(){
        return Math.PI*r*r;
    }

    public double calcPerimeter(){
        return 2*Math.PI*r;
    }

    public int calcDiameter(){
        return 2*r;
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "Circle : r = "+r+", d = "+calcDiameter();
    }
}
