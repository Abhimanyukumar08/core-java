import java.util.*;
class Collectionclass_HashTable1
{
public static void main(String[]args)
{
Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
hm.put(99,"Rahul");
hm.put(100,"Amit");
hm.put(109,"Ravi");
hm.put(103,"Viajy");

for(Map.Entry m:hm.entrySet())
{
System.out.println(m.getKey()+ " " +m.getValue());
}
}
}
