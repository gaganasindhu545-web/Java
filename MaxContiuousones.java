import java.util.Scanner;
public class MaxContiuousones
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int count=0,max=0;
            while(n>0)
            {
                if((n&1)==1)
                {
                    count++;
                    if(max<count)
                    {
                        max=count;
                    }
                }
                else{
                    count=0;
                }
                n=n>>1;
            }
            System.out.println("maximum count is:"+max);
        }
    }
}