package JAVA_DAY3;

import java.util.Scanner;

public class day3_2 {
    public static void main(String[] args) {
        
        //1. print numbers from 1 to 100
        // for(int i=1;i<=100;i++){
        //     System.out.println(i);
        // }

        //2. Print all even numbers between 1 and 50.
        // for(int i=1;i<=50;i++) {
        //     if(i%2==0){
        //         System.out.println(i);
        //     }

        //3. Multiplication table
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a Number : ");
        // int num = sc.nextInt();

        // for(int i=1;i<=10;i++){
        //     System.out.println(num + " x " + i + " = " + (num*i));
        // }

        //4. Calculate the sum of numbers from 1 to 100.
        // int sum = 0;

        //for(int i=1;i<=100;i++){
        //     sum = sum + i;
        // }
        // System.out.println("Sum is : "+sum);


        //Calculate the factorial of a number.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");  
        // int num = sc.nextInt();
        // int factorial = 1;

        // for (int i = 1; i <= num; i++) {
        //     factorial = factorial * i;
        // }
        // System.out.println("Factorial is : " + factorial);

        Scanner sc = new Scanner(System.in);
        int balance = 20000;

        System.out.println("Welcome to ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

                switch(choice){

            case 1:
                System.out.println("Available balance : "+balance);
                break;
            case 2:
                System.out.print("Enter withdraw amount : ");
                int withdraw = sc.nextInt();
                if(withdraw>0 && withdraw<=balance){
                    balance = balance - withdraw;
                    System.out.println("Withdraw successful");
                    System.out.println("Available balance : "+balance);
                }
                else if(withdraw>balance){
                    System.out.println("Insufficient balance");
                }
                else if(withdraw <=0){
                    System.out.println("Invalid withdraw amount");
                }
                else{
                    System.out.println("Withdraw failed, Invalid amount");
                }
                break;
            case 3:
                System.out.print("Enter deposit amount : ");
                int deposit = sc.nextInt();
                if(deposit>0){
                    balance = balance + deposit;
                    System.out.println("Deposit successful");
                    System.out.println("Available balance : "+balance);
                }
                else{
                    System.out.println("Invalid deposit amount");
                }
                break;
            case 4:
                System.out.println("Thank you for using ATM");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
