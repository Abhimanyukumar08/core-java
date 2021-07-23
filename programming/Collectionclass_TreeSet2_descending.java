import java.util.*;

class Collectionclass_TreeSet2_descending
{
public static void main(String[]args){

TreeSet<String> td = new TreeSet<String>();
td.add("Ravi");
td.add("Vijay");
td.add("Ajay");
System.out.println("Traversing element through iterator in descending order");
Iterator<String> itr = td.descendingIterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}