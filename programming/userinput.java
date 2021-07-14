import java.util.Scanner;
public class userinput
{
    Scanner sc = new Scanner(System.in);
static void showdetails()
{
    Scanner sc = new Scanner(System.in);

	System.out.println("What is your Full Name ? ");
	String name = sc.nextLine();
	System.out.println("What is your age ? ");
	int age = sc.nextInt();
    sc.nextLine();
    System.out.println("What is the profession? ");
    String pro = sc.nextLine();

    
}
public class student extends userinput
{
static void stud_details()
{

    Scanner sc = new Scanner(System.in);

	System.out.println("Name of the course enroll.");
	String course = sc.nextLine();
}

	
 public static void main(String[] args) {
    showdetails();
    stud_details();
    
}
}
}