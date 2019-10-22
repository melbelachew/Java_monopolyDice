import java.util.Random;
import java.util.Scanner;

public class Java_Monopoly {

    public static void main(String[] args) {

        Random r = new Random();
        int num1 = 1 + r.nextInt(1);
        int num2 = 1 + r.nextInt(1);

//        System.out.println(num1);
//        System.out.println(num2);



        int roll = 0;

        while (roll<3){
            if(num1!=num2){
                System.out.println("User rolls " + num1 + " & " + num2 );
                System.out.println("Move " + (num1+num2) + " spaces and stop" );
            }
            else if (num1 == num2) {

                roll++;
                System.out.println(roll);

                if(roll==3){
                    System.out.println("User rolls " + num1 + " & " + num2 );
                    System.out.println("Go to jail");
                    break;
                }
                System.out.println("User rolls " + num1 + " & " + num2 );
                System.out.println("Move " + (num1+num2) + " spaces and roll again getting");
                num1 = 1 + r.nextInt(1);
                num2 = 1 + r.nextInt(1);
            }
        }

    }

}



