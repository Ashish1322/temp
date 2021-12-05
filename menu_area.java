import java.io.* ;

import javax.management.OperationsException;
import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;
public class menu_area
{
    int choice ;
    double area ;
    // float area ;
    BufferedReader dev = new BufferedReader (new InputStreamReader(System.in)) ;

    public void input() throws IOException
    {
        System.out.println("Enter your choice  ") ;
        choice = Integer.parseInt(dev.readLine()) ;
    }

    public void compute() throws IOException
    {
        switch (choice)
        {
            case 1 :
            int length , breadth  ;
            System.out.println("Enter the length of a rectangle") ;
            length = Integer.parseInt(dev.readLine()) ;
            System.out.println("Enter the breadth of a rectangle ") ;
            breadth = Integer.parseInt(dev.readLine()) ;
            area = ( length * breadth ) ;
            System.out.println("The area of rectangle is : " + area) ;
            break ;

            case 2 :
            int base , height , area  ;
            System.out.println("Enter the base of a triangle") ;
            base = Integer.parseInt(dev.readLine()) ;
            System.out.println("Enter the height of a triangle") ;
            height = Integer.parseInt(dev.readLine()) ;
            area = ( base * height) / 2 ;
            System.out.println("Area of a triangle is " +area) ;
            break ;

            case 3 :
            double radius ;
            double pi = 3.14 ;
            
            System.out.println("Enter the radius of a circle") ;
            radius = Double.parseDouble(dev.readLine()) ;
            // area = pi * radius * radius;
            System.out.println("Area of a circle is : " +(pi * radius * radius) ) ;
            break ;

            case 4 :
            int side ;
            System.out.println("Enter the side of a square ") ;
            side = Integer.parseInt(dev.readLine()) ;
            area = ( side * side) ;
            System.out.println("Area of a square is : "+ area) ;
            break ;

            default :
            System.out.println("You have entered an Invalid choice !") ;
        }
    }
    public void display()
    {
        System.out.println("Press 1 for calculate the area of a rectangle") ;
        System.out.println("Press 2 for calculate the area of a triangle") ;
        System.out.println("Press 3 for calculate the area of a circle") ;
        System.out.println("Press 4 for calculate the area of a square") ;
    }

    public static void main (String args[]) throws IOException
    {
        menu_area obj = new menu_area() ;
        // obj.input() ;
        obj.display();
        obj.input();
        obj.compute();
    }
}