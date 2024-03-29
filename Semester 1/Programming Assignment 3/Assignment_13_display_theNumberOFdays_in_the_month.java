// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Display the number of days in the month.
import java.util.Scanner;

public class Assignment_13_display_theNumberOFdays_in_the_month 
{
    public static void main(String[] args) 
    {
        try(Scanner input = new Scanner(System.in);)
        {
            System.out.println("Enter the number of month: ");
            int month = input.nextInt();
            System.out.println("Enter the year: ");
            int year = input.nextInt();

            boolean leapYear = (year%4 == 0 && year != 0) || (year%400 == 0);
            switch (month) 
            {
                case 1: 
                    System.out.println("January " + year + " had 31 days.");
                    break;
                case 2:
                    System.out.println("February " + year + " had " + ((leapYear)? "29 days!\nIt's a leap year." : "28 days"));
                    break;
                case 3:
                    System.out.println("March " + year + " had 31 days");
                    break;
                case 4:
                    System.out.println("April " + year + " had 30 days.");
                    break;
                case 5:
                    System.out.println("May " + year + " had 31 days.");
                    break;
                case 6:
                    System.out.println("June " + year + " had 30 days.");
                    break;
                case 7:
                    System.out.println("July " + year + " had 31 days.");
                    break;
                case 8:
                    System.out.println("August " + year + " had 31 days.");
                    break;
                case 9:
                    System.out.println("September " + year + " had 30 days.");
                    break;
                case 10:
                    System.out.println("October " + year + " had 31 days.");
                    break;
                case 11:
                    System.out.println("November " + year + " had 30 days.");
                    break;
                case 12:
                    System.out.println("December " + year + " had 31 days.");
            
                default:
                    break;
            }
        }
        
    }
    
}