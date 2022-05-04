public class AbstractionExample3 {
    public static void main(String[] args) {
        Plan p;
        p = new Commericalplan();
        p.getrate();
        p.billcalculate(1);

        p= new Domesticplan();
        p.getrate();
        p.billcalculate(20);
    }
}

abstract class Plan{
 protected double rate;

 public abstract void getrate();

 public void billcalculate(int unit){
     System.out.println("Enter unit");
     System.out.println("total bill :" +(rate * unit));
 }
}

class Commericalplan extends Plan{

    public void getrate() {
       rate = 2.05;
    }
}

class  Domesticplan extends Plan{
    public void getrate(){
        rate = 5.00;
    }
}