import java.util.Scanner;
public class days
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the month's number");
	int month = sc.nextInt();
	System.out.println("enter the year");
	int year = sc.nextInt();	
	if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
	{
		System.out.println("The number of days are 31");
	}
	else if(month==2 && ((year%400==0) || ((year%4!=0) && (year%100==0))))
	{
		System.out.println("The number of days are 29");
	}
	else if(month==2)
	{
		System.out.println("The number of days are 28");
	}
	else
	{
		System.out.println("The number of days are 30");
	}
}
}