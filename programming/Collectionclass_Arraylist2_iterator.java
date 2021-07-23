import java.util.*;
public class Collectionclass_Arraylist2_iterator
{
public static void main(String[]args)
{
ArrayList<String> list = new ArrayList<String>();
list.add("fruits");
list.add("weapons");
list.add("vegetables");
list.add("houses");
//Traversing list through iterator
Iterator itr = list.iterator();//getting the iterator
while(itr.hasNext())//check if the iterator has the elements
{
System.out.println(itr.next());//print the element and move to the next
}
}
}
