import java.util.Scanner;

public class LeapYaer {
	
	static Scanner input;
	static boolean isYearLeap;
	
	public static void main(String[] args) {
		input = new Scanner(System.in); 
		System.out.println("Enter Year : ");
		
		 String year = input.nextLine(); 
		 isYearLeap = isLeapYear(Integer.valueOf(year));
		 if(isYearLeap) {
			 System.out.println(year + " is a leap year");
		 }else {
			 System.out.println(year + " is not  a leap year");
			}
		
	}
	
	static boolean isLeapYear(Integer year) {
		if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
			return true;
		}else {
			return false;
		}
		
	}

}
