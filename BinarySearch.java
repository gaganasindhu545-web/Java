import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int result=Binarysearch(a,n,key);
        System.out.println(result);
    }
    public static int Binarysearch(int a[],int n,int key)
    {
        int low=0;
        int high=a.length-1;
        int res=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==key)
            {
                res=mid;
                high=mid-1; //first occurance;
            }
            else if(a[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }

}
