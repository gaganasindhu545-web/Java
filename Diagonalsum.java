import java.util.Scanner;
public class Diagonalsum {
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
        System.out.println("Given 2D array is:");
        displayMatrix(a,n,m);
        int d1=diagonalsum(a,n);
        int d2=Antidiagonalsum(a,n);
        System.out.println(d1);
        System.out.println(d2);
    }
    public static int diagonalsum(int a[][],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
           sum+=a[i][i];
        }
        return sum;
    }
    public static int Antidiagonalsum(int a[][],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i][n-i-1];
        }
        return sum;
    }
    public static void displayMatrix(int a[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
