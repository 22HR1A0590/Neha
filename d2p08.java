
class Employee{
int id;
String name;
String department;
void insertRecord(int i,String n,String d){
id=i;
name=n;
department=d;
}
void displayInformation(){
System.out.println(id+" "+name+" "+department);
}
}
class TestEmployee1{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(111,"karan","CSE");
e2.insertRecord(222,"aryan","ECE");
e3.insertRecord(333,"ayan","EEE");
e1.displayInformation();
e2.displayInformation();
e3.displayInformation();
}
}