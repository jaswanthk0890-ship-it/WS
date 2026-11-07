package JAVA_DAY5;

public class day5_2 {
    public static void main(String[] args) {
        
        String word = "hello";
        StringBuilder reversedWord = new StringBuilder();
        for(int i=word.length()-1;i>=0;i--) {
            reversedWord.append(word.charAt(i));
        }
        if (reversedWord.toString().equals(word)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not a palindrome");
            }


            String word3 = "programming";
            int count = 0;
                for(int i=0;i<word3.length();i++) {
                    if(word3.charAt(i) == 'm') {
                        count++;
                    }
                }
                System.out.println("m appears " + count + " times");
        
            String a = "Java";
            String b = "Java";
            System.out.println(a==b); 
            System.out.println(a.equals(b));  
            
            String a1 = new String("Java");
            String b1 = new String("Java");
            System.out.println(a1==b1);
            System.out.println(a1.equals(b1));
        }
}
