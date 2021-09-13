import java.util.*;
import java.util.ResourceBundle;
public class Localization_InternationalDemo
{
public static void main(String[]args)
{
ResourceBundle bundle = ResourceBundle.getBundle("Message Bundle",Locale.US);
System.out.println("message in "+Locale.US+" : "+bundle.getString("greeting"));

//changing the default loacel to indonasian
Locale.setDefault(new Locale("in", "ID"));
bundle = ResourceBundle.getBundle("MessageBundel");
System.out.println("Message in "+Locale.getDefault()+" : "+bundle.getString("greeting"));

}
}
