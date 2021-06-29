import java.util.Scanner;

public class reverse
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	int s;
	int reverse = 0; 
	while(n!=0)
{
	s = n%10;
	reverse = reverse * 10 + s;
	n = n/10;
}
System.out.println("The reverse of the number is\t" +reverse);
}
}