//Java program how to define a class
//create variable
//create an object or instance
//To take user inputs
import java.util.Scanner;

class student{
int id;//instant variable declared inside class but outside main
String name;
//cewate main method
//public static void main(String[] args){
public static void main(String args[]){  
Scanner sc=new Scanner(System.in);
//create object or instance
student s=new student();
System.out.println("Enter the name of Student");
s.name=sc.nextLine();
System.out.println("Enter the ID number");
s.id=sc.nextInt();
System.out.println("Student name: "+s.name+" Student id: "+s.id);
}
}
