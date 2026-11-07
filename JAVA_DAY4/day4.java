package JAVA_DAY4;

public class day4 {
    public static void main(String[] args) {

        // Step 1: Create an integer array with 10 numbers.
        // The array has values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Step 2: Print each number one by one using a for loop.
        // Here, i starts from 0 and goes up to num.length - 1.
        // num.length gives the total number of elements in the array.
        for (int i = 0; i < num.length; i++) {
            // num[i] means the element present at index i.
            System.out.println("Element at index " + i + " is: " + num[i]);
        }

        // Step 3: Find the sum of all numbers in the array.
        // Initialize sum with 0 so we can add the values gradually.
        int sum = 0;

        // This loop visits every element of the array.
        for (int i = 0; i < num.length; i++) {
            // Add the current element to sum.
            sum = sum + num[i];
        }

        // Step 4: Print the final total.
        System.out.println("Sum is: " + sum);

        // Step 5: Find the largest number in the array.
        // We assume the first element is the largest for now.
        // Example: if the array starts with 1, then large = 1 at first.
        int large = num[0];

        // This loop checks every number in the array one by one.
        // i starts from 0 and goes up to num.length - 1.
        // So it visits num[0], num[1], num[2], ..., num[9].
        for (int i = 0; i < num.length; i++) {
            // num[i] is the current value we are checking.
            // If this value is greater than the current largest value,
            // then this value becomes the new largest.
            // Example: if large = 5 and num[i] = 8, then 8 > 5 is true,
            // so large becomes 8.
            if (num[i] > large) {
                // Store the bigger number in large.
                large = num[i];
            }
        }

        // Step 6: Print the largest value.
        // After the loop finishes, 'large' contains the maximum number
        // from the entire array.
        System.out.println("Largest number is: " + large);


        int small = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < small) {
                small = num[i];
            }
        }
        System.out.println("Smallest number is: " + small);
    }
}
