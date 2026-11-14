//**********************************
// Course: COSC-1174-8B
// Name: Ramon Merritt
// Date: 11/7/25
// SortingNumbers
//**********************************
import java.util.Arrays;   // Import the Arrays class for sorting
import java.util.Random;   // Import the Random class to generate random numbers


public class SortingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Define an array of sizes we will test
        int[] sizes = {50000, 100000, 150000, 200000, 250000, 300000};
        
        // Create a Random object to generate random integers
        Random number = new Random();

        // Print table header
        System.out.printf("%-10s | %-15s\n", "Array Size", "Sort Time (ms)");
        System.out.println("------------------------------");

        // Loop through each array size
        for (int size : sizes) {
            
            // Create an array of integers with the given size
            int[] numbers = new int[size];

            // Fill the array with random integers between 0 and 999999
            for (int i = 0; i < size; i++) {
                numbers[i] = number.nextInt(1000000);
            }

            // Record start time before sorting
            long startTime = System.currentTimeMillis();

            // Sort the array using Java's built-in efficient sort method
            Arrays.sort(numbers);

            // Record end time after sorting
            long endTime = System.currentTimeMillis();

            // Calculate execution time by subtracting start from end
            long executionTime = endTime - startTime;

            // Print the result as a table row
            System.out.printf("%-10d | %-15d\n", size, executionTime);
        }

	}

}
