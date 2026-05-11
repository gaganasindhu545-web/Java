import java.util.Scanner;
public class Simpleinterest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int s=(p*r*t)/100;
        System.out.print("Simple interest is "+s);
    }
}