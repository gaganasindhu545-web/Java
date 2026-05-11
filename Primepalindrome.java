import java.util.Scanner;
import java.lang.Math;
public class Primepalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            {
                int original=i;
                int temp=i;
                 int reverse=0;
                 while(temp>0)
                {int digit=temp%10;
                reverse=reverse*10+digit;
                temp=temp/10;
                if(original==reverse)
                {
                    System.out.println("prime palindrome is: "+i);
                }
                }
            }
        }
    }
    public static boolean isprime(int x)
    {
        if(x<=1)
        {
            return false;
        }
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