package encapsulation;

public class Encapsulation {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setPrice(20);
        System.out.println(l1.getPrice());

    }
    public void doWork(){
        System.out.println("Worked worked");
    }
}

class Laptop {
    int ram;
  private int price;

    public void setPrice(int price) {
        Boolean isValid = true;
        if(!isValid){
            System.out.println("you can not set price");
        }else {
            this.price = price;
        }

    }

    public int getPrice() {
        return price;
    }
}