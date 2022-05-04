public class ExceptionHandling {
    public static void main(String [] args){
        int a=10,b=10,c;

        int arr[] = {10,20};

            //we can use try catch,finally,throws and throw(user define eception)
        try{
            c= a/b;
            System.out.println(c);

            System.out.println();
            arr[3]=100;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        finally {
            System.out.println("File close ");
        }
    }

}
