import java.util.Scanner;
import java.lang.Math;
public class Primesendwith3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(isprimes(i))
            {
                int digit=i%10;
                if(digit==3)
                {
                    System.out.println("primes are:"+i);
                }
            }
        }
    }
        public static boolean isprimes(int x)
        {
            if(x<=1)
            {
                return false;
            }
            for(int i=2;i<=Math.sqrt(x);i++)
            {
                if(x%i==0)
                {
                    return false;
                }
            }
            return true;
        }
}