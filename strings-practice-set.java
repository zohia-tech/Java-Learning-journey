import java.util.Scanner;
class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Length
        System.out.println("Length: " + s.length());

        // Uppercase
        System.out.println("Uppercase: " + s.toUpperCase());

        // Reverse
        String rev = "";
        for(int i = s.length()-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse: " + rev);

        // Palindrome check
        if(s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        // Word count
        String[] words = s.split(" ");
        System.out.println("Words: " + words.length);
    }
}
