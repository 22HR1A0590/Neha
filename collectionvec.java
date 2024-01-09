import java.util.*;
public class VectorEx{
public static void main(String args[])
{
Vector<String>vec=new Vector<String>(4);
vec.add("tiger");
vec.add("lion");
vec.add("dog");
vec.add("elephant");
System.out.println("Size is:"+vec.size());
System.out.println("default capacity is:"+vec.capacity());
System.out.println("vector element:"+vec);
vec.addElement("rat");
vec.addElement("cat");
vec.addElement("deer");
System.out.println("size after addition:"+vec.size());
System.out.println(capacity after addition is:"+vec.capacity()):
System.out.println("elements are:"+vec);
if(vec.contains("tiger")){
System.out.println("tiger is present at the index"+vec.indexOf("tiger"));
}
else
{
System.out.println("tiget is not present in list");
}
System.out.println("the first animal of vector is="+vec.firstElement());
System.out.println("the first animal of vector is="+vec.firstElement());
}}