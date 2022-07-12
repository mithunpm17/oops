import java.util.*;
public class JavaExample 
{
public static void main(String args[]) 
{
ArrayList<String> obj = new ArrayList<String>();
obj.add("Ajeet");
obj.add("Harry");
obj.add("Chaitanya");
obj.add("Steve");
obj.add("Anuj");
System.out.println("Original ArrayList:");
for(String str:obj)
System.out.println(str);
obj.add(0,"Rahul");
obj.add(1,"Justin");
System.out.println("ArrayList after add operation:");
for(String str:obj)
System.out.println(str);
obj.remove("Chaitanya"); //Removes &quot;Chaitanya&quot; from ArrayList
obj.remove("Harry"); //Removes &quot;Harry&quot; from ArrayList
System.out.println("ArrayList after remove operation:");
for(String str:obj)
System.out.println(str);
obj.remove(1); //Removes Second element from the List
System.out.println("Final ArrayList:");
for(String str:obj)
System.out.println(str);
}
}
