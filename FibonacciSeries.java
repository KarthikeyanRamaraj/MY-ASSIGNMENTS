package Week1Assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
			       
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the number of terms for Fibonacci series: ");
		        int n = scanner.nextInt();

		         if (n <= 0) {
		            System.out.println("Please enter a positive integer greater than 0.");
		        } 
		         else {
		            
		            int first = 0, second = 1;

		            System.out.print("Fibonacci Series: " + first);

		            if (n > 1) {
		                System.out.print(", " + second);
		            }

		                for (int i = 3; i <= n; i++) {
		                int next = first + second;
		                System.out.print(", " + next);

		               first = second;
		                second = next;
		            }
		            System.out.println(); // Print a new line after the series
		        }

		 		        scanner.close();
		    }
		}
