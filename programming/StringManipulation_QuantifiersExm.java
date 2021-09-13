import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation_QuantifiersExm
{
public static void main(String[]args)
{
String s = "Longlonglong ago, in a galaxy far far away";

Pattern p1 = Pattern.compile("ago.*");
Matcher m1 = p1.matcher(s);
if(m1.find())
{
System.out.println("Found: "+m1.group());
}

Pattern p2 = Pattern.compile("gal.{6}");
Matcher m2 = p2.matcher(s);
if(m2.find())
{
System.out.println("Found: "+m2.group());
}

Pattern p3 = Pattern.compile("(long){2}");
Matcher m3 = p3.matcher(s);
if(m3.find())
{
System.out.println("Found: "+m3.group());
}
}
}
