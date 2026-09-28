import java.util.*;
class Palindrom {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        StringBuilder sb = new StringBuilder(sc.next());
        int start =0;
        int count =0;
        
        boolean flag = false;
        int end = sb.length()-1;
        for(int i=0;i<sb.length()/2;i++){
            if(sb.charAt(start)==sb.charAt(end)){
                count++;

                
            }
            start++;
            end--;
        }
       if(count == sb.length()/2){
    flag = true;
}

      System.out.println(flag);
    }
       
}
