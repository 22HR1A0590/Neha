import java.util.Scanner;
class SumDigits
{
public static void main(String arsg[])
{
Scanner sc=new Scanner(System.in);
int n;
int sd=0;
System.out.println("enter any positive integer");
n=sc.nextInt();
while(n>0)
{
sd=sd+n%10;
n=n/10;
}
System.out.println(sd);

}
}  