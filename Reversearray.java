import java.util.Scanner;
public class Reversearray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}