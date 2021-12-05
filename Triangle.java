import java.util.Scanner;
class Triangle {
    float base;
    float height;
    float area;
    public void Input()
    {
        System.out.println("Enter the Base of Triangle ");
        Scanner myobj = new Scanner(System.in);
        base = myobj.nextInt();
         System.out.println("Enter the height of Triangle ");
        height = myobj.nextInt();
    }
    public void Area()
    {
        area = (base*height)/2;
    }
    public void printArea()
    {
        System.out.println("the area of Triangle is " + area);
    }
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.Input();
        obj.Area();
        obj.printArea();
    }
}