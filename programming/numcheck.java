import java.util.Scanner;
public class numcheck
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	if(num>0)
	{
	System.out.println("The number is positive: " +num);	
	}
	else if(num==0)
	{
	System.out.println("The number is zero: " +num);
	} 
	else 
	{
	System.out.println("The number is negative: " +num);
	}
}
}