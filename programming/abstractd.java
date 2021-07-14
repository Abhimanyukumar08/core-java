abstract class abstract_demo
{
abstract_demo()
{
System.out.println("This is demo class");
}
void disp()
{
System.out.println("This is display function");
}
abstract void show();
}
class abstractd extends abstract_demo
{
void show()
{
System.out.println("Child class implemented abstract function");
}
public static void main(String[]args)
{
abstractd i = new abstractd();
i.show();
i.disp();
}
}
