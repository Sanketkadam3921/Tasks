package Week_One_Core_Java.Day_One;
/*
Name - Sanket Kadam
Phone no - 8432338668
Email - sanketkadam9614@gmail.com
 */
public class CastingEdgeCase {
    public static void main(String[] args) {
        double my_weight = 53.75 ;
        int new_weight = (int) my_weight ;

        System.out.println("Original weight- " + my_weight + "Kg");
        System.out.println("After casting to int- " + new_weight + "kg");


    }
}
/*
Original weight- 53.75Kg
After casting to int- 53kg

Process finished with exit code 0

after casting the original weight to int the .75 value is lost
so the double value is casted to the int value -- which results in the loss of the deicmal places

 */