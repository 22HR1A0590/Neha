import java.util.Vector;
class Main{
public static void main(String args[]){
Vector<String>friends=new Vector<>();
//using the add()
friends.add("neha");
friends.add("varshitha");
//using index number
friends.add(2,"sony");
System.out.println("Vector:"+friends);
//using addAll()
Vector<String>friend=new Vector<>();
friend.add("varshi");
friend.addAll(friends);
System.out.println("New Vector:"+friend);
}
}