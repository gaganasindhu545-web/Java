import java.util.Scanner;
public class Countevenblwodd {
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
        int result=counteven(a,n);
        System.out.print(result);
    }
    public static int counteven(int a[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0 && a[i-1]%2!=0 && a[i+1]%2!=0)
            {
                count++;
            }
        }
        return count;
    }
}
