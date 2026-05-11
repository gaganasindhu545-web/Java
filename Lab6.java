import java.util.ArrayList;
import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        RemoveDuplicates(a,n);
    }
    public static void RemoveDuplicates(int a[],int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!list.contains(a[i]))
            {
                list.add(a[i]);
            }
        }
        for(int i:list)
        {
            System.out.print(i+" ");
        }
    }
}
