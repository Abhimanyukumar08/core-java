import java.util.Scanner;
class books
{
	static Scanner sc = new Scanner(System.in);
public void showdetails()
{
	System.out.println("What is the name of the Author ? ");
	String author = sc.nextLine();
	System.out.println("What is the Title of the book ? ");
	String title = sc.nextLine();
    	System.out.println("What is the price of the book ");
    	int price = sc.nextInt();
	System.out.println("Total number of pages in the book ?");
	int pages = sc.nextInt();
}
}
class software_book extends books
{
public void soft_details()
{
	System.out.println("This is the details of  Software Book \n");
	super.showdetails();
	System.out.println("What is the software version?");
	int version = sc.nextInt();
	sc.nextLine();
	System.out.println("What is the software name?");
	String s_name = sc.nextLine();
}
}

class hardware_book extends books
{
public void hard_details()
{
	System.out.println("This is the details of Hardware  Book \n");
	super.showdetails();
	sc.nextLine();
	System.out.println("Which category of hardware is this ?");
	String cate = sc.nextLine();
	System.out.println("Who is the publisher of this book?");
	String pub = sc.nextLine();
	
}
}

public class inheritance_homeWork2
{
public static void main(String[]args)
{
	software_book  s = new software_book ();
	hardware_book  h = new hardware_book ();
	s.soft_details();
	System.out.println("\n-------------------------------------------------------\n");
	h.hard_details();
}
}