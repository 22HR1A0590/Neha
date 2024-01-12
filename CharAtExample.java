import java.util.*;
class CharAtEx{
ArrayList<Character>al;
CharAtEx(){
al=new ArrayList<Character>();
al.add('a');al.add('e');al.add('i');al.add('o');al.add('u');
al.add('A');al.add('E');al.add('I');al.add('O');al.add('U');
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
System.out.println("total number of Vowels in the string are:"+noOfVowel+"\n");
}} 






