import java.util.Scanner;
public class simpleintrest
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the principle amount: ");
	int p = sc.nextInt();
	System.out.println("enter the rate of intrest : ");
	float r = sc.nextFloat();
	System.out.println("enter the time period: ");
	int t = sc.nextInt();
	float SI= (p*r*t)/100;
	System.out.println("The simple intrest is : " +SI);
}
}	