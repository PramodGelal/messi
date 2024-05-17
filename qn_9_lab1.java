package lab1;
import java.util.Scanner;
abstract class draw{
    int l,b,h;
void inputparameter(){}
void display(){}}
class rectangle extends draw {
@Override
void inputparameter(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of rectangle: ");
l=sc.nextInt();
System.out.print("enter the breadth of rectangle:");
b=sc.nextInt();
}
@Override
void display(){
System.out.println("Rectangle diemension length = "+l+" breadth = "+b);
}}
class triangle extends draw{@Override
void inputparameter(){
    Scanner sc=new Scanner(System.in);
System.out.println("enter the base of triangle ");
b=sc.nextInt();
System.out.println("enter the height of triangle: ");
h=sc.nextInt();}@Override
void display(){
System.out.println("Triangle diemension base = "+b+" height= "+h);
}}public class qn_9_lab1 {
    public static void main(String [] args){
    rectangle rect=new rectangle();
    triangle tri=new triangle();
    rect.inputparameter();
    tri.inputparameter();
    rect.display();
    tri.display();}}
