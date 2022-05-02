import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeDemo {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many prime number");
        int max = Integer.parseInt(br.readLine());
        Prime.generate(max);


    }
}


class Prime{

     static boolean prime(long num){
         boolean isPrime = true;

         for (int i=2;i<num-1;i++)
             if (num % i==0)
                 isPrime = false;
             return isPrime;

    }

    static void generate(long max){
         long c=1 , num =2;
         while(c<=max){
             if (prime(num)){
                 System.out.println(num);
                 ++c;
             }
             ++num;

         }
    }

}