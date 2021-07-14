interface shape
{
void draw();
}
class rectangle implements shape
{
public void draw()
{
System.out.println("Drawing Rectangle");
}
}
class interface_demo
{
public static void main(String[]args)
{
//shape s = new rectangle();
rectangle Shape = new rectangle();
Shape.draw();
}
}