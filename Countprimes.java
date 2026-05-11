import java.util.Scanner;
import java.util.Math;
public class Countprimes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            {
                count=count+1;
            }
        }
        System.out.print("count primes: "+count);
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
