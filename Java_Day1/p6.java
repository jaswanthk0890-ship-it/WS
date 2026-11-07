import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));

        if (b != 0) {
            System.out.println("Division : " + ((double) a / b));
            System.out.println("Modulus : " + (a % b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        
        sc.close();
    }
}
