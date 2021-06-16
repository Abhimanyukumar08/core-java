import java.util.Scanner;
public class rectangle
{
public void area(int a, int b)
{
int c = a*b;
System.out.println("The area of the rectangle is :" +c);
}
public void perimeter(int L, int B)
{
int d = 2 * (L+B);
System.out.println("The perimeter of the rectangle is :" +d);
}
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the length : ");
int a= sc.nextInt();
System.out.println("enter the breadth : ");
int b = sc.nextInt();
rectangle i = new rectangle();
i.area(a,b);
i.perimeter(a,b);
}
}
