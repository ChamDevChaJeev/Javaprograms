//this program concentrates on string class and its method
//creation of string

package mystrings;

class StringLearn{
void tocreatestring(){
//string can be created in 3 ways
String s1="Welcome";
char[] ch={'t','o'};
String s2=new String(ch);
String s3=new String("Java Strings");
System.out.println(s1+" "+s2+" "+s3);
}
void toconcate(){
String s1="Rahul";
String s2="Dravid";
String s3=s1+s2;
System.out.println("String Concatination using +: Rahul+Dravid= " + s3);
System.out.println("String Concatenation using .concate()= "+s1.concat(s2));
}}
