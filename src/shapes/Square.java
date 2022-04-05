package Shapes;

public class Square extends Rectangle{

    public Square(int side){
        super.length = side;
        super.width = side;
    }

    public int getPerimeter(){
        return 4 * super.length;
    }

    public int getArea(){
        return super.length * super.width;
    }

}
