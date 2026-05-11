import java.util.Scanner;
public class Netsalary
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int basicSalary=sc.nextInt();
        int TA=sc.nextInt();
        int HRD=sc.nextInt();
        int DA=sc.nextInt();
        int pt=0;
        if(basicSalary>=25000)
        {
            pt=(basicSalary*12)/100;
        }
        else if(basicSalary>=10000)
        {
            pt=(basicSalary*8)/100;
        }
        else if(basicSalary<10000)
        {
            pt=200;
        }
        int Netsalary=(basicSalary+TA+HRD+DA)-pt;
        System.out.print("Netsalary is "+Netsalary);
    }
}300