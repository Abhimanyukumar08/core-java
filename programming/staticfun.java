public class staticfun
{
static int count;
staticfun()
{
count = count + 1;
}
public static void main(String[]args)
{
staticfun i = new staticfun();
System.out.println(i.count);
staticfun j = new staticfun();
System.out.println(j.count);
}
}
