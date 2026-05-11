public class HieraricalDemo {
    public static void main(String[] args)
    {
    Animal a=new Animal();
    a.eat();
    a.sleep();
    Dog d=new Dog();
    d.eat();
    d.guard();
    d.sleep();
    Tiger t=new Tiger();
    t.eat();
    t.attack();
    t.sleep();
    }

}
class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating.....");
    }
    public void sleep()
    {
        System.out.println("Animal is sleeping......");
    }
}
class Dog extends Animal{
    public void guard()
    {
        System.out.println("Dog will protect your house......");
    }
}
class Tiger extends Animal{
    public void attack()
    {
        System.out.println("tiger is attacking....");
    }
}
