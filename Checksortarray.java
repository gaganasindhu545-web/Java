import java.util.Scanner;
public class Checksortarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[],i,n;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sorted=1;
        for(i=0;i<n;i++)
        {
            if(a[i]>a[i+1])
            {
                sorted=0;
                break;
            }
        }
        if(sorted==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}