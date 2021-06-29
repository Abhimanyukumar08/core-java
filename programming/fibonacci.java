public class fibonacci
{
public static void main(String[]args)
{
int a,b;
a=b=1;
System.out.println(a);
while(b<200)
{
System.out.println(b);
b=a+b;
a=b-a;
}
}
}
     	          