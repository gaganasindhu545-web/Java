import java.util.Scanner;
class Admin
{
    String coursename,branch,Rollno,name,gender,fathername;
    String Username, password;
    int maths,java,cv,datamining,total;
    public Admin(String Username,String password)
    {
        this.Username=Username;
        this.password=password;
    }
    public void AddStudent(String coursename,String branch,String Rollno,String name,String gender,String fathername)
    {
        this.coursename=coursename;
        this.branch=branch;
        this.Rollno=Rollno;
        this.name=name;
        this.gender=gender;
        this.fathername=fathername;
    }
    public void InsertMArks(int maths,int java,int cv,int datamining)
    {
        this.maths=maths;
        this.java=java;
        this.cv=cv;
        this.datamining=datamining;
        total= maths+java+cv+datamining;
    }
    public void display()
    {
        System.out.println("coursename: "+coursename+" branch: "+branch+" Rollno: "+Rollno+" Name: "+name+" gender: "+gender+" Fathername: "+fathername);
        System.out.println("maths: "+maths+" java: "+java+" cv: "+cv+" datamining: "+datamining);
         System.out.println("total marks: "+total);
    }
}
class Student{
    String Rollno;
    public Student(String Rollno)
    {
        this.Rollno=Rollno;
    }
}
public class ResultCalculation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Admin[] admins=new Admin[100];
        String Rollno,coursename,branch,name,gender,fathername;
        int maths,java,cv,datamining;
        int choice;
        int i=0;
        System.out.println("enter username and password");
        String user=sc.nextLine();
        String pass=sc.nextLine();
         while(true)
		  {
            System.out.println("--------------student online result management system--------------");
			System.out.println("1.Add New Student \n2.Insert New Result \n3.Registered Student \n4.All Students Result\n5.Result\n6.exit");
			System.out.println("Enter your Choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                    case 1:
                        Admin a=new Admin(user,pass);
                        System.out.println("enter coursename,branch,rollno,name,gender fathername");
                        coursename=sc.nextLine();
                        branch=sc.nextLine();
                        Rollno=sc.nextLine();
                        name=sc.nextLine();
                        gender=sc.nextLine();
                        fathername=sc.nextLine();
                        a.AddStudent(coursename, branch, Rollno, name, gender, fathername);
                        admins[i++]=a;
                        System.out.println("Student is added sucessfully");
                        break;
                    case 2:
                        System.out.println("enter rollno");
                        String R=sc.nextLine();
                        boolean found=false;
                        for(int j=0;j<i;j++)
                        {
                        if(admins[j].Rollno.equals(R))
                        {
                        System.out.println("maths,java,cv,datamining");
                        maths=sc.nextInt();
                        java=sc.nextInt();
                        cv=sc.nextInt();
                        datamining=sc.nextInt();
                        admins[j].InsertMArks(maths, java, cv, datamining);
                        System.out.println("Marks are inserted successfully");
                        found=true;
                        break;
                        }
                    }
                        if(!found)
                        {
                            System.out.println("student rollno is not found");
                        }
                        break;
                    case 3:
                        System.out.println("Displaying the student details and marks");
                        for(int j=0;j<i;j++)
                        {
                            admins[j].display();
                        }
                        break;
                    case 4:
                        for(int j=0;j<i;j++)
                        {
                            int x=admins[j].total;
                            System.out.println(admins[j].Rollno+": "+x);
                        }
                        break;
                    case 5:
                        String r=sc.nextLine();
                        for(int j=0;j<i;j++)
                        {
                            if(admins[j].Rollno.equals(r))
                            {
                                System.out.println("maths: "+admins[j].maths);
                                System.out.println("java: "+admins[j].java);
                                System.out.println("cv: "+admins[j].cv);
                                System.out.println("data mining: "+admins[j].datamining);
                                System.out.println("total marks: "+admins[j].total);
                                if(admins[j].maths>35 && admins[j].java>35 && admins[j].cv>35 && admins[j].datamining>35)
                                {
                                    System.out.println("PASS");
                                    break;
                                }
                                else{
                                    System.out.println("FAIL");
                                    break;
                                }
                            }
                        }
                        break;
                    case 6:
						   System.exit(0);
						   break;
				  default:
						   System.out.println("Enter a valid Choice");
						   break;

              }
    }
}
}
