class C{
public void display(){
System.out.println("method of class C");
}}
class A extends C{
public void display(){
System.out.println("method of class A");
}}
class B extends C{
public void display(){
System.out.println("method of class B");
}}
class D extends A{
public void display(){
System.out.println("method of class d");
}
public static void main(String args[]){
D ob=new D();
ob.display();
}}