import java.util.Scanner;
class InputDay1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int dn;
dn=sc.nextInt();
if(dn==0){System.out.println("JANUARY");}
else if(dn==1){System.out.println("FEBRUARY");}
else if(dn==2){System.out.println("MARCH");}
else if(dn==3){System.out.println("APRIL");}
else if(dn==4){System.out.println("JUNE");}
else if(dn==5){System.out.println("JULY");}
else if(dn==6){System.out.println("AUGUST");}
else if(dn==7){System.out.println("SEPTEMBER");}
else if(dn==8){System.out.println("OCTOBER");}
else if(dn==9){System.out.println("NOVEMBER");}
else if(dn==10){System.out.println("DECEMBER");}
else{System.out.println("INVALID");}
}}