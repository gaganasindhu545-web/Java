public class StaticBlockdemo {
    static{
        System.out.println("this is a static block");
    }
    {
        System.out.println("instance block");
    }
    public static void main(String args[])
    {
        System.out.println("this is main method");
        StaticBlockdemo sb1=new StaticBlockdemo();
    }
}
