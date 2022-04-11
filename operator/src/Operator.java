import java.util.Scanner;

public class Operator {

    public static void main(String [] args) {

        //Operator  +, -, /, *, %, ++, --

       /* int firstNumber = 25;
        int secondNumber = 3;

        //double is used for type casting
        double div = (double)firstNumber / (double)secondNumber;

        System.out.println("div = " + div);

        System.out.println(++firstNumber);

        secondNumber++;
        System.out.println(secondNumber); */


        //Taking  user input

        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int age = sc.nextInt();
        System.out.println(age); */



        //Condition operator <,>,<=,>=,==,!=

        //if else

        /*int ages = 19;

        if(ages > 18) {
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote");
        } */

        //if else if

        /*char grade= 'A';

        if(grade == 'A'){
            System.out.println("Very Good");
        }else if(grade == 'B'){
            System.out.println("Good");
        }else if(grade == 'C'){
            System.out.println("keep Improving");
        }else{
            System.out.println("grade not valid");
        }*/

        //switch case

        /*char grade = 'C';

        switch (grade){
            case 'A':
                System.out.println("Very Good");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("keep improving");
                break;
            default:
                System.out.println("Not valid grade");
        }*/


        // Logical operator  &&, ||, !

        int age = 20;

        if(age>18 && age<50){
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote");
        }



    }
}
