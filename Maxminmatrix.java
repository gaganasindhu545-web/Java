import java.util.Scanner;
public class Maxminmatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a[][],i,j;
        n=sc.nextInt();
        m=sc.nextInt();
        a=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int r1=maxmatrix(a,n,m);
        int r2=minmatrix(a,n,m);
        System.out.println(r1);
        System.out.println(r2);
    }
    public static int maxmatrix(int a[][],int n,int m)
    {
        int i,j,max=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
        }
        return max;
    }
    public static int minmatrix(int a[][],int n,int m)
    {
        int i,j,min=a[0][0];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]<=min)
                {
                    min=a[i][j];
                }
            }
        }
        return min;
    }
}