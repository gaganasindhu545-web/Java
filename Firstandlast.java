import java.util.Scanner;
public class Firstandlast
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
        int k;
        k=sc.nextInt();
        int first=-1,last=-1;
        for(i=0;i<n;i++)
        {
            if(a[i]==k)
            {
            if(first==-1)
            {
                first=i;
            }
            else
            {
                last=i;
            }
            }
        }
        System.out.print("first occurance is: "+first+" last occurance is: "+last);
    }
}