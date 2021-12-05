import java.io.*;
public class compound_interest
{
    float p , r , t;//p = principle balance, r= annual rate, t=time
    int n; //number of times that interest is compounded per unit time
    double ci , amount; // compound interest
    BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
    public void input()throws IOException
    {
    System.out.println("Enter the principle balance: ");
    p = Float.parseFloat(buf.readLine());
    System.out.println("Enter the annual rate: ");
    r = Float.parseFloat(buf.readLine());
    System.out.println("Enter the time taken: ");
    t = Float.parseFloat(buf.readLine());
    System.out.println("Enter the number of times that interest is compounded per unit t");
    n = Integer.parseInt(buf.readLine());
    amount = p * Math.pow(1 + (r / n), n * t);
    ci = amount - p;
    System.out.println("Amount After "+t+" years: "+amount);
    System.out.println("The compound interest after "+t+" years: "+ci);
    }
    public static void main(String args[])throws IOException
    {
        compound_interest ci2 = new compound_interest();
        ci2.input();
    }
}