import java.util.Scanner;
public class TV
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("What is the type of the TV");
	String tv = sc.nextLine();
	System.out.println("Name the brand of the TV");
	String brand = sc.nextLine();
	System.out.println("enter the selling price of the TV");
	int price = sc.nextInt();
	System.out.println("enter the  size of the tv in inches");
	int size = sc.nextInt();
	if(tv.equals("CRT"))
	{
		int cost1 = price - (15*price/100);
		System.out.println("The new price of the TV after 15% discount is " +cost1);
	}
	else if(tv.equals("LCD"))
	{
		if(size==18){
		int cost2 = price - (15*price/100);
		System.out.println("The new price of the TV after 15% discount is " +cost2);
		}
		else
		{
			System.out.println("The price is same i.e " +price);
		}
	}
	else{
	System.out.println("NO DISCOUNT");
	}
}
}

	