public class ConstructorChaining {
    int width,height,depth;
    ConstructorChaining()
    {
        this(10,20,30);
        System.out.println("no argument constructor called!");
    }
    ConstructorChaining(int width,int height,int depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
        System.out.println(this.width+" "+this.height+" "+this.depth);
        System.out.println("with argument constructor called!");
    }
    public static void main(String args[])
    {
        ConstructorChaining c1=new ConstructorChaining();
    }
}
