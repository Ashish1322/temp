// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Enter details of an employee with name of the oraginsation name of employe designation and base sealaray and calculate hra 10% of base slary, DA 50% of base salary, TA 7% of Base slary Ca 8% of base salar.
import java.util.Scanner;
class Tax {
    String name, organisation, designation;
    Scanner myobj = new Scanner(System.in);
    double base_salary;
    double hra,da,ta,ca,pf,gs,ns,as,it;
    
    public void setData()
    {
        System.out.println("Enter your Name: ");
        name = myobj.nextLine();
        
        System.out.println("Enter the name of your Organisation: ");
        organisation = myobj.nextLine();
        
        System.out.println("Enter your designation in the Organisation: ");
        designation = myobj.nextLine();
        
         System.out.println("Enter your Base Salary: ");
         base_salary = myobj.nextInt();
         
         
          
    }
    public void calcualte()
    {
        hra = base_salary*0.1;
        da = base_salary*0.05;
        ta = base_salary*0.07;
        ca = base_salary*0.08;
        pf = base_salary*0.02;
        
        gs = base_salary+hra+ta+ca;
        ns = gs-pf;
        as = gs*12;
        if(as>1 && as<100000)
        {
            it = as*
        }
        
        
    }
    public static void main(String[] args) {
        // System.out.println("Hello, World!"); 
        Tax t = new Tax();
        t.setData();
        
    }
}