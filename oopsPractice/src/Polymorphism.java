public class Polymorphism {
    public static void main(String[] args) {
        Commerial c = new Commerial();
        c.setName("Rohit");
        c.calculateBill(20);

        Domestic d = new Domestic();
        d.setName("Prasad");
        d.calculateBill(30);
    }
}

class Commerial {
   private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    void calculateBill(int unit){
        System.out.println("Name:" + getName());
        System.out.println("bill = " +(unit * 5.00));
    }
}

class Domestic extends Commerial{
    void calculateBill(int unit){
        System.out.println("Name:" + getName());
        System.out.println("Bill = " + (unit * 2));
    }
}