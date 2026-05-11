import java.util.Scanner;
public class Oddevensum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,evensum=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int odd=oddsum(a,n);
        int even=evensum(a,n);
        System.out.print("odd sum is: "+odd+" "+"even sum is: "+even);
    }
    public static int oddsum(int a[],int n)
    {
        int oddsum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                oddsum+=a[i];
            }
        }
        return oddsum;
    }
     public static int evensum(int a[],int n)
    {
        int evensum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                evensum+=a[i];
            }
        }
        return evensum;
    }

}