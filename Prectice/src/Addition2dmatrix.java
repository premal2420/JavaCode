import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Addition2dmatrix {
    public static void main(String [] args) throws IOException {
    Matrix obj1 = new Matrix(2,2);
    Matrix obj2 = new Matrix(2,2);

    int x[][],y[][],z[][];

    x=obj1.getMatrix();
    y=obj2.getMatrix();

    z = obj1.findsum(x,y);
    obj1.displayMatrix(z);

    }

}

class Matrix {
    int  r,c;
    int arr[][];

    //initialize r,c and allot memory for array

    Matrix(int r,int c){
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }

    //accept 2D array from keyboard and return it
    int[][] getMatrix() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        for (int i= 0;i<r;i++){
            String s = br.readLine();
            st = new StringTokenizer(s," ");
            for (int j=0;j<c;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());

        }
        return arr;
    }

    //accept 2d arrays and find sum matrix and return it

    int[][] findsum(int a[][],int b[][]){
        int temp[][] = new int[r][c];

        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                temp[i][j] = a[i][j] + b[i][j];
            return temp;
    }

    //Display the result 2d array as a matrix
    void displayMatrix(int res[][]){
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}