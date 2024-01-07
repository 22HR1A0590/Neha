//function without arguments and without return value//

class Demo
{
public void displayMenu()
{
System.out.println("+:Addition");
System.out.println("-:Substraction\n*:multiplication");
System.out.println("/:Division");
}
}
class Test
{
public static void main(String args[])
{
Demo ob=new Demo();
ob.displayMenu();
} 
}