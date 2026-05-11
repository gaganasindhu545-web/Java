import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        EvenFibonacci(n);
    }
    public static void EvenFibonacci(int n)
    {
        int a=0,b=1,sum=0;
        for(int i=0;i<n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            if(a%2==0)
            {
                sum+=a;
            }
        }
        System.out.println("sum of even fibonacci is: "+sum);
    }
}