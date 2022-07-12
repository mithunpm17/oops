import java.util.*;
class LinkedHashSet2
{
public static void main(String args[])
{
LinkedHashSet<String>set=new LinkedHashSet();
set.add("one");
set.add("two"); 
set.add("three");
set.add("four");
set.add("five");
Iterator<String>i=set.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}
