package Week_One_Core_Java.Day_One;
/*
Name - Sanket Kadam
Phone no - 8432338668
Email - sanketkadam9614@gmail.com
 */
public class ConstantAndNames {
    public static void main(String[] args) {
        final int TOTAL = 9614 ;
        final double AMOUNT = 9614.5 ;
        // we use final to make the value unchangable
        System.out.println("Total " + TOTAL);
        System.out.println("Amount "+ AMOUNT);
        // int 1total = 33 ; invalid as we cant start the name with the numbers
        // int tot-al = 33 ; invalid as we can only use two symbols dollar and underscore so anything other than these two sumbos give compile time error
        // int class = 11 ; we cant use reserved keywords while assigning the values

    }
}
/*
Total 9614
Amount 9614.5

Process finished with exit code 0
 */