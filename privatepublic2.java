class Student{
private int id;
private String name;
public void setId(int id)
{this.id=id;}
public void setName(String name)
{this.name=name;}
public int getId()
{return this.id;}
public String getName()
{return this.name;}}
class Day4Program{
public static void main(String args[]){
Student[]obj=new Student[3];
obj[0]=new Student;
obj[0].setId(1111);
obj[0].setName("test");
System.out.println("ID:"+obj[0].getId());
System.out.println("Name:"+obj[0].getName());
 obj[1]=new Student;
obj[1].setId(260634);
obj[1].setName("neha");
System.out.println("ID:"+obj[1].getId());
System.out.println("Name:"+obj[1].getName());
 obj[2]=new Student;
obj[2].setId(59035);
obj[2].setName("varshitha");
System.out.println("ID:"+obj[2].getId());
System.out.println("Name:"+obj[2].getName())
}}