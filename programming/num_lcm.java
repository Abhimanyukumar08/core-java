import java.util.Scanner;
public class num_lcm
{
	public int gcd(int a, int b)
	{
		int gcd=1;
		for(int i=1;i<=a && i<=b;++i)
	{
		if (a%i==0 && b%i==0)
		{
			gcd = i;
		}
	}
		return gcd;
	}
	public static void main(String[]args)
{

	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");	
	int num1 = sc.nextInt();
	System.out.println("enter the second number");
	int num2 = sc.nextInt();
	num_lcm l = new num_lcm();
	int hcf = l.gcd(num1,num2);
	int lcm = (num1*num2)/hcf;
	System.out.println("GCD of "+num1+" and "+num2+" is "+hcf);
	System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);   
}
}

	