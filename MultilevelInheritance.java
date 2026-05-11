public class MultilevelInheritance {
    public static void main(String[] args)
    {
        parrot p=new parrot();
        p.eat();
        p.fly();
        p.speak();
    }
}
class Animal{
    public void eat()
    {
        System.out.println("animal can eat..");
    }
}
class Bird extends Animal
{
    public void fly(){
        System.out.println("bird can fly");
    }
}
class parrot extends Bird
{
    public void speak()
    {
        System.out.println("parrot can speak");
    }
}

