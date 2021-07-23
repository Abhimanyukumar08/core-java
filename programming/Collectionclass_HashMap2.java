import java.util.*;
class Collectionclass_HashMap2
{
public static void main(String[]args)
{
HashMap<Integer,String> map = new HashMap<Integer,String>();
map.put(8,"Mud");
map.put(1,"Ground");
map.put(3,"Grass");
map.put(8,"Field");
//trying duplicates element
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+ " " +m.getValue());
}
}
}
