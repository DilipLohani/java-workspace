package Functions;

import java.util.*;

public class printMyName {


    public static void Myname(String name){

        System.out.println(name);

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = sc.next();

       Myname(name);

    }
}
