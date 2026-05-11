import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        boolean res=panagram(str);
        System.out.print(res);
    }
    public static boolean panagram(String str)
    {
        int count[]=new int[26];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {   
            count[ch-'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}
