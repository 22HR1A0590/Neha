import java.util.Scanner;
class Search_Element2
{
public static void main(String args[])
{
int n, i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of  the elements you want in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
// code for sorting
for(i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]>a[j])//swap a[i] and a[j]
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}//for loop inner
}//for loop outer
// display array
for(int x : a)
System.out.print(x+" ");
}
}