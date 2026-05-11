import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String names[]=new String[n];
        for(int i=0;i<n;i++)
        {
            names[i]=sc.nextLine();
        }
            printVowelsCount(names);
    }
    public static void printVowelsCount(String words[])
    {
        for(int i=0;i<words.length;i++)
        {
            int vc=0;
            String vowels="aeiouAEIOU";
            for(int j=0;j<words[i].length();j++)
            {
                char ch=words[i].charAt(j);
                if(vowels.contains(ch+""))
                {
                    vc++;
                }
            }
            System.out.println(words[i]+"- "+words[i].length()+"- "+vc);
        }
    }
}
