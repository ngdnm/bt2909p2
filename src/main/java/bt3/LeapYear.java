package bt3;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Enter the Year: ");
        year = input.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year+ ": Leap Year");
        } 
        else {
            System.out.println(year+": Not a Leap Year");
        }
    }
}