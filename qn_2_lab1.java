package lab1;
import java.util.Scanner;
public class qn_2_lab1 {
     public static void main(String[] args) {
     
         int i,n1,n2,flag=0,c=0;
        
         System.out.println("Enter the range of the number to check the prime number\n");
         Scanner sc= new Scanner(System.in);
         do{
             if(c!=0){
             System.out.println("For your kind information negative and zero are not ");
             System.out.println("the prime number so enter the range of positive number");
             }
         System.out.println("From");
         n1=sc.nextInt();
         System.out.println("To");
         n2=sc.nextInt();
         c++;
         }while(n1<=0||n2<=0);
          
         c=0;
         System.out.print("The prime number in the range of "+n1+" and "+n2+" are ");
         for(int j=n1;j<=n2;j++){//for range 
         for(i=2;i<j;i++){
         if(j%i==0){//it check wheather the number is divided by other number except 1 and itself
         flag=1;
         }}
         if(flag==0){
             if(c!=0)  System.out.print(" , "+j);
             else  System.out.print(j);
        c++;
         }
         flag=0;}
     System.out.print("\n");
     }}



