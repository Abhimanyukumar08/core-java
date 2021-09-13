import java.util.*;
public class Localization_Exmp2
{
public static void main(String[]args)
{
Locale frilocale = Locale.FRANCE;
Locale rulocale = new Locale("ru","RU");
Locale cr = Locale.getDefault();
frilocale = rulocale;
cr = frilocale;
System.out.println(cr);
}
}
