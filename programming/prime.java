public class prime
{
	public static void main(String[]args)
{
	int num = 7;
	boolean flag = false;
	for(int i=2;i<=num/2;i++)
{
	if(num%2==0)
	{
		flag = true;
		break;
	}
}
if(!flag)
{
	System.out.println(num + " is the prime number");
}
else{
System.out.println(num + " is not prime number");
}
}
}
