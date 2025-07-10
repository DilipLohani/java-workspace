package Functions;

import java.util.Scanner;

public class FindFactorial {

    public static void PrintFactorial(int n){


        if(n<=0){
            System.out.println("The number is Invalid");
            return;
        }

        int factorial = 1;

        for(int i=n; i>=1; i--){

            factorial = factorial*i;
            
        }

        System.out.println(factorial);
        return;

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any number");
        int n = sc.nextInt();

       PrintFactorial(n);


    }
}
