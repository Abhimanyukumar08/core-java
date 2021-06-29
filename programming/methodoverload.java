public class methodoverload
{
	public void add(int a, int b)
{
	int c = a+b;
	System.out.println(c);
}
	public void add(double a, double b)
{
	double c = a+b;
	System.out.println(c);
}
	public static void main(String[]args)
{
	methodoverload m = new methodoverload();
	m.add(1123,12312);
	m.add(2312.3434,475.987);
}
}
