import java.util.Scanner;
class String1
{
    public static void findCharacterTypes(String str)
    {
        int i=0,u=0,l=0,d=0,s=0;
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>=65 && ch<=90)
            {
                u++;
            }
            else if(ch>=90 && ch<=122)
            {
                l++;
            }
            else if(ch>=48 && ch<=57)
            {
                d++;
            }
            else
            {
                s++;
            }
        }
        System.out.println("Uppercase: "+u+" "+" lowercase: "+l+" "+"digits: "+d+" "+"symbols: "+" "+s);
    }
    public static void main(String[] args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        findCharacterTypes(str);
    }
}