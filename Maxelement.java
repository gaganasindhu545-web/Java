import java.util.Scanner;
public class Maxelement
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
        int max=0;
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print(max);
    }
}