class Animal{
Animal(){
System.out.println("animal is created");}}
class Dog extends Animal{
Dog(){
super();
System.out.println("dogis created");
}}
class TestSuper3{
public static void main(String args[]){
Dog d=new Dog();
}}