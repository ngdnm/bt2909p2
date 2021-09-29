package bt1;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
	String month;
	int year;
	int numberOfDays;
		
	Scanner scan = new Scanner(System.in);	
	System.out.print("Enter the month: ");
	month = scan.nextLine();
	System.out.print("Enter the year: ");
	year = scan.nextInt();		
	numberOfDays = getDaysInMonth(month, year);
	System.out.println(numberOfDays);		
	scan.close();
	}
	
	public static boolean isLeapYear(int year) {
        
        while (year>=1 && year<=9999) {
            if ((year%4 == 0) && (year%100 !=0) || (year%400 ==0)){
            	return true;
            	}
            else
            	return false;
        }
        return false;
    }		
	public static int getDaysInMonth(String month, int year) {
		switch (month) {
		case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
			return 31;
		case "February":
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		case "April":case "June":case "September":case "November":
			return 30;
		default:
			return -1;
		}
	}

}
    

