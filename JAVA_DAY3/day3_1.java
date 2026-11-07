package JAVA_DAY3;

public class day3_1 {
    public static void main(String[] args) {
        // First loop: for loop
        // This loop starts from i = 2 and continues while i <= 20.
        // After every iteration, i increases by 1.
        // So the values of i are: 2, 3, 4, ..., 20.
        // The program prints the multiplication table of 10 for each value of i.
        // Example: 10 x 2 = 20, 10 x 3 = 30, ..., 10 x 20 = 200.
        for(int i=2;i<=20;i++){
            System.out.println("10 x "+i+" = "+(10*i));
        }

        // Second loop: while loop
        // int j = 1; -> initialize the variable j with 1.
        // while(j <= 10) -> keep repeating the loop as long as j is less than or equal to 10.
        // Inside the loop, we print the multiplication table of 6.
        // Example: 6 x 1 = 6, 6 x 2 = 12, ..., 6 x 10 = 60.
        // After each print, j++ increases the value of j by 1.
        // This ensures the loop ends after j becomes 11.
        int j=1;
        while(j<=10){
            System.out.println("6 x "+j+" = "+(6*j));
            j++;
        }
    }
}
