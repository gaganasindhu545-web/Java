import java.util.Scanner;
public class Smallerelements
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
       int result=mergesort(a,0,n-1);
       System.out.print(result);
    }
    public static int mergesort(int a[],int low,int high)
    {
        int inversion_count=0;
        if(low<high)
        {
            int mid=(low+high)/2;
            inversion_count+=mergesort(a,low,mid);
            inversion_count+=mergesort(a,mid+1,high);
            inversion_count+=merge(a,low,mid,high);
        }
        return inversion_count;
    }
    public static int merge(int a[],int low,int mid,int high)
    {
        int i=low,j=mid+1,k=0;
        int temp[]=new int[high-low+1];
        int inversion_count=0;
        while(i<=mid && j<=high)
        {
            if(a[i]<=a[j])
            {
                temp[k++]=a[i++];
            }
            else{
                inversion_count+=(mid-i+1);
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
        return inversion_count;
    }
}