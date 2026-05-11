import java.util.Scanner;
public class ReverseVowels {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(reversevowels(s));
    }
    public static String reversevowels(String s)
    {
        StringBuilder vowel=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
                vowel.append(ch);
            }
        }
        vowel.reverse();
        int index=0;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
                result.append(vowel.charAt(index++));
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
    public  static boolean isVowel(char ch)
    {
        char lower=Character.toLowerCase(ch);
        return (lower=='a' || lower=='e' || lower=='i' || lower=='u' || lower=='o');
    }
}
