public class thismethod
{

void m()
{
System.out.println("first method");
}
void n()
{
this.m();
}
void p()
{
n();
}
public static void main(String[]args)
{
thismethod t1= new thismethod();
t1.p();
t1.n();
t1.m();
}
}
