//To find of sum two numbers
public class Practice {
    public static  void main(String [] args){
        // store values into variables
        int a = 5;
        int b = 10;

        //calculate sum and store result into z

        int z = a + b;

        //to display result
        System.out.println("sum of two number = " + z);
        System.out.println();
        System.out.println("sum of two number = " + (a + b));

        Sum sum = new Sum( 5,6);
        System.out.println(sum.r);

    }

}


  class Sum {
    int p;
    int q;
    int r;

        Sum(int p , int q){

            r = p + q;
        }
  }


