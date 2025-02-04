package Week1Assignments;

public class IsPrimeNumber {

    public static void main(String[] args) {

        int number = 37; 
        

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

   
    public static boolean isPrime(int number) {
     
        if (number <= 1) {
            return false;
        }

       
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true; 
    }
}
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; 
        } else {
           
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }

       
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


        scanner.close();
    }
}
