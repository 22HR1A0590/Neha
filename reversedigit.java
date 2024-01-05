import java.util.Scanner;
class ReverseDigits
{
public static void main(String arsg[])
{
Scanner sc=new Scanner(System.in);
int n;
int rd=0;
System.out.println("enter any positive integer");
n=sc.nextInt();
while(n>0){
rd=rd*10+n%10;
n=n/10;
}
System.out.println(rd);

}
}