//this program concentrates on string class and its method
//creation of string
//String concatination
//string buffer

package mystrings;

class StringLearn{
String st1,st2,st3;
//create constructor
//whenever object of the class is created constructor block is invoked 
StringLearn(){System.out.println("I am StringLearn class");}
//create a parameterised constructor
StringLearn(String st1,String st2,String st3){
this.st1=st1;//when current class instant variable and local variables are same "this" keyword is used.
this.st2=st2;
this.st3=st3;}
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
}
void stringComparison(){
System.out.println("Comparison of String using '.equals': Sachin.equals(sachin)= "+st1.equals(st2));
System.out.println("Comparison of String using '.equals': Sachin.equals(Dravid)= "+st1.equals(st3));
System.out.println("Comparison of String using 'ComparedTo': Sachin.ComparedTo(Sachin)= "+st1.compareTo(st2));
System.out.println("Comparison of String using 'ComparedTo': Sachin.ComparedTo(Dravid)= "+st1.compareTo(st3));

}
//String buffer is used to create mutable string
//this method belongs to class memory 
static void StringBufferExample(){
StringBuffer sb=new StringBuffer("Sachin");
sb.append("Tendulkar");
System.out.println("StringBuffer is used to create mutable string(example) : "+ sb);}

static void StringBuilderExample(){
StringBuilder sB=new StringBuilder("Hello");
sB.insert(1,"Java");
System.out.println("StringBuilder also creats mutable string more efficient than StringBuffer : "+ sB);}
}

