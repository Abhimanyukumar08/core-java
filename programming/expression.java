import java.util.Scanner;
public class expression
{
	public static void main(String[]args)
{	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the expression:");
	String e = sc.nextLine();
	System.out.println("write the evaluation: ");
	String s= sc.nextLine();
	System.out.println("the expression is :" +s);
}
}
