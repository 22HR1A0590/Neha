class B{
public static void main(){
System.out.println("main method without arrguments called");
}
public static void main(int x){
System.out.println("main method with arrguments called"+x*2);
}
public static void main(String s){
System.out.println("welcome" +s);
}
public static void main(String args[]){
System.out.println("neha is typing.....");
main();
main("neha");
main(24);
}
}


