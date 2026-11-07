package JAVA_DAY5;

public class day5_1 {
    public static void main(String[] args) {
        String name = "Jaswanth";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String word = "PROGRAMMING";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length() - 1));
        System.out.println(word.charAt(4));

        String sentence = "I am learning Java";
        if(sentence.contains("Java")) {
            System.out.println("The sentence contains the word 'Java'");
        } else {
            System.out.println("The sentence does not contain the word 'Java'");
        }

        String word1 = "HELLO";
        for(int i=word1.length()-1;i>=0;i--) {
            System.out.print(word1.charAt(i));
        }


        String word2 = "education";
        int count = 0;
        for(int i=0;i<word2.length();i++) {
            if(word2.charAt(i) == 'a' || word2.charAt(i) == 'e' || word2.charAt(i) == 'i' || word2.charAt(i) == 'o' || word2.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
