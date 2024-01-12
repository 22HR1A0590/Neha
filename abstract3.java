abstract class Bike{
abstract void run();}
class honda extends Bike{
void run()
{
System.out.println("running safely");
}}
class Test{
public static void main(String args[]){
Bike ob=new honda();
ob.run();
}}