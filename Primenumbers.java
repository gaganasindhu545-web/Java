import java.util.Scanner;
import java.lang.Math;
public class Primenumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isprime(int x)
    {
        for(int i=2;i<=(int)Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
}