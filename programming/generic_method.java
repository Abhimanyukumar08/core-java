class generic_method
{
public static <E> void array(E[] elements)
{
for(E e:elements)
{
System.out.print(e+"\t");
}
System.out.println();
}
public static void main(String[]args)
{
Integer[] intarr = {10,20,30,40};
Character[] charr = {'A','B','H','I'};
generic_method g = new generic_method();
System.out.println("Printing the array");
array(intarr);
System.out.println("Printing the string");
array(charr);
}
}
