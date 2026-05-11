public class Stringdemo {
    public static void main(String args[])
    {
        String s1="Aditya";
        String s2=new String("Aditya");
        String s3="Aditya";
        String s4=new String("Aditya");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        
        s1=s1.concat( " University");
        System.out.println(s1);
    }
}
