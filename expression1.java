import java.util.Scanner;

class Expression1 {
    int a;
    int b;
    int c;
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
    }
    public void Cal()
    {
        int temp = a-c;
        int temp1 = a+(b*c);
        ans = temp1/temp;
    }
    public void PrintAnswer()
    {
        System.out.println("the answer is "+ ans);
    }
    public static void main(String[] args) {
       Expression1 myobj = new Expression1();
       myobj.Input();
       myobj.Cal();
       myobj.PrintAnswer();
    }
}