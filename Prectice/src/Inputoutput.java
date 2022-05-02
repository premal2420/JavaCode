import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputoutput {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        System.out.println("Enter your name");
        String name1 = br.readLine();
        System.out.println("Your name is " + name1);


        System.out.println("Enter number");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Your number is "+ num);
         */


        System.out.println("Enter id");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter your name");
        String name = br.readLine();
        System.out.println("Sex M/F");
        char sex = (char) br.read();

        System.out.println(id);
        System.out.println(name);
        System.out.println(sex);

    }
}
