class MaxFinder
{
    public int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public int max(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(c>a && b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public double max(double a,double b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String[] args)
    {
        MaxFinder mf=new MaxFinder();
        System.out.println(mf.max(10,20));
        System.out.println(mf.max(30,20,50));
        System.out.println(mf.max(60.0,5.3));
    }
}