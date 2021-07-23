import java.util.StringTokenizer;

public class String_Tokenizer1
{
public static void main(String[]args)
{
String Shirts = "Blue Shirt, Grey Shirt, White Shirt, Black Shirt";
StringTokenizer st = new StringTokenizer(Shirts, ", ");

while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}
