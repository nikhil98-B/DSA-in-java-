import java.util.*;
class Binarystring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        StringBuilder sb = new StringBuilder(sc.next());
        int count =0;
        
        
            for(int i =0;i<sb.length();i++){
                for(int j=i+1;j<sb.length();j++){
                     if(sb.charAt(i)=='1'&& sb.charAt(j)=='1'){
                     
                        count++;
                           
                   
                 

            }
                }
               
           
         }
           
        
         System.out.println(count);
        
          
    }
}
