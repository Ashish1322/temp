import java.util.Scanner;
class Interest {
    float p;
    float r;
    float t;
    float inter;
    public void Input()
    {
        System.out.println("Enter the Principle Amount ");
        Scanner myobj = new Scanner(System.in);
        p = myobj.nextInt();
        System.out.println("Enter the rate  ");
        r = myobj.nextInt();
        System.out.println("Enter time ");
        t = myobj.nextInt();
    }
    public void Interest()
    {
        inter = (p*r*t)/100;
    }
    public void printInt()
    {
        System.out.println("the Simple Interest is  " + inter);
    }
    public static void main(String[] args) {
        Interest obj = new Interest();
        obj.Input();
        obj.Interest();
        obj.printInt();
    }
}