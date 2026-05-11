import java.util.Scanner;
public class Mergesort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a[],b[],i,j;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        m=sc.nextInt();
        b=new int[m];
        for(i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int c[];
        c=new int[n+m];
        for(i=0;i<n;i++)
        {
            c[i]=a[i];
        }
        for(i=0;i<m;i++)
        {
            c[n+i]=b[i];
        }
        mergesort(c,0,n+m-1);
        for(i=0;i<n+m;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
    public static void mergesort(int c[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)>>1;
            mergesort(c,low,mid);
            mergesort(c,mid+1,high);
            merge(c,low,mid,high);
        }
    }
    public static void merge(int c[],int low,int mid,int high)
    {
        int temp[]=new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high)
        {
            if(c[i]<=c[j])
            {
                temp[k++]=c[i++];
            }
            else
            {
                temp[k++]=c[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=c[i++];
        }
        while(j<=high)
        {
            temp[k++]=c[j++];
        }
        for(i=low,k=0;i<=high;i++,k++)
        {
            c[i]=temp[k];
        }
    }
}