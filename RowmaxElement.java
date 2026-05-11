import java.util.Scanner;
public class RowmaxElement {
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
        Rowmax(a,n,m);
    }
    public static void Rowmax(int a[][],int n,int m)
    {
        int i,j,max=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
