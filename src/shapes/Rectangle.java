package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


//
//    Rectangle(){}
//
//    public Rectangle(int length, int width){
//        this.width = width;
//        this.length = length;
//    }
//
//    public int getArea(){
//        return this.length * this.width;
//    }
//
//    public int getPerimeter(){
//        return (this.length *2) + (this.width *2);
//    }

}
