 class A{
public static void funA1(){
System.out.println("fun a1 called from class a");
}
public static void funA2(){
System.out.println("funa2 called from class a");
}
}
class B
{
public static void main(String args[]){
A.funA1();
A.funA2();
}
}
