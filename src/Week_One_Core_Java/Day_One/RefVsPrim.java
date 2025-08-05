package Week_One_Core_Java.Day_One;
/*
Name - Sanket Kadam
Phone no - 8432338668
Email - sanketkadam9614@gmail.com
 */
public class RefVsPrim {
    public static void main(String[] args) {
        int age = 22 ;
        String name = "Sanket";

        System.out.println("Age -" + age);
        //int is primitive value -- hence its vlaue is stored in stack memoty

        System.out.println("Name -" + name);
        // strign is a ref type , the variable name holds a ref to string obj sanket which is stored in heap memory
     // basically when we use int we are storing the actual value but when we declare the string we are stroign the heap localtion not the string itself

    }
}
/*
Age -22
Name -Sanket

Process finished with exit code 0
 */