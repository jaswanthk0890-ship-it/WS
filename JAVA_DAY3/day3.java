package JAVA_DAY3;

public class day3 {
    public static void main(String[] args) {
        
        // for loop 1:
        // Syntax: for(initialization; condition; update)
        // Here, i starts with value 1.
        // The loop continues as long as i < 5.
        // After each iteration, i is increased by 1 using i++.
        // So the values of i are: 1, 2, 3, 4.
        // The body executes 4 times and prints "Hello" each time.
        for(int i=1;i<5;i++){
            System.out.println("Hello");
        }

        // for loop 2:
        // Syntax: for(initialization; condition; update)
        // Here, j starts with value 0.
        // The condition is j < 5, so it runs while j is less than 5.
        // The update is j += 2, which means j increases by 2 every time.
        // So the values of j are: 0, 2, 4.
        // The loop prints the value of j in each iteration.
        // This is useful when we want to print even numbers only.
        for (int j=0;j<5;j+=2){
            System.out.println("j : "+j);
        }
    }
}
