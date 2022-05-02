public class FactDemo {
    public static void main(String [] args) {
        System.out.println(Fact.fact(5));
    }
}

//non recursion
/*class Fact{
   static long fact(int num){
      long fact=1;

      while(num>0) {
          fact = fact * num;
          num--;
      }
       return fact;
      }

}*/

//recursion

class Fact{
    static long fact(int num){
        long result;

        if(num==1)
            return  1;
        result = fact(num-1)*num;
        return result;
    }
}