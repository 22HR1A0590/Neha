class Student
{
private int id;
private String name;
public void setId(int id)
{this.id=id;}
public void setName(String name)
{this.name=name;}
public int getId()
{return this.id;}
public String getName()
{return this.name;}
}
class Day4Program{
public static void main(String args[])
{

Student obj1=new Student();
obj1.setId(1111);
obj1.setName("test");
System.out.println("ID:"+obj1.getId());
System.out.println("Name:"+obj1.getName());
Student obj2=new Student();
obj2.setId(260634);
obj2.setName("neha");
System.out.println("ID:"+obj2.getId());
System.out.println("Name:"+obj2.getName());
Student obj3=new Student();
obj3.setId(59035);
obj3.setName("varshitha");
System.out.println("ID:"+obj3.getId());
System.out.println("Name:"+obj3.getName());


}
}