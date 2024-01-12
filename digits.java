 import java.util.*;
class CharAtEx{
ArrayList<Character>al;
CharAtEx(){
al=new ArrayList<Character>();
al.add('0');al.add('1');al.add('2');al.add('3');al.add('4');
al.add('5');al.add('6');al.add('7');al.add('8');al.add('9');
}
private boolean isVowel(char c)
{
for(int i=0;i<al.size();i++){
if(c==al.get(i)){
return true;}}
return false;}
public int countVowels(String s)
{
int countVowel=0;
int size=s.length();
for(int j=0;j<size;j++)
{
char c=s.charAt(j);
if(isVowel(c)){
countVowel=countVowel+1;
}}return countVowel;}
public static void main(String args[]){
CharAtEx ob=new CharAtEx();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int noOfVowel=ob.countVowels(str);
System.out.println("String:"+str);
System.out.println("total number of Digits in the string are:"+noOfVowel+"\n");
}} 







