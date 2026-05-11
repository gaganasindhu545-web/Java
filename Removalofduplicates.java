import java.util.*;
public class Removalofduplicates
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
        System.out.println("Before removal of duplicates");
        display(a);
         System.out.println("After removal of duplicates");
         removeDuplicates(a);
    }
    public static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void removeDuplicates(int a[])
    {
        List<Integer>List=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(!List.contains(a[i]))
            {
                System.out.print(a[i]+" ");
                List.add(a[i]);
            }
        }
    } 
}