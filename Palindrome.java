package Week1Assignments;



public class Palindrome {

    public static void main(String[] args) {
    
        int number = 12345;
        
     
        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is not a Palindrome.");
        }
    }

  
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0; 
        int remainder;
        
     
        while (number != 0) {
            remainder = number % 10; 
            reversedNumber = reversedNumber * 10 + remainder; 
            number /= 10; 
        }
        
        
        return originalNumber == reversedNumber;
    }
}
        
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
