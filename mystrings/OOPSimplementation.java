//this program concentrates on OOPS concepts such as iheritance and polymorphism
package mystrings;
class Oops extends StringLearn {
//through extend keyword we could inherit StringLearn class into Oops class
static{System.out.println("i am a static block inside Oops class ");}
public static void main(String args[]){
//create instance of Oops class
Oops oop=new Oops();
oop.tocreatestring();
oop.toconcate();

//to use parameterised constructor os StringLearn class
StringLearn sl=new StringLearn("Sachin","Sachin","Dravid");
sl.stringComparison();
StringBufferExample();//since StringBufferExample(); method is made static we need not create instance of the class
StringBuilderExample();}
}

