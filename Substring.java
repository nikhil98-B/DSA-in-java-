import java.util.*;
class Substring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");

        StringBuilder sb = new StringBuilder(sc.next());
        System.out.print("enter the sub string :");
          StringBuilder sub = new StringBuilder(sc.next());
          int count =0;
        for(int i=0;i<=sb.length()-sub.length();i++){
            count=0;
            for(int j =0;j<sub.length();j++){
                if(sb.charAt(i+j)==sub.charAt(j)){
                     count++;
                }
            }
        }
       if(count==sub.length()){
            System.out.println("it is substring ");
        }
        else{
            System.out.println("not a substring ");
        }
    }
}
