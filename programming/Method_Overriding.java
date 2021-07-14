class EMP
{
public void show()
{
	System.out.println("Method of Emp class");
}
}
class MAN extends EMP
{
public void show()
{
	super.show();
	System.out.println("Method of Man class");
}
}
public class Method_Overriding
{
	public static void main(String[]args)
{
	MAN m = new MAN();
	m.show();
}
}