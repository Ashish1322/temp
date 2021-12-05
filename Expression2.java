import java.util.Scanner;

class Expression2 {
    int a;
    int b;
    int c;
    int d;
    double ans;
    public void Input()
    {
        System.out.println("Enter the value of a");
        Scanner myobj =  new Scanner(System.in);
        a = myobj.nextInt();
        System.out.println("Enter the value of b");
        b = myobj.nextInt();
        System.out.println("Enter the value of c ");
        c = myobj.nextInt();
         System.out.println("Enter the value of d ");
        d = myobj.nextInt();
    }
    public void Cal()
    {
        int temp = (4*a*b)+(c*d);
        int temp1 = a*c;
        ans = temp/temp1;
    }
    public void PrintAnswer()
    {
        System.out.println("the answer is "+ ans);
    }
    public static void main(String[] args) {
       Expression2 myobj = new Expression2();
       myobj.Input();
       myobj.Cal();
       myobj.PrintAnswer();
    }
}