package lab1;
import java.util.Scanner;
public class qn_10_lab1 {
   static float area(int l,int b){
return l*b;}
   static  float area(int b,float h){
    return ((b*h)/2);
    }
   static float area( float r){
    return (float) (3.14*r*r);
    }
public static void main(String []agrs){
Scanner sc=new Scanner(System.in);
int b,l;
float r,a;
System.out.println("enter the radius of circle: ");
r=sc.nextFloat();
a=area(r);
System.out.println("the area of circle of radius "+r+" is "+a);
System.out.println("enter the length of rectangle ");
l=sc.nextInt();
System.out.println("enter the breadth of rectangle");
b=sc.nextInt();
System.out.println("the area of rectangle having length  "+l+" and breadth "+b+" is "+area(l,b));
System.out.println("enter the height of triangle ");
float h1=sc.nextInt();
System.out.println("enter the base of triangle");
b=sc.nextInt();
System.out.println("the area of triangle having height  "+h1+" and base "+b+" is "+area(b,h1));
}}








