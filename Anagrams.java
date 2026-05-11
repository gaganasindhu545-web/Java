import java.util.Scanner;
class String1 {
    public static boolean anagrams(String s1,String s2)
    {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        //String1 Frequency count
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            arr1[ch-97]++;
        }
        //String2 frequency count
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            arr2[ch-97]++;
        }
        //check for the Anagrams or not
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args)
    {
        String s1;
        String s2;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        boolean ch=anagrams(s1, s2);
        System.out.print(ch);
    }
}
