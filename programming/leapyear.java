import java.util.Scanner;

public class leapyear
{
	public void checkyear(int year)
{
	if(((year%4==0)&&(year%100!=0))||(year%400==0))
	{
		System.out.println(year+ " is the leap_year");
	}
	else if(((year%4!=0)&&(year%100==0))||(year%400!=0)){
	System.out.println(year+ " is not the leap_year");
	}
	else{
	System.out.println("Both are the leap_year");
	}
}
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first year");
	int y1 = sc.nextInt();
	System.out.println("Enter the 2nd year");
	int y2 = sc.nextInt();
	leapyear l = new leapyear();
	l.checkyear(y1);
	l.checkyear(y2);
}
}