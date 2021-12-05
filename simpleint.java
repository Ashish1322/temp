public import java.io.*;
public class simple_interest
{
    float p , r , t;//p = principle balance, r= annual rate, t=time
    float si; // simple interest
    BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
    public void input()throws IOException
    {
    System.out.println("Enter the principle balance: ");
    p = Float.parseFloat(buf.readLine());
    System.out.println("Enter the annual rate: ");
    r = Float.parseFloat(buf.readLine());
    System.out.println("Enter the time taken: ");
    t = Float.parseFloat(buf.readLine());
    si = (p*r*t)/100;
    System.out.println("Required Simple Interest is: "+si);
    }
    public static void main(String args[])throws IOException
    {
        simple_interest si2 = new simple_interest();
        si2.input();
    }
}class simpleint {
    
}
