import java.util.Scanner;
public class Basicmergesort
{
    static int count=0;  //global counter
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
        mergesort(a,0,n-1);
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print(count);
    }
    public static void mergesort(int a[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int a[],int low,int mid,int high)
    {
        int i=low,j=mid+1,k=0;
        int temp[]=new int[high-low+1];
        while(i<=mid && j<=high)
        {
            count++;
            if(a[i]<=a[j])
            {
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=a[i++];
        }
        while(j<=high)
        {
            temp[k++]=a[j++];
        }
        for(i=low,k=0;i<=high;i++,k++)
        {
            a[i]=temp[k];
        }
          for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
    }
}