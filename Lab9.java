import java.util.Scanner;
public class Lab9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        boolean res=anagram(a,b);
        System.out.print(res);
    }
    public static boolean anagram(String a,String b)
    {
        int countA[]=new int[26];
        int countB[]=new int [26];
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            countA[ch-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            countB[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(countA[i]!=countB[i])
            {
                return false;
            }
        }
        return true;
    }
}
