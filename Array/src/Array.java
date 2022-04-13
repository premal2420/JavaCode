public class Array {

    public static void main(String [] args){

      /*  int marks[] = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        int mark[] = {10,20,30,40,50};

        for (int i =0;i<mark.length;i++){
            System.out.println(marks[i]);
        }*/

        /*int a[][] = new int[2][2];
        a[0][0] = 1;
        a[0][1] =2;
        a[1][0] =3;
        a[1][1] = 4;
        System.out.println(a[1][1]); */

        int a[][] = {{1,2},{3,4}};
        for(int i= 0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
