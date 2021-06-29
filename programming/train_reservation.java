import java.util.Scanner;
public class train_reservation
{
	int Train_NO;
	String Train_Name;
	String Route;
	String date;
	String dept_time;
	String arri_time;	
	public void details()
	{
		Scanner sc = new Scanner(System.in);
		String d[] = new String[6];
		System.out.println("Enter the details");
		for(int i=0;i<6;i++)
		{
		d[i]=sc.nextLine();
		}
		Train_NO = Integer.parseInt(d[0]);
		Train_Name = d[1];
		Route = d[2];
		date = d[3];
		dept_time = d[4];
		arri_time = d[5];
	}
	public void display()
	{
		this.details();
		System.out.println("thr train details are");
		System.out.println(Train_NO);
		System.out.println(Train_Name);
		System.out.println(Train_NO);
		System.out.println(Route);
		System.out.println(date);
		System.out.println(dept_time);
		System.out.println(arri_time);
		
	}
	public static void main(String[]args)
	{
		train_reservation tr = new train_reservation();
		tr.display();
	}
}
