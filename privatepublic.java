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
}
}
