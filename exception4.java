import java.util.Scanner;
class prog{
public static void main(String args[]){
int[] num={11,22,33,44,55};
try{
for(int i=0;i<5;i++){
System.out.println(num[i]);}}
catch(ArithmaticException e){
System.out.println(e+" one1");}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e+" two2");
}
catch(Exception ob){
System.out.println(ob+" three3");
}
System.out.println("thankyou");}}