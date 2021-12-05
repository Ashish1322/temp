// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int year;
        System.out.println( "Enter the year "); 
        Scanner obj = new Scanner(System.in);
        year = obj.nextInt();
        if(year%4==0)
        {
               System.out.println( "Leap Year "); 
        }
        else
        {
               System.out.println( "Not leap year "); 
        }
     
    }
}