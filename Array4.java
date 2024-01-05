class Main{
public static void main(String args[])
{
int numbers []={2,-9,8,6,-67,87,65};
int sum=0;
Double average;
for(int number:numbers){
sum+=number;
}
int arrayLength=numbers.length;
average=((double)sum/(double)arrayLength);
System.out.println("sum="+sum);
System.out.println("Avarage="+average);
}
}