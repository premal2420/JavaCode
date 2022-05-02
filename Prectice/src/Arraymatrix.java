import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Arraymatrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row,column");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr [][]= new int[r][c];

        System.out.println("Enter element of matrix: ");
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                arr[i][j]= sc.nextInt();

        System.out.println("matrix transpose: ");

        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
