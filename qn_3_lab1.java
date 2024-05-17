package lab1;
import java.util.Scanner;
class Student{
    String name="Ram";
int math,science,computer;
Student(){
}//default constructor
Student(String name){//parametrized constructor
this.name=name;
}
void input(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the mark obtain in math:");
math=sc.nextInt();
System.out.println("Enter the mark obtain in science:");
science=sc.nextInt();
System.out.println("Enter the mark obtain in computer:");
computer=sc.nextInt();}
void display(){
System.out.println("Display the Result of "+name );
System.out.println("Math= "+math+" Science= "+science+" Computer= "+computer);}}
public class qn_3_lab1 {
   public static void main(String[] args) {
       Student stu=new Student();//object decleration default constructor is called
       stu.input();stu.display();//default value of name is display
       Student stu1=new Student("Pramod"); //parametrized constructor is called
       stu1.input();
       stu1.display();//parametrized value of name is display
   }  
}
