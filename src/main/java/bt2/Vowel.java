package bt2;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Alphabet: ");
        String input = sc.next().toLowerCase();
        boolean uppercase = input.charAt(0)>=65 || input.charAt(0)<=90;
        boolean lowercase = input.charAt(0)>=97 || input.charAt(0)<=122;
        boolean vowels = input.equals("e") || input.equals("u")|| input.equals("o")||input.equals("a")||input.equals("i");
        if (input.length()> 1){
            System.out.println("Error");
        }
        else if (!(uppercase || lowercase)){
            System.out.println("Error");
        }
        else if (vowels){
            System.out.println("Input letter is Vowel");
        }
        else {
            System.out.println("Input letter is Consonannt");
        }
    }
}
