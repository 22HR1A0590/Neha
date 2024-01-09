import java.util.*;
class testjava{
public static void main(String args[]){
Stack<String>stack=new Stack<String>();
stack.push("varshitha");
stack.push("neha");
stack.push("sony");
stack.push("varshu");
stack.push("varsh");
stack.pop();
Iterator<String>itr=stack.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}}}