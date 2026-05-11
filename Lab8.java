import java.util.Scanner;
public class Lab8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        freqcount(str);
    }
    public static void freqcount(String str)
    {
        int count[]=new int[26];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            count[ch-'a']++;
        }
        int max=0;
        int maxindex=-1;
        for(int i=0;i<26;i++)
        {
            if(count[i]>max)
            {
                max=count[i];
                maxindex=i;
            }
        }
        char freq=(char)('a'+maxindex);
        System.out.print("frequent character is: "+freq+ " it repeates "+max);
    }
}
