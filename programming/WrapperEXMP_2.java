public class WrapperEXMP_2
{
public static void main(String[]args)
{
Integer a = 3;
int i = a.intValue();
int j = a;//unboxing, now compiler will write a.intValue() internally
System.out.println(a+" " +i+" " +j);
}
}
