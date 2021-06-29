import java.util.Scanner;
public class oddeven
{
	public void odd(int a, int b)
{
	if(a%2!=0)
	{
		System.out.println(a+ " is an odd");
	}
	else if(b%2!=0)
	{
		System.out.println(b+ " is an odd");
	}
	else {
	System.out.println("Both are even " +a+" "+b);
	}
}
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
	int a = sc.nextInt();
	System.out.println("enter the second number");
	int b = sc.nextInt();
	oddeven d = new oddeven();
	d.odd(a,b);
}
}
