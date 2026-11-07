import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your gender: ");
        char gen = sc.next().charAt(0);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gen);
        System.out.println("Salary: " + salary);
        sc.close();
    }
}
