import java.util.Scanner;
class people
{
	static Scanner sc = new Scanner(System.in);
public void showdetails()
{
	System.out.println("What is your Full Name ? ");
	String name = sc.nextLine();
	System.out.println("What is your age ? ");
	int age = sc.nextInt();
    	sc.nextLine();
    	System.out.println("What is the profession? ");
    	String pro = sc.nextLine();
}
}
class student extends people
{
public void stud_details()
{
	System.out.println("This is student class \n");
	super.showdetails();
	System.out.println("Name of the course enroll.");
	String course = sc.nextLine();
	System.out.println("Enter the student ID ");
	int id = sc.nextInt();
	sc.nextLine();	
}
}

class employee extends people
{
public void emp_details()
{
	System.out.println("This is Employee class\n");
	super.showdetails();
	System.out.println("Which Department are you from ?");
	String dep = sc.nextLine();
	System.out.println("What is your Designation");
	String post = sc.nextLine();
	System.out.println("Enter the employee ID");
	int id = sc.nextInt();
	System.out.println("what is the salary");
	int sal = sc.nextInt();
}
}

	
public class inheritance_homeWork
{
public static void main(String[]args)
{
	student s = new student();
	employee em = new employee();
	s.stud_details();
	System.out.println("\n-------------------------------------------------------\n");
	em.emp_details();
}
}
