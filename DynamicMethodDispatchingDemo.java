public class DynamicMethodDispatchingDemo {
    public static void main(String[] args)
    {
    Animal a=new Animal();
    a.makesound();
    a=new Dog();
    a.makesound();
    a=new Tiger();
    a.makesound();
    a=new Cat();
    a.makesound();
    }
}
class Animal
{
    public void makesound()
    {
        System.out.println("Animal is making sound...");
    }
}
class Dog extends Animal{
    public void makesound()
    {
        System.out.println("Dog is barking.....");
    }
}
class Tiger extends Animal{
    public void makesound()
    {
        System.out.println("tiger is roaring.....");
    }
} 
class Cat extends Animal{
    public void makesound()
    {
        System.out.println("meow meow....");
    }
}
