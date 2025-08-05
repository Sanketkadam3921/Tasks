package Week_One_Core_Java.Day_One;
/*
Name - Sanket Kadam
Phone no - 8432338668
Email - sanketkadam9614@gmail.com
 */
import java.util.Scanner;

public class ExtraTasks {
    public static void main(String[] args) {
        // task one
        String my_name = "Sanket Kadam";
        String my_favColor = "Matte Black";
        int my_age = 22;
        System.out.println("Name: " + my_name);
        System.out.println("Favorite Color: " + my_favColor);
        System.out.println("Age: " + my_age);
        // task two
        byte byte_no = 100;
        short short_no = 30000;
        int int_no = 1000000;
        long long_no = 9999999999L;
        float float_no = 3.14f;
        double double_no = 3.14159;
        char chr = 'A';
        boolean boolean_ = true;
        System.out.println("byte: " + byte_no);
        System.out.println("short: " + short_no);
        System.out.println("int: " + int_no);
        System.out.println("long: " + long_no);
        System.out.println("float: " + float_no);
        System.out.println("double: " + double_no);
        System.out.println("char: " + chr);
        System.out.println("boolean: " + boolean_);

        // task no three
        Scanner snr = new Scanner(System.in);
        System.out.println("enter first no");
        int no_1 = snr.nextInt();
        System.out.println("enter sec no ");
        int no_2 = snr.nextInt();
        int total_sum = no_1 + no_2 ;
        int prod = no_1 * no_2 ;
        double avg = (no_1 + no_2) / 2.0 ;
        System.out.println("Total sum is " + total_sum);
        System.out.println("Prod of two no is " + prod);
        System.out.println("Avg of two no is " + avg);
        // int 1total = 33 ; invalid as we cant start the name with the numbers
        // int tot-al = 33 ; invalid as we can only use two symbols dollar and underscore so anything other than these two sumbos give compile time error
        // int class = 11 ; we cant use reserved keywords while assigning the values

    }
}
/*
Name: Sanket Kadam
Favorite Color: Matte Black
Age: 22
byte: 100
short: 30000
int: 1000000
long: 9999999999
float: 3.14
double: 3.14159
char: A
boolean: true
enter first no
7
enter sec no
3
Total sum is 10
Prod of two no is 21
Avg of two no is 5.0

Process finished with exit code 0

 */