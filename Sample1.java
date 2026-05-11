class Sample1
{
    int x;
    float y;
    public Sample1()
    {
        System.out.println("Constructor called!");
    }
    public void show()
    {
        System.out.println(x+" "+y);
    }
    public static void main(String[] args)
    {
        Sample1 s1=new Sample1();
        s1.show();
    }
}