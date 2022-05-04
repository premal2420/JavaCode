public class AbstractionExample {
    public static void main(String[] args) {
        sub1 sub1 = new sub1();
        sub2 sub2 = new sub2();
        sub3 sub3 = new sub3();

        sub1.calculate(10);
        sub2.calculate(25);
        sub3.calculate(10);
    }
}

abstract class Myclass1 {
    abstract void calculate(double x);
}

class  sub1 extends Myclass1{
    void calculate(double x){
        System.out.println("Square = "+(x*x));
    }
}


class sub2 extends Myclass1{
    void calculate(double x){
        System.out.println("Square root " + Math.sqrt(x));
    }
}

class sub3 extends Myclass1{
    void calculate(double x){
        System.out.println("Cube " + (x*x*x));
    }
}