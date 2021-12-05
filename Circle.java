import java.util.Scanner;
class Circle {
    float radius;
    float pi = 3.14f;
    float area;
    public void Input()
    {
        System.out.println("Enter the radius of Circle ");
        Scanner myobj = new Scanner(System.in);
        radius = myobj.nextInt();
        
    }
    public void Area()
    {
        area = pi*radius*radius;
    }
    public void printArea()
    {
        System.out.println("the area of circle is " + area);
    }
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.Input();
        obj.Area();
        obj.printArea();
    }
}