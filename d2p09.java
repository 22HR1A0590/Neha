class Square
{
int length;
void insert(int l){
length=l;
}
void calculateArea()
{
System.out.println(length*length);}
}
class TestSquare1{
public static void main(String args[])
{
Square s1=new Square();
s1.insert(15);
s1.calculateArea();
}
}  