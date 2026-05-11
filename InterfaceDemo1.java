public class InterfaceDemo1 {
    public static void main(String[] args)
    {
        Inf1 i=new Test();
        i.show();
        System.out.println(Inf1.x);
    }
}
public interface Inf1 {
    int x=10;       //public static final int x=10;
    public void show();
}
class Test implements Inf1
{
    public void show()
    {
        System.out.println("interface demo");
    }
}