import java.util.Scanner;
class Rectangle {
    float len;
    float bre;
    float area;
    public void Input()
    {
        System.out.println("Enter the Length of Rectangle ");
        Scanner myobj = new Scanner(System.in);
        len = myobj.nextInt();
         System.out.println("Enter the Width of Rectangle ");
         bre = myobj.nextInt();
    }
    public void Area()
    {
        area = len*bre;
    }
    public void printArea()
    {
        System.out.println("the area of Rectanle is " + area);
    }
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.Input();
        obj.Area();
        obj.printArea();
    }
}