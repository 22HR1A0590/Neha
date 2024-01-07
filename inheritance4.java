class Animal{
void eat(){
System.out.println("eating.....");}
}
class Dog extends Animal{
void bark(){
System.out.println("baring...");
}
}
class Cat extends Animal{
void meow(){System.out.println("mewoing....");}
}
class TestInheritance3{
public static void main(String args[]){
Cat c=new Cat();
c.meow();
c.eat();
}}