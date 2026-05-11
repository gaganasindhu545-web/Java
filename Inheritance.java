public class Inheritance {
    public static void main(String[] args)
    {
        Vehicle v1=new Vehicle();
        v1.start();
        v1.stop();
        Car c=new Car();
        c.start();
        c.playmusic();
        c.stop();
    }
}
class Vehicle{
    public void start()
    {
        System.out.println("vehicle is starting....");
    }
    public void stop()
    {
        System.out.println("vehicle is stoped");
    }
}
class Car extends Vehicle{
    public void playmusic()
    {
        System.out.println("music is playing.....");
    }
}

