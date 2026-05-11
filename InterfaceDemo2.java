public class InterfaceDemo2 {
    public static void main(String[] args)
    {
        Test i=new Test();
        i.show();
        i.message();
        i.display();
        System.out.println(I1.x);
        System.out.println(I2.x);
    }
}
public interface I1 {
    int x=10;
    void show();
    void message();
}
public interface I2 {
    int x=20;
    void display();
    void message();
}
class Test implements I1,I2{
    public void show()
    {
        System.out.println("show method called");
    }
    public void message()
    {
        System.out.println("message method is called");
    }
    public void display()
    {
        System.out.println("display method is called");
    }
}

