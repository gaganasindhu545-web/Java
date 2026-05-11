import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        AmstrongNumber(n);
    }
    public static void AmstrongNumber(int n)
    {
        int temp=n,sum=0,count=0;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        temp=n;
        while(temp>0)
        {
            int digit=temp%10;
            sum+=Math.pow(digit,count);
            temp=temp/10;
        }
   
        if(sum==n)
        {
            System.out.println("it is a Amstrong number");
        }
        else{
            System.out.println("it is not a Amstrong number");
        }
    }
}
