import java.util.Scanner;
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
Scanner sc=new Scanner(System.in);
Student[] obj=new Student[3];
for(int i=0;i<3;i++){
obj[i]=new Student();
obj[i].setId(sc.nextInt());
obj[i].setName(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<3;j++){
System.out.println("ID:"+obj[j].getId());
System.out.println("Name:"+obj[j].getName());
}}}