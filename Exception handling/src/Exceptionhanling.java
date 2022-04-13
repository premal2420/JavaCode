public class Exceptionhanling {

    static  public void main(String [] args){
        int a[] = new int[3];
            a[2] = 5;
            try {
                System.out.println(a[4]);
                //System.out.println(2/0);
            }//catch (Exception e){
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error");
                System.out.println(e.getLocalizedMessage());
            }catch (ArithmeticException e){
                System.out.println(e.getLocalizedMessage());
            }
        System.out.println("another line");


    }
}
