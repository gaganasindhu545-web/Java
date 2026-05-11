import java.util.Scanner;
public class Areaoftriangle{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double s,area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(double)(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("sides of the triangle are:");
        System.out.println("side1: "+a);
        System.out.println("side2: "+b);
        System.out.println("side3: "+c);
        System.out.println("s: "+s);
        System.out.println("area: "+area);
        sc.close();
    }
}