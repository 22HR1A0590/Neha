
import java.util.Scanner;
public class CountDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++){
if((str.CharAt(i)=='0')||(str.CharAt(i)=='1')||
(str.CharAt(i)=='2')||(str.CharAt(i)=='3')||
(str.CharAt(i)=='4')||(str.CharAt(i)=='5')||
(str.CharAt(i)=='6')||(str.CharAt(i)=='7')||
(str.CharAt(i)=='8')||(str.CharAt(i)=='9')){
count++;
}
}
System.out.println(count);
}
}
