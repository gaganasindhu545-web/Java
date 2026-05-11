import java.util.Scanner;
public class Meanmedianmode
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
        int mean=meanarray(a,n);
        int median=medianarray(a,n);
        int mode=modearray(a,n);
        System.out.print("mean is: "+mean+" median is: "+median+" mode is: "+mode);
    }
    public static int meanarray(int a[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        int mean=sum/n;
        return mean;
    }
    public static int modearray(int a[],int n)
    {
        int freq=a[0],count=0,modes=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]==a[i-1])
            {
                count++;
            }
            else{
                count=1;
            }
             if(count>freq)
                {
                    freq=count;
                    modes=a[i];
                }
        }
        return modes;
    }
    public static int medianarray(int a[],int n)
    {
        if(n%2!=0)
        {
            int median=a[n/2];
            return median;
        }
        else{
            int avg=(a[n/2]+a[n/2-1])/2;
            return avg;
        }
    }
}