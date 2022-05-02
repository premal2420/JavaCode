import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InnerExample {
    public static void main(String[] args) throws IOException {
        Bankacc bankacc = new Bankacc(50000);
        bankacc.contact(19);
    }
}

class Bankacc{
   private double bal;

   Bankacc(double bal){
        this.bal = bal;
    }

    void contact (double rate) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Password");
       String pass = br.readLine();
       if(pass.equalsIgnoreCase("1234")){

          Interest in = new Interest(rate);
          in.calcualteInterest();
       }
       else{
           System.out.println("You are not an authorized");
           return;
       }

    }

    //inner class
    private class Interest{

       private double rate;

       Interest(double rate){
           this.rate = rate;
       }

       void calcualteInterest(){
           double interest = bal*rate/100;
           bal = bal + interest;
           System.out.println("update balance=" + bal  );
       }

    }

}