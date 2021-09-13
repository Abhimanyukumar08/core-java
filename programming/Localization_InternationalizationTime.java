import java.text.DateFormat;
import java.util.*;

public class Localization_InternationalizationTime
{
static void printTime(Locale locale)
{
DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
Date currentDate = new Date();
String time = formatter.format(currentDate);
System.out.println(time+" "+locale);
}
public static void main(String[]args)
{
printTime(Locale.UK);
printTime(Locale.US);
printTime(Locale.FRANCE);
}
}
