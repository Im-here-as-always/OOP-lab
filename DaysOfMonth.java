import java.util.Scanner;
public class DaysOfMonth{
    public static void main(String[] args){
        int d;
        int year = -1;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Please enter a year:");
            if (input.hasNextInt()){
                year = input.nextInt();
                if(year <= 0){
                    System.out.println("The year is invalid. Please try again :(");
                    input.nextLine();
                }

            } else {
                System.out.println("The year is invalid. Please try again :(");
                input.nextLine();
            }
        } while (year <=0);
        input.nextLine();
        do{
            System.out.println("Please enter a month: ");
            String month = input.nextLine();
            boolean isLeapYear = ((year % 4 ==0 && year % 100 !=0) || (year % 400 ==0));
            switch (month){
                case "January":
                case "Jan":
                case "Jan.":
                case "1":
                case "March":
                case "Mar.":
                case "Mar":
                case "3":
                case "May":
                case "May.":
                case "5":
                case "July":
                case "Jul":
                case "Jul.":
                case "7":
                case "August":
                case "Aug.":
                case "Aug":
                case "8":
                case "October":
                case "Oct.":
                case "Oct":
                case "10":
                case "December":
                case "Dec.":
                case "Dec":
                case "12":
                    {
                        System.out.println(month + " " + year + " has 31 days");
                        d = 0;
                     } break;
                case "April":
                case "Apr.":
                case "Apr":
                case "4":
                case "June":
                case "Jun.":
                case "Jun":
                case "6":
                case "September":
                case "Sep.":
                case "Sep":
                case "9":
                case "November":
                case "Nov.":
                case "Nov":
                case "11":
                    {
                        System.out.println(month + " " + year + " has 30 days");
                        d = 0;
                     } break;
                case "February":
                case "Feb.":
                case "Feb":
                case "2":
                if(isLeapYear){
                    System.out.println(month + " " + year + " has 29 days");
                    d = 0;
                    break;
                } else {
                    System.out.println(month + " " + year + " has 28 days");
                    d = 0;
                    break;
                }
                default:
                    {
                        System.out.println("The month is invalid. Please try again :(");
                        d = 1;
                    } break;
            }
        } while(d==1);
            
    }
}