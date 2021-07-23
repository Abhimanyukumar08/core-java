import java.util.*;

class Collectionclass_TreeMap1
{
public static void main(String[]args)
{
TreeMap<Integer,String> map = new TreeMap<Integer,String>();
map.put(111,"Amit");
map.put(121,"Alam");
map.put(119,"Rohit");
map.put(101,"Yash");

for(Map.Entry m:map.entrySet())
{
//entrySet() is used to get a set view of the mappings contained in this map
//Map.Entry is a interface which enables to work with map Entry
System.out.println(m.getKey()+ " " +m.getValue());
}
}
}
