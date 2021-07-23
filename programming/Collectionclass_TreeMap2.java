import java.util.*;

public class Collectionclass_TreeMap2
{
public static void main(String[]args)
{
TreeMap<Integer,String> map = new TreeMap<Integer,String>();
map.put(111,"Amit");
map.put(121,"Alam");
map.put(119,"Rohit");
map.put(101,"Yash");

System.out.println("Before invoking remove() method");
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+ " " +m.getValue());
}
map.remove(119);
System.out.println("After invoking remove() method");
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+ " " +m.getValue());
}
}
}
