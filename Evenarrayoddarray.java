import java.util.Scanner;
public class Evenarrayoddarray {
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
        even_array(a,n);
        odd_array(a,n);
    }
    public static void even_array(int a[],int n)
    {
        int even[];
        even=new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even[i]=a[i];
                System.out.print(even[i]+" ");
            }
        }
        System.out.println();
    }
    public static void odd_array(int a[],int n)
    {
        int odd[];
        odd=new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                odd[i]=a[i];
                System.out.print(odd[i]+" ");
            }
        }
        System.out.println();
    }
}
