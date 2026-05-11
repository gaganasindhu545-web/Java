public class Rectangle
{
    int length,breadth;
    String color="black";
    int area;
    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    public Rectangle(int d)
    {
        length=d;
        breadth=d;
        color="red";
    }
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
        color="blue";
    }
    public Rectangle(int l,int b,String c)
    {
        length=l;
        breadth=b;
        color=c;
    }
    public void calculateArea()
    {
        area=length*breadth;
    }
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle(10);
        Rectangle r2=new Rectangle();
        Rectangle r3=new Rectangle(10,20);
        Rectangle r4=new Rectangle(11,22,"Yellow");
        r1.calculateArea();
        r2.calculateArea();
        r3.calculateArea();
        r4.calculateArea();
        System.out.println(r1.length+" "+r1.breadth+" "+r1.color+" "+r1.area+" ");
        System.out.println(r2.length+" "+r2.breadth+" "+r2.color+" "+r2.area+" ");
        System.out.println(r3.length+" "+r3.breadth+" "+r3.color+" "+r3.area+" ");
        System.out.println(r4.length+" "+r4.breadth+" "+r4.color+" "+r4.area+" ");
    }
}