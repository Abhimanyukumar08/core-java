import java.util.*;
public class Collectionclass_LinkedList1
{
public static void main(String[]args)
{
LinkedList<String> LL = new LinkedList<String>();
LL.add("Ravi");
LL.add("Vijay");
LL.add("Akash");
LL.add("Ajay");

Iterator<String> itr = LL.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
