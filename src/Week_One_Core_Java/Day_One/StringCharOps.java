package Week_One_Core_Java.Day_One;
/*
Name - Sanket Kadam
Phone no - 8432338668
Email - sanketkadam9614@gmail.com
 */
import java.util.Scanner;

public class StringCharOps {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String first_name = scnr.nextLine();
        System.out.println("Enter your last name ");
        String last_name = scnr.nextLine();
        String full_name = first_name + " " + last_name ;
        System.out.println("FUll name - " + full_name);
        System.out.println("Enter the single char");
        char chr = scnr.nextLine().charAt(0);
        System.out.println("Entered character is " + chr);
        System.out.println("ASCII value ot the char is "+ (int) chr);



    }
}
/*
/usr/lib/jvm/java-1.17.0-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/623/lib/idea_rt.jar=32895 -Dfile.encoding=UTF-8 -classpath /home/sanket/Desktop/JAVA/InternshipTasks/out/production/InternshipTasks Week_One_Core_Java.Day_One.StringCharOps
Enter your first name
sanket
Enter your last name
kadam
FUll name - sanket kadam
Enter the single char
s
Entered character is s
ASCII value ot the char is 115

Process finished with exit code 0

 */
