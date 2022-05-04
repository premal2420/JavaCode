public class Abstractionexample2 {
    public static void main(String[] args) {
        Swift swift = new Swift(1000);
        Santro santro = new Santro(2000);

       /* Car ref;
        ref=swift;
        ref.openTank();
        ref.steering(100,50);
        ref.braking(10);
                          */
        Car ref;
        ref=santro;
        ref.openTank();
        ref.steering(100,50);
        ref.braking(10);
    }
}

abstract class Car
{
    int regno;
    Car(int regno){
        this.regno = regno;
    }

    void openTank(){
        System.out.println("Fill the Tank");
    }

    abstract  void steering(int direction , int angle);

    abstract  void braking(int force);
}


class Swift extends Car{
    int regno;

    Swift(int regno){
        super(regno);
    }

    void steering(int direction , int angel){
        System.out.println("Take a turn");
        System.out.println("This is ordinary steering");
    }

    void braking(int force){
        System.out.println("break appiled");
        System.out.println("this are hydraulic brakes");
    }

}

class Santro extends Car{
    int regno;
    Santro(int regno){
        super(regno);
    }


    void steering(int direction, int angle) {
        System.out.println("Take a turn");
        System.out.println("this car uses power steering ");
    }

    void braking(int force) {
        System.out.println("brakes appiled");
        System.out.println("this car uses gas brakes");
    }
}