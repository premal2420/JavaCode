import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arraysorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many element");
        int n =Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter Element");
            arr[i] = Integer.parseInt(br.readLine());
        }

        //use bubble sort techanic

        int limits = n-1;
        boolean flag = false;
        int temp;

        for(int i =0;i<limits;i++){
            for (int j=0;j<limits-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    flag = true; // swap done
                }

            }
            if(flag==false)
                break;
            else flag = false;
        }

        //display sorted array

        System.out.println("the sorted array is :");
        for (int i =0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
}
