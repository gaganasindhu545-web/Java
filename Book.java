class Book
{
    int bid,price,pages;
    String title,author;
    public Book()
    {
        bid=101;
        price=50;
        pages=60;
        title="Java";
        author="Pavani";
    }
    public Book(int id,String tit,String auth,int pri,int page)
    {
        bid=id;
        title=tit;
        author=auth;
        price=pri;
        pages=page;
    }
    public Book(int id,String tit,String auth,int pri)
    {
        bid=id;
        title=tit;
        author=auth;
        price=pri;
        pages=400;
    }
    public void display()
    {
        System.out.println("Book ID: "+bid);
        System.out.println("Book Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Pages: "+pages);
    }
    public static void main(String[] args)
    {
        Book b1=new Book();
        Book b2=new Book(102,"Java Programming","Sindhu",100,300);
        Book b3=new Book(103,"C programming","Bindu",500);
        b1.display();
        b2.display();
        b3.display();
    }
}