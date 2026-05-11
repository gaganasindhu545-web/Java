import java.util.Scanner;
public class Abstractclass {
   public static void main(String[] args)
   {
        shape s;
        s=new Rectangle();
        s.getinput();
        s.cal_area();
        s.show();
        s=new Circle();
        s.getinput();
        s.cal_area();
        s.show();
   }
}
abstract class shape
{
    Scanner sc=new Scanner(System.in);
    double s1,s2,area;
    public abstract void getinput();
    public abstract void cal_area();
    public void show()
    {
        System.out.println("Area:"+area);
    }
}
class Rectangle extends shape{
    public void getinput()
    {
        System.out.println("enter the length and breadth");
        s1=sc.nextDouble();
        s2=sc.nextDouble();
    }
    public void cal_area()
    {
        area=s1*s2;
    }
}
class Circle extends shape
{
    final double pi=3.142;
    public void getinput()
    {
        System.out.println("enter the radius of the circle");
        s1=sc.nextDouble();
    }
    public void cal_area()
    {
        area=pi*s1*s1;
    }
}

