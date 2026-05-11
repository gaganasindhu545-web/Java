import java.util.Scanner;
public class Searcharray
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
        int x,found=0;
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                found=1;
                break;
            }
        }
        if(found==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}