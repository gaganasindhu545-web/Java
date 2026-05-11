public class InterfaceExample {
    public static void main(String[] args)
    {
    vehicle v;
    v=new Bike();
    System.out.println(v.getnowheels());
    System.out.println(v.getseatingcapacity());
    v=new Auto();
    System.out.println(v.getnowheels());
    System.out.println(v.getseatingcapacity());
    v=new Car();
    System.out.println(v.getnowheels());
    System.out.println(v.getseatingcapacity());
    }
}
public interface vehicle {
    public int getnowheels();
    public int getseatingcapacity();
}
class Bike implements vehicle
{
    public int getnowheels()
    {
        return 2;
    }
    public int getseatingcapacity()
    {
        return 2;
    }
}
class Auto implements vehicle
{
    public int getnowheels()
    {
        return 3;
    }
    public int getseatingcapacity()
    {
        return 10;
    }
}
class Car implements vehicle
{
    public int getnowheels()
    {
        return 4;
    }
    public int getseatingcapacity()
    {
        return 6;
    }
}
