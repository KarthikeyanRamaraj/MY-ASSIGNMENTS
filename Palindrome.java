package Week1Assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

  
        int input, output = 0;


        System.out.print("Enter a number: ");
        input = scanner.nextInt();


        int originalInput = input;

        
        for ( ; input != 0; input /= 10) {
            int remainder = input % 10;
            output = output * 10 + remainder;
        }

       
        if (originalInput == output) {
            System.out.println(originalInput + " is a palindrome.");
        } else {
            System.out.println(originalInput + " is not a palindrome.");
        }

       
        scanner.close();
    }
}
