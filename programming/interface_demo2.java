interface Shape
{
void draw();
}
interface Area
{
void calcu();
}
class rectangle implements Shape,Area
{
public void draw()
{
System.out.println("Drawing rectangle");
}
public void calcu()
{
System.out.println("Calculating");
}
}
class interface_demo2
{
public static void main(String[]args)
{
rectangle rec= new rectangle();
rec.draw();
rec.calcu();
}
}
