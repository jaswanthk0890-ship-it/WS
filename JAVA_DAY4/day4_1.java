package JAVA_DAY4;

import java.util.Scanner;

public class day4_1 {
    public static void main(String[] args) {
        
        int[] num = {20,33,44,52,68,71,85,90,16,112};

        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        
        // for(int i = 0; i < 5; i++) {
        //     System.out.print("Enter number " + (i + 1) + ": ");
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Elements in the array are: ");
        // for(int i = 0; i < 5; i++) {
        //     System.out.println(arr[i]);
        // }

        int sum =0;
        for(int i=0;i<num.length;i++){
            sum = sum + num[i];
        }
        System.out.println("Sum of elements in the array is: " + sum);


        double average = (double) sum / num.length;
        System.out.println("Average of elements in the array is: " + average);

        int large = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > large) {
                large = num[i];
            }
        }

        int small = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < small) {
                small = num[i];
            }
        }
        System.out.println("Largest element in the array is: " + large);
        System.out.println("Smallest element in the array is: " + small);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == search) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        int evenCount = 0;
        int oddCount = 0;
        for (int number : num) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
        sc.close();
    }
}