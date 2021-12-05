// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Salesman {
    String name;
    double sales;
    double salary = 4500;
    double commision = 0;
    public void TakeInput()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = myobj.nextLine();
        System.out.println("Enter your amount of Sales ");
        sales = myobj.nextFloat();
    }
    public void SetCommision()
    {
        if(sales>=1 && sales<=2000)
        {
            commision = sales*0.05;
        }
        else if (sales>=2001 && sales<=5000)
        {
              commision = sales*0.07;
        }
         else if (sales>=5001 && sales<=10000)
        {
              commision = sales*0.10;
        }
         else if (sales>=10001 && sales<=15000)
        {
              commision = sales*0.12;
        }
        else
        {
             commision = sales*0.15;
        }
    }
    public void PrintOut()
    {
        double b =  salary+commision;
        System.out.println("The Total Salary of " + name + "is = " +b);
    }
    public static void main(String[] args) {
        Salesman Ashish = new Salesman();
        Ashish.TakeInput();
        Ashish.SetCommision();
        Ashish.PrintOut();
        
    }
}