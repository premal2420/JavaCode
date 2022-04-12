public class Loop {

    public static void main(String[] args) {

        // for loop

       /* for(int i=0;i < 10; i++){
            System.out.println("Hello" + i);
        } */

        // while loop

        int a = 23;
        /*
        while(true){
            System.out.println(a);
            a++;
            if(a > 100){
               break;
            }
        }*/

       /* while(a<100){
            System.out.println(a);
            a++;
        } */

        /*while(a<100){
            a++;
            if(a==95) continue;
            System.out.println(a);
        }*/

        //do while

        do {
            System.out.println(a);
            a++;
        }while(a<100);

    }
}
