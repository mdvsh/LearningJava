//DayName telling Java program, Assignment 
// a program which tells the day of the week when corresponding number is entered.
import java.util.Scanner;//importing the scanner class

public class Dayname{
     public static void main(String[] args) {
        
        Scanner s = new Scanner( System.in );
            int day; //user entered day

            System.out.println("Enter number for day of the week: ");
            day = s.nextInt();

            String result = getName( day ); // setting string to String value returned by the getName method
            System.out.println( result ); // printing string   
         }
    private static String getName(int dayNum)
    {
        if (dayNum == 1)
        {
            return "Sunday" ;
        }
        else if (dayNum == 2){
            return "Monday";
                    }
                    else if (dayNum == 3){
                        return "Tuesday";
                        
                    }
                    else if (dayNum == 4){
                        return "Wednesday";
                                }
                                else if (dayNum == 5){
                                    return "Thursday";
                                            }
                                            else if (dayNum == 6){
                                                return "Friday";
                                                        }
                                                        else if (dayNum == 7){
                                                            return "Saurday";
                                                                    }
                                                                    else {
                                                                        return "Invalid Entry !";
                                                                    }
    }
}