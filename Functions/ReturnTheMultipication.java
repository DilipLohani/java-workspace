package Functions;
import java.util.*;
public class ReturnTheMultipication {

    public static int Multiplcation(int a, int b){

      return (a*b);

    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        
     System.out.println("The Multiplication of your number is " + Multiplcation(a,b));


    }
}
