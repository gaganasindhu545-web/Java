import java.util.Scanner;
public class Numberdistribution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int p=positive(a,n);
        int N=negative(a,n);
        int z=zeroes(a,n);
        System.out.print(p+" "+N+" "+z);
    }
    public static int positive(int a[],int n)
    {
        int i,count=0;
        for(i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                count++;
            }
        }
        return count;
    }
    public static int negative(int a[],int n)
    {
        int i,count=0;
        for(i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                count++;
            }
        }
        return count;
    }
    public static int zeroes(int a[],int n)
    {
        int i,count=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                count++;
            }
        }
        return count;
    }
    
}