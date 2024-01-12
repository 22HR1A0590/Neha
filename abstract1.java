abstract class Animal{
public abstract void sound();}
class Dog extends Animal{
public void sound(){
System.out.println("woof");
}}
class Lion extends Animal{
public void sound(){
System.out.println("roars");
}}
class Cat extends Animal{
public void sound(){
System.out.println("meows");
}}
class Test{
public static void main(String args[])
{
Animal obj;
obj=new Dog();
obj.sound();
obj=new Lion();
obj.sound();
obj=new Cat();
obj.sound();
}}