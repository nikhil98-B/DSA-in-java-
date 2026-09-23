import java.util.*;
class Cons {
     public static void main(String args []){
        Scanner sc = new Scanner (System.in);
      int arr[] =new int[5];
      for(int i = 0;i<arr.length;i++){
        System.out.print("enter the value  ");
        arr[i] =sc.nextInt();
      } 
      int result =0;
     
       
        
        for(int i =0;i<arr.length;i++){
           int rev =0;
          int num =arr[i];
          while(num!=0){


          result = num%10;
          rev = rev*10 + result;
          num =num/10;
         
          }
           System.out.println(rev);
          

          
        }
        
     
    }
}