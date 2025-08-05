package Week_One_Core_Java.Day_One;
/*
Name - Sanket Kadam
Phone no - 8432338668
Email - sanketkadam9614@gmail.com
 */
import java.util.Scanner;

public class InputSummary {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your full name : ");
         String yourName = scnr.nextLine();
        System.out.println("Enter your age - ");
        int yourAge = scnr.nextInt();
        System.out.println("Enter your height in cm ");
        double your_height = scnr.nextDouble();
        System.out.println("Enter your favorite char ");
        char your_fav_char = scnr.next().charAt(0);

        System.out.println("Name - " + yourName);
        System.out.println("Age -" + yourAge);
        System.out.println("Height- " + your_height);
        System.out.println("Fav char "+ your_fav_char);
    }
}
/*
Enter your full name :
sanket kadam
Enter your age -
22
Enter your height in cm
170
Enter your favorite char
s
Name - sanket kadam
Age -22
Height- 170.0
Fav char s

Process finished with exit code 0

 */