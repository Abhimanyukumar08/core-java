public class student{

	int a;
	String b;
	student(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[]args)
	{
	student i = new student(23, "aayush");
	student j = new student(43, "krish");
	i.display();
	j.display();
}
}

	