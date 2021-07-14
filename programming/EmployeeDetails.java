import java.util.Scanner;
public class EmployeeDetails
{
	public void EnterData()
{
	System.out.println("Enter data is invoked");
}
	public void DisplayData()
{
	System.out.println("Display data is invoked");
}
	public void EXIT()
{
	System.out.println("Exit method is invoked");
	System.exit(0);
}

	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the option 1/2/3");
	int option = sc.nextInt();
	EmployeeDetails ed = new EmployeeDetails();
	switch(option)
{
	case 1:
	ed.EnterData();
	break;

	case 2:
	ed.DisplayData();
	break;

	case 3:
	ed.EXIT();
	break;
}
}
}