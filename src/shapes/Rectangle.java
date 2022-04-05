package Shapes;

public class Rectangle {
    protected int length;
    protected int width;

    Rectangle(){}

    public Rectangle(int length, int width){
        this.width = width;
        this.length = length;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return (this.length *2) + (this.width *2);
    }

}
