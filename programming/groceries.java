import java.util.Scanner;
public class groceries
{
	 static Float weight;
	public void addweight(int w)
{
	
	weight += w;
}
	public void remove_Weight(int w)
{
	weight -=w;
}
	public void display_weight()
{
	System.out.println(weight);
}
	

public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the name of the grocery: ");
	String G = sc.nextLine();
	System.out.println("enter the price of the grocery: ");	
	int price = sc.nextInt();
	System.out.println("enter the weight of the grocery: ");
	weight = sc.nextFloat();
	System.out.println("How much weight do you want to increase/decrease: ");
	
	int w = sc.nextInt();
	groceries gr = new groceries();
	System.out.println("Current weight is:");
	gr.display_weight();
	System.out.println("After adding the weight is :");
	gr.addweight(w);
	gr.display_weight();
	System.out.println("After removing the weight is: " );
	gr.remove_Weight(w);
	gr.display_weight();
}
}
	 