import java.util.Scanner;
public class boundaryelements
{
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
        display(a);
        displayboundaryelement(a);
    }
    public static void display(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void displayboundaryelement(int a[][])
    {
        int row=a.length;
        int col=a[0].length;
        //top horizontal row
        for(int i=0;i<col;i++)
        {
            System.out.print(a[0][i]+" ");
        }
        //right vertical column
        for(int i=1;i<row;i++)
        {
            System.out.print(a[i][col-1]+" ");
        }
        //bottom row
        for(int i=col-2;i>=0;i--)
        {
            System.out.print(a[row-1][i]+" ");
        }
        //left vertical column
        for(int i=row-2;i>0;i--)
        {
            System.out.print(a[i][0]+" ");
        }
       
    }
}