public class MethodOverridingDemo {
    public static void main(String[] args)
    {
    Tiger t=new Tiger();
    t.eat();
    t.makesound();
    }
}
class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating...");
    }
    public void makesound()
    {
        System.out.println("Animal make sound...");
    }
}
class Tiger extends Animal{
    public void makesound()
    {
        System.out.println("Tiger is Roaring.....");
    }
}