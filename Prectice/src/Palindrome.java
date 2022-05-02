import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String: ");
        String str = br.readLine();

        String temp = str;

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
        str =sb.toString();

        if(temp.equalsIgnoreCase(str))
            System.out.println(temp + " is palinddrome");
        else
            System.out.println(temp + " is not palindrome");

    }
}
