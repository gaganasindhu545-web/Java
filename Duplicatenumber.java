import java.util.Scanner;
public class Duplicatenumber
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
        int result=0;
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(a[i]==a[j])
            {
                result=a[i];
            }
            }
        }
        System.out.print(result);
    }
}