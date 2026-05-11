import java.util.Scanner;
public class Minmaxarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,min,max;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        min=findminimum(a);
        max=findmaximum(a);
        System.out.println("minimum is "+min);
        System.out.println("maximum is "+max);
        sc.close();
    }
    public static int findminimum(int x[])
    {
        int m=x[0];
        for(int i=1;i<x.length;i++)
        {
            if(x[i]<m)
            {
                m=x[i];
            }
        }
        return m;
    }
    public static int findmaximum(int x[])
    {
        int m=x[0];
        for(int i=1;i<x.length;i++)
        {
            if(x[i]>m)
            {
                m=x[i];
            }
        }
        return m;
    }
}