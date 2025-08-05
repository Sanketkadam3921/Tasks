package Week_One_Core_Java.Day_One;
/*
Name - Sanket Kadam
Phone no - 8432338668
Email - sanketkadam9614@gmail.com
 */
public class ArgsEcho {
    public static void main(String[] args) {
        if ( args.length == 0 ){
            System.out.println("No commandline arguments were written ");

        }else {
            System.out.println("Command line arguments");
            for ( String a : args ){
                System.out.println(a);
            }
        }
    }
}
/*
sanket@sanket-ASUS-TUF-Gaming-A15-FA506IC-FA506IC:~/Desktop/JAVA/InternshipTasks/src$ java Week_One_Core_Java.Day_One.ArgsEcho
No commandline arguments were written
sanket@sanket-ASUS-TUF-Gaming-A15-FA506IC-FA506IC:~/Desktop/JAVA/InternshipTasks/src$ java Week_One_Core_Java.Day_One.ArgsEcho Hello Dhruvil
Command line arguments
Hello
Dhruvil
sanket@sanket-ASUS-TUF-Gaming-A15-FA506IC-FA506IC:~/Desktop/JAVA/InternshipTasks/src$


 */