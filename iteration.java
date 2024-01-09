import java.util.Iterator;
import java.util.Vector;
class Main{
public static void main(String args[])
{
Vector<String>animals=new Vector<>();
animals.add("dog");
animals.add("horse");
animals.add("cat");
String element=animals.get(2);
System.out.println("elements at index 2:"+element);
Iterator<String>iterate=animals.iterator();
System.out.println("Vector");
while(iterate.hasNext())
{
System.out.println(iterate.next());
 }}}
