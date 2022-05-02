import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrayexample {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many subject");
        int n = Integer.parseInt(br.readLine());

        int [] marks = new int[n];

        for(int i = 0;i<n;i++){
            System.out.print("Enter marks :");
            marks [i] =Integer.parseInt(br.readLine());
        }

        int tot =0;

        for (int i=0;i<n;i++)
            tot = tot+marks[i];
        System.out.println("Total marks is "+tot);

        float percentage = tot/n;
        System.out.println("percentage is" +percentage);

    }

}
