import java.util.Vector;
class Main{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
//using the add()
mammals.add("dog");
mammals.add("horse");
//using index number
mammals.add(2,"cat");
System.out.println("Vector:"+mammals);
//using addAll()
Vector<String>animals=new Vector<>();
animals.add("crocodile");
animals.addAll(mammals);
System.out.println("New Vector:"+animals);
}
}