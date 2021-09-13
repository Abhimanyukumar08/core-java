import java.text.NumberFormat;
import java.util.*;

public class Localization_InternationalizationNumber
{
static void printNumber(Locale locale)
{
double d = 121332143.0908;
NumberFormat formatter = NumberFormat.getNumberInstance(locale);
String num = formatter.format(d);
System.out.println(num+" "+locale);
}
public static void main(String[]args)
{
printNumber(Locale.UK);
printNumber(Locale.US);
printNumber(Locale.FRANCE);
}
}
