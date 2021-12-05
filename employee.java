public class employee {
    
}
import java.io.*;
public class employee
{
    String org , name , dsgntn;
    float da, ca , ta , hra , pf , gs , ns , as , bs;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    public void input()throws IOException
    {
        System.out.println("Enter employee name: ");
        name= buf.readLine();
        System.out.println("Enter organisation's name: ");
        org= buf.readLine();
        System.out.println("Enter employee's designation:  ");
        dsgntn= buf.readLine();
        System.out.println("Enter employee's salary: ");
        bs= Integer.parseInt(buf.readLine());
        hra=(10/bs)*100;
        da=(50/bs)*100;
        ca=(7/bs)*100;
        ta=(10/bs)*100;
        pf=(15/bs)*100;
        gs=(bs+da+ta+hra+ca);
        ns=gs-pf;
        as=bs*12;
        System.out.println("The GS is: "+gs);
        System.out.println("The NS is: "+ns);
        System.out.println("The AS is: "+as);
    }
    public static void main(String args[])throws IOException
    {
        employee e = new employee();
        e.input();
    }
}