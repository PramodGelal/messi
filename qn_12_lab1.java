
package lab1;
import java.util.Scanner;

class Player{
int jersynumber,score;
String name;
Player(){
System.out.println("PLayerrelated  detail is here ");
}}
class Football extends Player{
    Football(){
     super();
    }
void inputinfo(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the name of player: ");
name=sc.nextLine();
System.out.println("enter the jersynumber ");
jersynumber=sc.nextInt();
System.out.println("enter the score scored by the player ");
score=sc.nextInt();}
void displayinfo(){
   
System.out.print("Player name is "+name+" and  jersynumber is "+jersynumber);
System.out.println("and he score "+score);
}}
public class qn_12_lab1 {
    public static void main(String []args){
 Football ft=new Football();
 ft.inputinfo();
 ft.displayinfo();}}
