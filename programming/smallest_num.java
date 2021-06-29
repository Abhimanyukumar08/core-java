import java.util.Scanner;
public class smallest_num
{
	public void smallest(int a,int b, int c)
{
	if(a<b && a<c){
	System.out.println(a+ " is the smallest number");
	}
	else if(b<a && b<c)
	{
	System.out.println(b+ " is the smallest number");
	}
	else
	{
	System.out.println(c+ " is the smallest number");
	}
}
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
	int x = sc.nextInt();
	System.out.println("enter the second number");
	int y = sc.nextInt();
	System.out.println("enter the third number");
	int z = sc.nextInt();
	smallest_num sm = new smallest_num();
	sm.smallest(x,y,z);
}
}
