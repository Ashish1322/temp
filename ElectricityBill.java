// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class ElectricityBill {
    String name, address, phonenumber, meternumber;
    float old_reading, new_reading, current_reading;
    double ans,cr;
    double ans_with_tax;
    Scanner myobj = new Scanner(System.in);
    public void Input()
    {
        System.out.println("***** WELCOME TO THE PUNJAB ELECTRICITY BOARD ***** ");
        System.out.println("***** It's humble request to eneter correct details *****");
          System.out.print("Enter your Name : ");
          name = myobj.nextLine();
          
          System.out.print("Enter your Address : ");
          address = myobj.nextLine();
          
          System.out.print("Enter your Phone number : ");
          phonenumber = myobj.nextLine();
          
           System.out.print("Enter your Meter Number : ");
           meternumber = myobj.nextLine();
           
           System.out.print("Enter the old reading of your meter : ");
           old_reading = myobj.nextFloat();
           
            System.out.print("Enter the new reading of your meter : ");
            new_reading = myobj.nextFloat();
        
         
    }
    public void process()
    {
         cr = new_reading - old_reading;
        if(cr >=1 && cr<=100)
        {
            ans = cr*0.60;
        }
        else if(cr >=101 && cr<=200)
        {
            ans = cr*0.80;
        }
        else if (cr>=201 && cr<=300)
        {
            ans = cr*1.0;
        }
        else if (cr>=301 && cr<=400)
        {
            ans = cr*1.20;
        }
        else
        {
            ans = cr*2;
        }
        ans_with_tax = ans + (ans*0.02);
        
    }
    public void printResult()
    {
         System.out.println("             ***** WELCOME TO THE PUNJAB ELECTRICITY BOARD *****               \n");
         System.out.println("               *************User Details***********               ");
         System.out.println("                Name : " + name);
         System.out.println("                Address : " + address);
         System.out.println("                Phone Number : " + phonenumber);
      
         
        System.out.println("                    ******Meter Details********              ");
        System.out.println("               Meter Number : " + meternumber);
        System.out.println("               Meter Old Reading : " + old_reading);
        System.out.println("               Meter New Reading : " + new_reading);
        System.out.println("               Current Meter Reading : " + cr);
        
          System.out.println("               Your Calculated bill is  : " + ans);
       System.out.println("                  After Adding the service Charge of 2% on your bill the Total Calculate bill is                 ");
        System.out.println("               Your Total Bills is  : " + ans_with_tax);
         
         System.out.println("Thanks for using our Service. If you have any queries plese contact us via email punjabgov.in");
         
    }
    
    
    public static void main(String[] args) {

        ElectricityBill obj = new ElectricityBill();
        obj.Input();
        obj.process();
        obj.printResult();
        
    }
}