import java.util.Scanner;
class Product
{
	String pid,pname;
	int cost,qty;
	static int count=0;
	
	public Product(String pid,String pname,int cost,int qty)
	{
		this.pid=pid;
		this.pname=pname;
		this.cost=cost;
		this.qty=qty;
		Product.count++;
	}
	public void display()
	{
		System.out.println("PID: "+pid+" PName: "+pname+" Cost: "+cost+" Qty: "+qty);
	}
}
class MainClass
{
	  public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  Product p[]=new Product[100];
		  
		  int choice;
		  int i=0;
		  Product prod;
		  String pid,pname;
		  int cost,qty;
		  while(true)
		  {
			  System.out.println("1.Add Product \n2.Display Products \n3.Search \n4.Exit");
			  System.out.println("Enter your Choice");
			  choice=sc.nextInt();
              sc.nextLine();
			  switch(choice)
			  {
				  case 1:   
						    System.out.println("Enter pid,pname,cost,qty");
							pid=sc.nextLine();
							pname=sc.nextLine();
							cost=sc.nextInt();
							qty=sc.nextInt();
				            prod=new Product(pid,pname,cost,qty);
							p[i++]=prod;
							System.out.println("Product added successfully");
							break;
				  case 2:
				            for(int j=0;j<i;j++)
							{
								p[j].display();
							}
							break;
				  case 3:
							System.out.println("enter the product id you want to search:");
							String key=sc.nextLine();
							boolean found=false;
							for(int j=0;j<i;j++)
							{
								if(p[j].pid.equals(key))
								{
									System.out.println("product id is found");
									p[j].display();
									found=true;
									break;
								}
							}
							if(!found)
							{
								System.out.println("product is not found");
							}
							break;
				  case 4:
						   System.exit(0);
						   break;
				  default:
						   System.out.println("Enter a valid Choice");
						   break;
			  }
		  }
	  }
}
