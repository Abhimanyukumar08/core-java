public class method
{
int a;
void show()
{
	System.out.println("This is non parameterised function");
}
void show(int a, int b)
{
	int x = a+b ;
	System.out.println("This is parameterised function: " +x);
}

public static void main(String[]args)
{
	method i = new method();
	i.a=30;
	i.show();
	i.show(i.a,40);
	System.out.print("The member variable is :" +i.a);
}
}