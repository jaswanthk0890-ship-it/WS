package JAVA_DAY2;

import java.util.Scanner;

public class day2_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        long salary = sc.nextLong();
        System.out.print("Enter Rating : ");
        int rating = sc.nextInt();

        if (salary < 0 || rating < 1 || rating > 5) {
            System.out.println("Invalid salary or rating.");
        } else {
            int bonusRate = 5;
            if (salary >= 50000 && rating == 5) {
                bonusRate = 20;
            } else if ((salary >= 50000 && rating == 4)
                    || (salary >= 30000 && rating == 5)) {
                bonusRate = 15;
            }

            long bonus = salary * bonusRate / 100;
            System.out.println("Bonus : " + bonus);
            System.out.println("Salary after increment : " + (salary + bonus));
        }
        sc.close();
    }
}
