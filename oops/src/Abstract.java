public class Abstract {

    public static void main(String[] args) {

        Tata t1 = new Tata();
        t1.start();
    }
}

class Tata extends Car{


    @Override
    void start() {
        System.out.println("tata is start");

    }
}

class Bmw extends Car{
    @Override
    void start() {
        System.out.println("Bmw is start");
    }
}

abstract class Car{
    int price;
   abstract void start();
}
