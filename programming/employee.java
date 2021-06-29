import java.util.Scanner;
public class employee
{
	public void emp_detail()
{
	Scanner sc = new Scanner(System.in);
	String data[] = new String[5];
	System.out.println("enter the details");
	for(int i=0;i<5;i++)
	{
		data[i] = sc.nextLine();
	}
	System.out.println("");
	System.out.println("the employee details are \n");
	for(int j=0;j<5;j++)
	{
		System.out.println(data[j]);
	}

}

	public static void main(String[]args)
{
	employee em = new employee();
	em.emp_detail();
}
}
		