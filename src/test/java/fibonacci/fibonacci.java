package fibonacci;

import java.util.Scanner;

public class fibonacci {
    /*
    Coding: Fibonacci - print n first numbers (n is given by the user)
            1st solution - recursion
            2nd solution - for loop

     */
    public static int fibonacci_numbers(int numberN){
        if (numberN==0){
            return 0;
        }
        if (numberN==1){
            return 1;
        }
        else{
            return fibonacci_numbers(numberN-2) + fibonacci_numbers(numberN-1);
        }
    }

    public static void main (String args[]){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");

        int numberN = myObj.nextInt();  // Read user input
        int n = numberN;
        for(int i = 0; i <= n; i++){
            System.out.print (fibonacci_numbers(i));
        }
    }
}
