package JAVA_DAY2;

import java.util.Scanner;

public class day2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println("Result : Even");
        }
        else{
            System.out.println("Result : Odd");
        }
        sc.close();
    }
}
