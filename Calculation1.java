import java .io.*;

public class calculation 
{
    
    
        int a,b ;
        float  sum ,sub, mul, div, rem;
        BufferedReader buf=new BufferedReader (new InputStreamReader (System.in));
        public void input() throws IOException
        {       
        System.out .println(" Enter 2 digits for calculation : ");
        a = Integer .parseInt(buf. readLine ());
        b = Integer .parseInt(buf. readLine ());
        sum =a+b;
        System .out.println ( "Sum =" +sum);
        sub = a-b;
        System .out.println ( "Substraction =" +sub);
        mul=a*b;
        System .out.println ( "Multiplication =" +mul);
        div =a/b;
        System .out.println ( "Divsion=" +div);
        rem = a%b;
        System .out.println ( "Remainder=" +rem);
        }
        public static void main (String args[]) throws IOException
    
   {
         calculation obj1= new calculation ();
          obj1.input();
    }
}