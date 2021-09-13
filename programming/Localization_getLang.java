import java.util.*;
public class Localization_getLang
{
public static void main(String[]args)
{
Locale l1 = new Locale("fr","CANADA");
Locale l2 = new Locale("en","US");

System.out.println("Locale" + l1);
System.out.println("Locale" +l1.getLanguage());
System.out.println();
System.out.println("Locale " +l2);
System.out.println("Locale " +l2.getLanguage());

}
}
