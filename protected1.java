class Person{
protected String fname="john";
protected String lname="doe";
protected int age=24;
}
class Student extends Person{
private int graduationYear=2018;
public static void main(String args[]){
Student myObj=new Student();
System.out.println("name:"+myObj.fname+" "+myObj.lname);
System.out.println("age:"+myObj.age);
System.out.println("graduation year:"+myObj.graduationYear);
}}