import java.util.Scanner;
import java.lang.Math;
public class MathDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("maximum value is:"+Math.max(x,y));
        System.out.println("square of "+x+"is :"+Math.sqrt(x));
    }
}