// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Even {
    int number;
    Scanner myobj = new Scanner(System.in);
    
    public void input()
    {
           System.out.println("Enter the number "); 
           number = myobj.nextInt();
           
    }
    public void process()
    {
        if(number%2==0)
        {
           System.out.println("The Number is Even "); 
        }
        else
        {
            System.out.println("The number is odd ");
        }
    }
    public static void main(String[] args) {
        Even obj = new Even();
        obj.input();
        obj.process();
        
    }
}