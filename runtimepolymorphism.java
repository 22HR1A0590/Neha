class Animal{
public void move(){
System.out.println("animals can move");
}}
class Dog extends Animal{
public void move()
{
System.out.println("dogs can walk and run");}}
class Test{
public static void main(String args[])
{
Animal a=new Animal();
Animal b=new Dog();
a.move();
b.move();
}}