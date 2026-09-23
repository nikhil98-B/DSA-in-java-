 import java.util.*;
 public class New {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the integer value : ");
    
   int n = sc.nextInt();
   int num =0;
   int k=0;
   int place =1;
   while(n!=0){
    num = n%10;
    n=n/10;
    if(num==0){ 
      num =5;
      
      
       }
       k = k +num*place;
       place = place * 10;
        
     
    
   }
   System.out.println(k);
     
  }
 }