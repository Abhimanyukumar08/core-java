interface X
{
void show();
}
interface Y
{
void show1();
}
interface Z extends X,Y
{
void display();
}
public class interface_extends_demo implements Z
{
public void show()
{
System.out.println("Method of interface X");
}
public void show1()
{
System.out.println("Method of interface Y");
}
public void display()
{
System.out.println("Method of interface Z");
}

public static void main(String[]args)
{
interface_extends_demo ob = new interface_extends_demo();
ob.show();
ob.show1();
ob.display();
}
}
