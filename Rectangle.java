package sk.itsovy.jackanin.fragment;

public class Rectangle {
    private int a;
    private int b;
    private char character;
    private boolean fill;

    //GETTER & SETTER
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public char getCharacter() {
        return character;
    }
    public void setCharacter(char character) {
        this.character = character;
    }
    public boolean isFill() {
        return fill;
    }
    public void setFill(boolean fill) {
        this.fill = fill;
    }

    //CONSTRUCTOR
    public Rectangle(int a, int b, char character, boolean fill) {
        this.a = a;
        this.b = b;
        this.character = character;
        this.fill = fill;
    }

    public int calcArea(){
        return a*b;
    }

    public int calcPerimeter(){
        return 2*a+2*b;
    }

    public double calcDiagonal(){
        return Math.sqrt(a*a+b*b);
    }

    public void showRectangle(){
        for (int i=1; i<=a; i++){
            for (int j=1; j<=b; j++){
                if (fill){
                    if (i!=1 || i!=a || j!=1 || j!=b){
                        System.out.print(character);
                    } else
                        System.out.print("#");
                }else{
                    if (i==1 || i==a || j==1 || j==b)
                        System.out.print(character);
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "Rectangle: a = "+a+", b = "+b;
    }
}
