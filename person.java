class Person{
public void move(){
System.out.println(" yamuna is human");
}}
class People extends Person{
public void move()
{
System.out.println("latha can run");}}
class Test{
public static void main(String args[])
{
Person a=new Person();
Person b=new People();
a.move();
b.move();
}}