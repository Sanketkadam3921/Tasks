package Week_One_Core_Java.Day_One;
/*
Name - Sanket Kadam
Phone no - 8432338668
Email - sanketkadam9614@gmail.com
 */
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("enter a word ");
        String singleWord = scnr.next();
        scnr.nextLine();
        System.out.println("ENter your full name ");
        String moreWords = scnr.nextLine();
        System.out.println("word entered "+ singleWord);
        System.out.println("Full line + "+ moreWords);


    }
}
/*
// this is the disadvantage of using both the methods together -- coz when use use just the next() there is \n in the buffer which doesnt let the next word get printed , so we need to consume the /n which is present in the buffer by using the .nextLine() then only the remaining code will be executed

enter a word
sanket
ENter your full name
word entered sanket
Full line +

Process finished with exit code 0

by using .nextLine() to clear the buffer with \n


/usr/lib/jvm/java-1.17.0-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/623/lib/idea_rt.jar=38845 -Dfile.encoding=UTF-8 -classpath /home/sanket/Desktop/JAVA/InternshipTasks/out/production/InternshipTasks Week_One_Core_Java.Day_One.ScannerDemo
enter a word
sanket
ENter your full name
sanket kadam
word entered sanket
Full line + sanket kadam

Process finished with exit code 0
 */