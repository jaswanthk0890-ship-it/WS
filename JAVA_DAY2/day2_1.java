package JAVA_DAY2;

import java.util.Scanner;

public class day2_1 {
    public static void main(String[] args) {
        
        int balance = 20000;

        Scanner sc = new Scanner(System.in);
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
        sc.close();
    }
}
