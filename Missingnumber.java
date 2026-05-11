import java.util.Scanner;
public class Missingnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,sum=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=2;i<n;i++)
        {
            sum=sum+a[i];
        }
        int total=(n*(n+1))/2;
        System.out.print(total-sum);
    }
}