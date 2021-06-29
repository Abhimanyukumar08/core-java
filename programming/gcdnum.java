import java.util.Scanner;
public class gcdnum
{
	public static void main(String[]args)
{
	int num1,num2,gcd=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");	
	num1 = sc.nextInt();
	System.out.println("enter the second number");
	num2 = sc.nextInt();
	for(int i=1;i<=num1 && i<=num2;++i)
	{
		if (num1%i==0 && num2%i==0)
		{
			gcd = i;
		}
	}
	System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);
}
}

		
