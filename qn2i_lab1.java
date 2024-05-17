
package lab1;

import java.util.Scanner;

public class qn2i_lab1 {
     public static void main(String[] args) {
     
         int i,n,flag=0;
         System.out.println("enter the number to check the prime number: ");
         Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         
         
         for(i=2;i<n;i++) {
         if(i%i==0){//it check wheather the number is divided by other number except 1 and itself
         flag=1;
         }
         }
         if(flag==0){
         System.out.println(" "+n+" is the prime number");
         }
         else{
         System.out.println(" "+n+" is not the prime number");
         }  } 
     }

