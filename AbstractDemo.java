import java.util.Scanner;

abstract class Sample
{
    public Sample()
    {
        System.out.println("Abstract class constructor");
    }
    public abstract void show();
}
class Test extends Sample{
    public Test()
    {
        System.out.println("test class constructor");
    }
    public void show()
    {
        System.out.println("this is abstract method");
    }
}
public class AbstractDemo
{
    public static void main(String[] args)
    {
        Sample s;
        s=new Test();
        s.show();
    }
}