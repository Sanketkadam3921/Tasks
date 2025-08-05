package Week_One_Core_Java.Day_One;
/*
Name - Sanket Kadam
Phone no - 8432338668
Email - sanketkadam9614@gmail.com

 */
public class showPrimitives {
    public static void main(String[] args) {
        byte byte_no = 120 ; // this data type has smallest range - -120 to 127
        short short_no = 11111 ; // this one has range from -32768 to 32767
        int int_no = 234234234 ; // most commonly used
        long long_no = 9876543211L ;// this data ty0pe is used to hold large values , suffix L is must while usgin this data type
        float float_no = 1.11f ;// used for values with decimal places -- float is used when we need 5 to 6 deci places of accr
        double double_no = 11.111111111 ; // if we want 14 to 15 deci places of accracy
        // double is more precise than float
        char char_ = 'S';//single char in single quotes -- we can  only write single char
        boolean i_am_learning = true ;// true or false

        System.out.println("byte value: " + byte_no);
        System.out.println("short value: " + short_no);
        System.out.println("int value: " + int_no);
        System.out.println("long value: " + long_no);
        System.out.println("float value: " + float_no);
        System.out.println("double value: " + double_no);
        System.out.println("char value: " + char_);
        System.out.println("boolean value: " + i_am_learning);

    }
}
/*
byte value: 120
short value: 11111
int value: 234234234
long value: 9876543211
float value: 1.11
double value: 11.111111111
char value: S
boolean value: true

Process finished with exit code 0
 */