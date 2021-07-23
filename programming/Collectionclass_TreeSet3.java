import java.util.*;

class Collectionclass_TreeSet3
{
public static void main(String[]args)
{
TreeSet<Integer> set = new TreeSet<Integer>();
set.add(34);
set.add(232);
set.add(90);
set.add(23);
System.out.println("Lowest Value "+ set.pollFirst());
System.out.println("Highest Value "+set.pollLast());
}
}
