public class String_split
{
public static void main(String[]args)
{
String Shirts = "Blue Shirt, Grey Shirt, White Shirt, Black Shirt";
String[] results = Shirts.split(",");
for(String s:results)
{
System.out.println(s);
}
}
}
