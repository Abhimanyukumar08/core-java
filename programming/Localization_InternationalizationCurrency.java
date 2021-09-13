import java.text.NumberFormat;
import java.util.*;
public class Localization_InternationalizationCurrency
{
static void printNumber(Locale locale)
{
double dbl = 3432378.8907;
NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
String currency = formatter.format(dbl);
System.out.println(currency+" for the locale "+locale);
}
public static void main(String[]args)
{
printNumber(Locale.UK);
printNumber(Locale.US);
printNumber(Locale.FRANCE);
}
}
