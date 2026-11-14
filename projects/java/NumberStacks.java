//**********************************
// Course: COSC-1337-8B
// Name: Ramon Merritt
// Date: 11/20/25
// PrimeNumberStacks
//**********************************
import java.util.*;


public class NumberStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a stack that holds Integers.
        PrimeStacks<Integer> stack = new PrimeStacks<Integer>();
        
        // Start from 2, because 1 is not a prime number.
        int number = 2; 

        // This variable will count how many prime numbers we have found so far.
        int count = 0;   

        // We want to find the first 50 prime numbers so we keep looping until count becomes 50
        while (count < 50) {

            // Check if the current number is a prime number using our helper method isPrime.
            if (isPrime(number)) {
                // If the number is prime, push it onto the stack.
                stack.push(number);

                // Increase the count of primes found by 1.
                count++;
            }

            // Move on to the next number to test.
            number++;
        }


        // Print a message to the user.
        System.out.println("First 50 prime numbers in descending order:");

        // popping the numbers will give them to us from largest to smallest.
        while (!stack.isEmpty()) {

            // Pop the top number from the stack and store it in a variable.
            int prime = (int) stack.pop();

            // Print the popped prime number
            System.out.print(prime + " ");
        }

        System.out.println();
    }

    // This is a helper method that checks whether a given integer n is prime.
    // It returns true if n is prime, and false if n is not prime.
    public static boolean isPrime(int n) {

        // If n is less than 2, it cannot be a prime number.
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            // If n is divisible by i then n is not a prime number.
            if (n % i == 0) {
                return false; 
            }
        }

        return true;

	}

}
