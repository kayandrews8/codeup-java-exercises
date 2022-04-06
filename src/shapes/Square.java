package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side,side);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

//    public Square(int side){
//        super.length = side;
//        super.width = side;
//    }
//
//    public int getPerimeter(){
//        return 4 * super.length;
//    }
//
//    public int getArea(){
//        return super.length * super.width;
//    }

}
