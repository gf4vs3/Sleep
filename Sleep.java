import java.util.Scanner;
 
 public class Sleep_10_2020
 {
     public static void main(String [] args)
     {
         Scanner input = new Scanner(System.in);
         final int yearTotal = 365, monthTotal = 30, sleepTime = 8;
         int yearOne = 0, monthOne = 0, dayOne = 0, yearTwo = 0, monthTwo = 0, dayTwo = 0, yearFinal = 0, monthFinal = 0, dayFinal = 0, totalSleep = 0, totalDays = 0;
         
         System.out.println("Enter your birthdate:");
         System.out.println("Year: ");
         yearOne = input.nextInt();
         System.out.println("Month: ");
         monthOne = input.nextInt();
         System.out.println("Day: ");
         dayOne = input.nextInt();
         System.out.println("Enter the current year:");
         System.out.println("Year: ");
         yearTwo = input.nextInt();
         System.out.println("Month: ");
         monthTwo = input.nextInt();
         System.out.println("Day: ");
         dayTwo = input.nextInt();
         input.close();
         totalDays = (yearTwo - yearOne) * 365;
         totalDays += (monthTwo - monthOne) * 30;
         totalDays += (dayTwo - dayOne);
         totalSleep = totalDays * sleepTime;
         System.out.println("You have been alive for: " + totalDays);
         System.out.println("You have been asleep for: " + totalSleep);
     }
 }