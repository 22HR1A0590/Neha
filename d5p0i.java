import java.util.Scanner;
class InputDayNumber1{
public static void displayDay(int n)
{
switch(n){
case 0:System.out.println("SUNDAY");
case 1:System.out.println("MONDAY");
case 2:System.out.println("TUESDAY");
case 3:System.out.println("WEDNESDAY");
case 4:System.out.println("THURSDAY");
case 5:System.out.println("FRIDAY");
case 6:System.out.println("FRIDAY");
case 7:System.out.println("SATURDAY");
default:System.out.println("INVALID");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int dn;
dn=sc.nextInt();
displayDay(dn);
}
}