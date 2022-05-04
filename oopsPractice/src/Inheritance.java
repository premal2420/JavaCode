public class Inheritance {
    public static void main(String[] args) {
        Square square = new Square(10);
        square.area();
        Rectangle rectangle = new Rectangle(10,5);
        rectangle.area();
    }
}

class Shape{
   protected double i ;

    Shape(double i){
        this.i = i;
    }
    void area(){
        System.out.println(" values of "+i);
    }
}

class Square extends Shape{

    Square(double i){
        super(i);
    }

    void area(){
        super.area();
        System.out.println("area of sqare="+(i*i));
    }

}

class Rectangle extends Shape{
   private double b;
    Rectangle(double a,double y){
        super(a);
        b=y;
    }

    void area(){

        System.out.println("area of rectangle= "+(i*b));
    }
}