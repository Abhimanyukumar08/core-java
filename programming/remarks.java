import java.util.Scanner;
public class remarks
{
public static void main(String[]args)
{	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the grade: ");
	char grade = sc.next().charAt(0);
	if(grade=='A')
	{
	System.out.println("The performance is Excellent");
	}
	else if(grade=='B')
	{
	System.out.println("The performance is Good");
	}
	else if(grade=='C')
	{
	System.out.println("The performance is Fair");
	}
	else
	{	
	System.out.println("The performance is Bad");
	}
}
}