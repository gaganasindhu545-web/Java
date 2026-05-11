public class Interface {
    public static void main(String[] args)
    {
        I1 i;
        i=new Sample();
        i.show();
    }
}
public interface I1 {
    void show();
}
class Sample implements I1{
    public void show()
    {
        System.out.println("show method called");
    }
}
