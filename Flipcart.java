import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Flipcart {
    public static boolean isprime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        int count=0;
        int digit=2;
        while(count<n)
        {
        if(isprime(digit) && digit%10==k)
        {
            list.add(digit);
            count++;
        }
        digit++;
    }
        Collections.sort(list);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<list.size();i++)
        {
            result.append(list.get(i));
            if(i<list.size()-1)
            {
                result.append(",");
            }
        }
        System.out.print(result.toString());
    }
}
