public class Hierarical {
    public static void main(String[] args)
    {
        Parent p=new Parent();
        p.Grandparent();
        p.Parentclass();
        Child c=new Child();
        c.Grandparent();
        c.childclass();
    }
}
class GrandFather
{
    public void Grandparent()
    {
        System.out.println("Grandfather class is called");
    }
}
class Parent extends GrandFather
{
    public void Parentclass()
    {
        System.out.println("parent class is called");
    }
}
class Child extends GrandFather{
    public void childclass()
    {
        System.out.println("child class is called");
    }
}