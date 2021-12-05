
import java.util.Scanner;
class Largest {
    int a;
    int b;
    public void TakeInput()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a = myobj.nextInt();
        System.out.println("Enter the value of b ");
        b = myobj.nextInt();
    }
    public void PringLargest()
    {
        if(a>b)
        {
            System.out.println(a + " is >  " + b);
            
        }
        else if (a<b)
        {
            System.out.println(b + " is > " + a);
        }
        else
        {
            System.out.println(a + " is = " + b);
        }
    }
    public static void main(String[] args) {
    Largest obj = new Largest();
    obj.TakeInput();
    obj.PringLargest();
    }
}